package com.tiy.hospital;

/**
 * Created by Brett on 8/17/16.
 */
public class Pulmonologist extends HospitalDoctor implements Surgeon{
	public Pulmonologist(String firstName, String lastName, String college) {
		super(firstName, lastName, college);
	}

//	public Diagnosis diagnose() {
//		return new Diagnosis(Diagnosis.LUNG_CANCER);
//	}

	public int diagnose() {
		return 1;
	}
	public boolean operate(Patient patient) {
		patient.setSick(false);
		return true; // successful operation
	}
}
