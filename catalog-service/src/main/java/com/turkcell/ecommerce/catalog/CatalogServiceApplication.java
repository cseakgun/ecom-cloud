package com.turkcell.ecommerce.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import com.turkcell.ecommerce.common.config.GlobalConstants;

/**
 * @author Selahaddin Akgun
 */
@EnableEurekaClient
@ComponentScan(GlobalConstants.BASE_PACKAGE)
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class, DataSourceAutoConfiguration.class })
@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}
}
