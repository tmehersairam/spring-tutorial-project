package com.fis;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.entity.Person;

/**
 * Hello world!
 *
 */
public class App {

	static ConfigurableApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("config.xml", "configuration-config.xml",
				"config2.xml");

		Person person = (Person) applicationContext.getBean("person1");

		System.out.println(person);

		applicationContext.close();

	}

	public static void method() {
//		Student stu1 = (Student) applicationContext.getBean("stu1");
//		System.out.println(stu1);
//
//		Student stu2 = (Student) applicationContext.getBean("stu2");
//		Configuration configuration = (Configuration) applicationContext.getBean("configuration1");
//		System.out.println(stu2);
//		System.out.println(configuration);
	}
}
