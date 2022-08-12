package com.fis.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Company {

	private String name;

	private List<Person> persons;

	@Autowired
	private List<String> subsideries;

	@Autowired
	private Map<Integer, String> locations;


	@Autowired
	Company(List<Person> persons) {
		this.persons = persons;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getPerson() {
		return persons;
	}

	public void setPerson(List<Person> person) {
		this.persons = person;
	}

	public List<String> getSubsideries() {
		return subsideries;
	}

	public void setSubsideries(List<String> subsideries) {
		this.subsideries = subsideries;
	}

	public Map<Integer, String> getLocations() {
		return locations;
	}

	public void setLocations(Map<Integer, String> locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", persons=" + persons + ", subsideries=" + subsideries + ", locations="
				+ locations + "]";
	}

}
