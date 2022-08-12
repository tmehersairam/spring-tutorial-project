package com.fis.spel;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{22}")
	private int a;

	@Value("#{T(Math).E}")
	private int b;

	@Value("#{new String('Nick')}")
	private String name;

	@Value("#{232 + 44 * 232}")
	private int d;

	@Value("#{10 > 7 }")
	private boolean isValid;

	@Value("#{{'2342','23423','2342'}}")
	private List<String> list;

	@Value("#{{1:'2342',2:'23423',3:'2342'}}")
	private Map<Integer, String> map;

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + ", name=" + name + ", d=" + d + ", isValid=" + isValid + ", list=" + list
				+ ", map=" + map + "]";
	}

}
