package com.turkcell.ecommerce.common.logging.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.turkcell.ecommerce.common.logging.LoggingAspect;

/**
 * @author Selahaddin Akgun
 */
@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfiguration {
	@Bean
	public LoggingAspect loggingAspect() {
		return new LoggingAspect();
	}
}
