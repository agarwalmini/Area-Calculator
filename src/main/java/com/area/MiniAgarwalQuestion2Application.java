package com.area;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.area.*")
public class MiniAgarwalQuestion2Application {

	public static void main(String[] args) {
		SpringApplication.run(MiniAgarwalQuestion2Application.class, args);
	}

}
