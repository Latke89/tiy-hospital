package com.tiy.hospital;

/**
 * Created by Brett on 8/17/16.
 */
public class GeneralPractitioner extends HospitalDoctor{

	public GeneralPractitioner(String firstName, String lastName, String college) {
		super(firstName, lastName, college);
	}

//	public Diagnosis diagnose(int myDiagnosis) {
//		return new Diagnosis(Diagnosis.COMMON_COLD);
//	}

		public int diagnose() {
		return 3;
	}



}
