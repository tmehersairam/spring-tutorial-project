package com.fis.annotation;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/fis/annotation/xmlannotation-config.xml");
		Company company1 = applicationContext.getBean("company1", Company.class);
		System.out.println(company1);
		Company company2 = applicationContext.getBean("company2", Company.class);
		System.out.println(company2);
		Company company3 = applicationContext.getBean("company3", Company.class);
		System.out.println(company3);
		Company company4 = applicationContext.getBean("company4", Company.class);
		System.out.println(company4);

		List<String> list = new LinkedList<>();
	}
}
