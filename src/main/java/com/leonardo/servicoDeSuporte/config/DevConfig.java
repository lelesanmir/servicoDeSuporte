package com.leonardo.servicoDeSuporte.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leonardo.servicoDeSuporte.services.DBService;

@Configuration
@Profile("test")
public class DevConfig {

	@Autowired
	private DBService dbService;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;

	@Bean
	public void instanciaDB() {
		this.dbService.instanciaDB();
	}
}
