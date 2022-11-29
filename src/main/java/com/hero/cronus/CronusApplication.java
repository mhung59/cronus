package com.hero.cronus;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class CronusApplication {

	@Value("${cloudinary.cloudName}")
	private String cloudName;

	@Value("${cloudinary.apiKey}")
	private String apiKey;

	@Value("${cloudinary.apiSecret}")
	private String apiSecret;

	public static void main(String[] args) {
		SpringApplication.run(CronusApplication.class, args);
	}

	@Bean
	public Cloudinary cloudinaryConfig() {
		Cloudinary cloudinary = null;
		Map<String, String> config = new HashMap<>();
		config.put("cloud_name", cloudName);
		config.put("api_key", apiKey);
		config.put("api_secret", apiSecret);
		cloudinary = new Cloudinary(config);
		return cloudinary;
	}

}
