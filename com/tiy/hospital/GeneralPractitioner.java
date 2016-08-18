package com.tiy.hospital;

/**
 * Created by Brett on 8/17/16.
 */
public class GeneralPractitioner extends HospitalDoctor implements Surgeon {

	public GeneralPractitioner(String firstName, String lastName, String college) {
		super(firstName, lastName, college);
	}

	Diagnosis coldDiagnose = new Diagnosis(3);

	public Diagnosis diagnose() {
		if (coldDiagnose.this.illness = 3);
		return new Diagnosis(Diagnosis.COMMON_COLD);
	}

	public boolean operate(Patient patient) {
		patient.setSick(false);
		return true; // successful operation
	}
}
