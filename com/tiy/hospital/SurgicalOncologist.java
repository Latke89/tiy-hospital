package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class SurgicalOncologist extends HospitalDoctor implements Surgeon {

    public SurgicalOncologist(String firstName, String lastName, String college) {
        super(firstName, lastName, college);
    }

//    public Diagnosis diagnose() {
//        return new Diagnosis(Diagnosis.BRAIN_CANCER);
//    }
    public int diagnose() {
        return 2;
    }

    public boolean operate(Patient patient) {
        patient.setSick(false);
        return true; // successful operation
    }
}
