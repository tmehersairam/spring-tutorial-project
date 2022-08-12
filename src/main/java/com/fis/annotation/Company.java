package com.fis.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {

	private String name;

	@Autowired
	private Person person;

	public Company() {
		super();
	}

	public Company(String name, Person person) {
		super();
		this.name = name;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", person=" + person + "]";
	}

}
