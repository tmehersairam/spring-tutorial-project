package com.fis.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {

	private String name;
	private Company company;

	public Person() {
		super();
	}

	public Person(String name, Company company) {
		super();
		this.name = name;
		this.company = company;
	}

	public void init() {
		System.out.println("Init method of person- using xml");
	}

	public void destroy() {
		System.out.println("Destory method of person- using xml");
	}

	@PostConstruct
	public void start() {

		System.out.println("Init method of person- using annotation");
	}

	@PreDestroy
	public void end() {

		System.out.println("destroy method of person- using annotation");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", company=" + company + "]";
	}

}
