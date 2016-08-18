package com.tiy.hospital;

/**
 * Created by dbashizi on 8/16/16.
 */
public class Patient extends Person {
    int typeSymptom;

    public int getTypeSymptom() {
        return typeSymptom;
    }

    public void setTypeSymptom(int typeSymptom) {
        this.typeSymptom = typeSymptom;
    }

    private boolean isSick = true;

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }



}
