package com.estudo.springboot.springbootteste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;

@SpringBootApplication
public class SpringbootTesteApplication {



	public static void main(String[] args) {
		System.out.println("Iniciado aplicação ${PASSWORD_DB}");

		ArrayList<String> arr_stg = new ArrayList<String>();
		Object obj = new Object();


		SpringApplication app = new SpringApplication(SpringbootTesteApplication.class);
		app.run();
	}

}

