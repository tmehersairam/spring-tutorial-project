package com.fis.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/fis/component/xmlcomponent-config.xml");
		Company company1 = applicationContext.getBean("company", Company.class);

		System.out.println(company1);
		System.out.println("subsideries: " + company1.getSubsideries());
		System.out.println("locations: " + company1.getLocations());

	}
}
