package com.fis.annotation;

public class Person {

	private long empId;
	private String name;
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
