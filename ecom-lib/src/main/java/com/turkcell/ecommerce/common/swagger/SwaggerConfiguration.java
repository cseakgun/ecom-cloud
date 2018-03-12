package com.turkcell.ecommerce.common.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Selahaddin Akgun
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.turkcell.ecommerce")).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("Turkcell Ecommerce Microservices", "Ecommerce REST API", "1.0.0", "https://www.turkcell.com.tr",
				new Contact("Ecommerce Team", "https://www.turkcell.com.tr", "TEAM-DCSD-ECOMMERCE@turkcell.entp.tgc"), "Turkcell",
				"https://www.turkcell.com.tr", Collections.emptyList());
	}
}