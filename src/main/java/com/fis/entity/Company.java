package com.fis.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Company implements InitializingBean, DisposableBean {

	private String name;

	public Company() {
		super();
	}

	public Company(String name) {
		super();
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Init method of company- using interface");
	}

	@Override
	public void destroy() throws Exception {

		System.out.println("destroy method of company- using interface");

	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}

}
