package com.fis.util;

import java.util.Properties;

public class Configuration {

	private Properties dbProperties;

	public Configuration() {
		super();
	}

	public Configuration(Properties dbProperties) {
		super();
		this.dbProperties = dbProperties;
	}

	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}

	@Override
	public String toString() {
		return "Configuration [dbProperties=" + dbProperties + "]";
	}

}
