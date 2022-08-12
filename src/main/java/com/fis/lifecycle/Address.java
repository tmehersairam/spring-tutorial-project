package com.fis.lifecycle;

public class Address {

	private long pincode;
	private String city;

	public Address() {
		super();
	}

	public Address(long pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}

}
