package com.fis.utilprograms;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int studentId;
	private String name;
	private int age;
	Set<Integer> phoneNumbers;
	Map<Integer, String> courses;

	List<String> hobbies;
	Address address;

	public Student() {
		super();
	}

	public Student(int studentId, String name, int age, Set<Integer> phoneNumbers, Map<Integer, String> courses,
			List<String> hobbies, Address address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.phoneNumbers = phoneNumbers;
		this.courses = courses;
		this.hobbies = hobbies;
		this.address = address;
	}

	public Set<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<Integer> phoneNumbers) {
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

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	@Override
	public String toString() {
		return "Student [\n studentId=" + studentId + "\n name=" + name + "\n age=" + age + "\n phoneNumbers="
				+ phoneNumbers + "\n courses=" + courses + "\n hobbies=" + hobbies + "\n address=" + address + "\n]";
	}

}
