package com.fis.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		Company company1 = applicationContext.getBean(Company.class);
		company1.setName("TESLA");

		Company company2 = applicationContext.getBean(Company.class);
		company2.setName("TATA");
		System.out.println(company2);

	}
}
