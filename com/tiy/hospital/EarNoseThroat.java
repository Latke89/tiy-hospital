package com.tiy.hospital;

/**
 * Created by Brett on 8/17/16.
 */
public class EarNoseThroat extends HospitalDoctor implements Surgeon{

	public EarNoseThroat(String firstName, String lastName, String college) {
		super(firstName, lastName, college);
	}

	public Diagnosis diagnose() {
		return new Diagnosis(Diagnosis.STREP_THROAT);
	}

	public boolean operate(Patient patient) {
		patient.setSick(false);
		return true; // successful operation
	}
}