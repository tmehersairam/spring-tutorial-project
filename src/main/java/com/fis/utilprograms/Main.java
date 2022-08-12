package com.fis.utilprograms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.util.Configuration;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/fis/utilprograms/util-config.xml");
		Student student = applicationContext.getBean("student1", Student.class);
		System.out.println(student);

		Configuration configuration = applicationContext.getBean("configuration1", Configuration.class);
		System.out.println(configuration);
	}

}
