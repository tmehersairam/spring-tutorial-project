package com.fis.lifecycle;

import java.util.List;
import java.util.Map;

import com.fis.entity.Address;

public class Student {

	private int studentId;
	private String name;
	private int age;
	List<Integer> phoneNumbers;
	Map<Integer, String> courses;

	Address address;

	public Student() {
		super();
	}

	public Student(int studentId, String name, int age, List<Integer> phoneNumbers, Map<Integer, String> courses,
			Address address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.phoneNumbers = phoneNumbers;
		this.courses = courses;
		this.address = address;
	}

	public List<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public Map<Integer, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<Integer, String> courses) {
		this.courses = courses;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", phoneNumbers=" + phoneNumbers
				+ ", courses=" + courses + ", address=" + address + "]";
	}

}
