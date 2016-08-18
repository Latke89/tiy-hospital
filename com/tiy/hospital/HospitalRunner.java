package com.tiy.hospital;

import java.util.Scanner;

/**
 * Created by dbashizi on 8/16/16.
 */
public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("HospitalRunner.main() ...");
		Scanner inputScanner = new Scanner(System.in);

		Hospital thisHospital = new Hospital();
		System.out.println("Welcome to " + thisHospital.getHospitalName());
		System.out.println();
		System.out.println("Please choose a Doctor to visit");
		HospitalDoctor generalDoctor = new GeneralPractitioner("Bob", "Kelso", "MIT");
		Patient sickPatient = new Patient("Todd", "Quinlan");
		int menuChoice;


		if(true) {
			System.out.println("What are your symptoms?");
			System.out.println("1.Shortness of breath?");
			System.out.println("2.Constant migraines?");
			System.out.println("3.Runny nose?");
			System.out.println("4.Sore throat?");
			menuChoice = Integer.valueOf(inputScanner.nextLine());
			if (menuChoice == 1) {
				sickPatient.typeSymptom = 1;
			} else if (menuChoice == 2) {
				sickPatient.typeSymptom = 2;
			} else if (menuChoice == 3) {
				sickPatient.typeSymptom= 3;
			} else if (menuChoice == 4) {
				sickPatient.typeSymptom= 4;
			}
		}

		generalDoctor.diagnose(sickPatient.typeSymptom);
		System.out.println(generalDoctor.diagnose());





        HospitalDoctor firstDoc = new GeneralPractitioner("James", "Glavin", "MIT");
        Patient firstPatient = new Patient("David", "Polk");

        if (firstDoc instanceof GeneralPractitioner) {
            boolean success = ((GeneralPractitioner)firstDoc).operate(firstPatient);
            if (success) {
                System.out.println("Successful operation!");
            } else {
                System.out.println("Operation failed!!!");
            }
        }

        System.out.println("HospitalRunner.main() - done!");
    }
}
