package com.fis.scope;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Company {

	@Value("TESLA")
	private String name;

	@Autowired
	private Person person;

	@Value("#{subsideries}")
	private List<String> subsideries;

	@Value("#{locations}")
	private Map<Integer, String> locations;

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
		return "Company [name=" + name + ", person=" + person + ", subsideries=" + subsideries + ", locations="
				+ locations + "]";
	}

}
