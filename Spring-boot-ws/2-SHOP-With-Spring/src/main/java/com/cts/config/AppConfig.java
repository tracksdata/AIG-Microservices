package com.cts.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"application.properties"})
@ComponentScan("com.pricematrix,com.bill")
public class AppConfig {

	@Value("${name}")
	private String empName;

	@Bean
	public void test() {
		System.out.println("====> Name: " + empName);

	}

}
