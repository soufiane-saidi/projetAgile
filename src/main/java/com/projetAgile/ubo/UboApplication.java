package com.projetAgile.ubo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class UboApplication {

	public static void main(String[] args) {
		SpringApplication.run(UboApplication.class, args);
	}

}
