package com.tiy.hospital;

/**
 * Created by Brett on 8/17/16.
 */
public class EarNoseThroat extends HospitalDoctor{

	public EarNoseThroat(String firstName, String lastName, String college) {
		super(firstName, lastName, college);
	}

	public int diagnose() {
//		Diagnosis myDiagnosis = new Diagnosis();
		return 4;
//		return myDiagnosis.STREP_THROAT;
	}

}