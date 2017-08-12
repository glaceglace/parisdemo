package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
	
	@Bean
	public Docket productApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
				.paths(PathSelectors.regex("/api.*"))
				.build();
	}
	
	private ApiInfo apiInfo(){
				ApiInfo apiInfo = new ApiInfo(
		                "View Point REST API",
		                "Spring Boot REST API for View Point",
		                "1.0",
		                "Terms of service",
		                new Contact("Jingyuan", "https://www.google.fr/", "g@gmail.com"),
		               "Tomcat version 8.0",
		                "http://tomcat.apache.org/legal.html");
		        return apiInfo;
	}

}
