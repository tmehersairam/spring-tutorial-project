package com.fis.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fis.config")
public class Config {

	@Bean
	public List<String> subsideries() {

		return new ArrayList<String>(Arrays.asList("sub1"));
	}

	@Bean
	public Map<Integer, String> locations() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "texas");
		return map;
	}

}
