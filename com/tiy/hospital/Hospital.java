package com.tiy.hospital;

/**
 * Created by Brett on 8/17/16.
 */
public class Hospital {

	private String hospitalName = "The Best Damn Hospital";
	HospitalDoctor myDoctor = new Pulmonologist("John", "Dorian", "Harvard");

	public String getHospitalName() {
		return hospitalName;
	}

	public void makeDoctor() {

	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
}
