package com.hosipitalmanag.HospitalMang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class HospitalMangApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalMangApplication.class, args);
		System.out.println("spring is ruuning ");
	}

}
