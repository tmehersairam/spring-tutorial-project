package com.fis.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Person {

	@Value("1234")
	private long empId;
	@Value("norian")
	private String name;

	@Value("24")
	private int age;

	public Person() {
		super();
	}

	public Person(long empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [empId=" + empId + ", name=" + name + ", age=" + age + "]";
	}

}
