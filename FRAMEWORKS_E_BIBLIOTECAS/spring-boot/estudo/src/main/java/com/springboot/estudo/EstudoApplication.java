package com.springboot.estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class EstudoApplication {

	public static void main(String[] args) {

		SpringApplication.run(EstudoApplication.class, args);
	}

}
