package com.fis.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/fis/scope/scope-config.xml");
		Company company1 = applicationContext.getBean("company", Company.class);
		Company company2 = applicationContext.getBean("company", Company.class);

		System.out.println(company1);
		System.out.println(company2);

		System.out.println("company1 hashcode: " + company1.hashCode() + ", company2 hashcode: " + company2.hashCode());
		System.out.println("company1.person hashcode: " + company1.getPerson().hashCode()
				+ ", company2.person hashcode: " + company2.getPerson().hashCode());

	}
}
