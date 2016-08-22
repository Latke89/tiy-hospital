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

//		HospitalDoctor myDoctor = new HospitalDoctor();
//		Patient myPatient = new Patient();
		int doctorGen;
		System.out.println("How many Doctors are at " + thisHospital.getHospitalName());
		doctorGen = Integer.valueOf(inputScanner.nextLine());
		HospitalDoctor[] myDoctorArray = new HospitalDoctor[doctorGen];
		int docMenuChoice;

		for (int counter = 0; counter < doctorGen; counter++) {
			System.out.println("What Doctors are at this hospital?");
			System.out.println("1.General Practitioner");
			System.out.println("2.ENT");
			System.out.println("3.Pulmonologist");
			System.out.println("4.Surgical Oncologist");
			docMenuChoice = Integer.valueOf(inputScanner.nextLine());
			if (docMenuChoice == 1) {
				System.out.print("First Name: ");
				String firstName = inputScanner.nextLine();
				System.out.print("Last Name: ");
				String lastName = inputScanner.nextLine();
				System.out.println("College Attended");
				String college = inputScanner.nextLine();
				myDoctorArray[counter] = new GeneralPractitioner(firstName, lastName, college);
			} else if (docMenuChoice == 2) {
				System.out.print("First Name: ");
				String firstName = inputScanner.nextLine();
				System.out.print("Last Name: ");
				String lastName = inputScanner.nextLine();
				System.out.println("College Attended");
				String college = inputScanner.nextLine();
				myDoctorArray[counter] = new EarNoseThroat(firstName, lastName, college);
			} else if (docMenuChoice == 3) {
				System.out.print("First Name: ");
				String firstName = inputScanner.nextLine();
				System.out.print("Last Name: ");
				String lastName = inputScanner.nextLine();
				System.out.println("College Attended");
				String college = inputScanner.nextLine();
				myDoctorArray[counter] = new Pulmonologist(firstName, lastName, college);
			} else if (docMenuChoice == 4) {
				System.out.print("First Name: ");
				String firstName = inputScanner.nextLine();
				System.out.print("Last Name: ");
				String lastName = inputScanner.nextLine();
				System.out.println("College Attended");
				String college = inputScanner.nextLine();
				myDoctorArray[counter] = new SurgicalOncologist(firstName, lastName, college);
			}

		}

		int patientGen;
		System.out.println("How many patients are at " + thisHospital.getHospitalName());
		patientGen = Integer.valueOf(inputScanner.nextLine());
		Patient[] myPatientArray = new Patient[patientGen];

		int patientMenuChoice;

		for (int counter = 0; counter < patientGen; counter++) {
			System.out.println("What is this patient's first name?");
			String firstName = inputScanner.nextLine();
			System.out.println("What is this patient's last name?");
			String lastName = inputScanner.nextLine();
			myPatientArray[counter] = new Patient(firstName, lastName);

			System.out.println("What are your symptoms?");
			System.out.println("1. Shortness of breath?");
			System.out.println("2. Constant migraines?");
			System.out.println("3. Runny nose?");
			System.out.println("4. Sore throat?");
			patientMenuChoice = Integer.valueOf(inputScanner.nextLine());
			myPatientArray[counter].setTypeSymptom(patientMenuChoice);
		}
		for (HospitalDoctor currentDoc : myDoctorArray) {
			System.out.println(currentDoc.toString());
		}

		for (HospitalDoctor currentDoctor : myDoctorArray) {

				for (Patient currentPatient : myPatientArray) {

					if (currentDoctor.diagnose() == currentPatient.getTypeSymptom()) {
						currentDoctor.treatPatient(currentPatient);
						System.out.println("Doctor " + currentDoctor.getLastName() + " has diagnosed and treated " + currentPatient.getFirstName() + ".");
						break;
					} else if (currentDoctor.diagnose() != currentPatient.getTypeSymptom()) {
						System.out.println("Something something");
					}

				}
			}
//
//		if (generalDoctor instanceof GeneralPractitioner && sickPatient.getTypeSymptom() == 3) {
//			generalDoctor.treatPatient(sickPatient);
//		} else {
//			System.out.println("Sorry, we don't have that kind of doctor");
//		}


//        HospitalDoctor firstDoc = new GeneralPractitioner("James", "Glavin", "MIT");
//        Patient firstPatient = new Patient("David", "Polk");
//
//        if (firstDoc instanceof GeneralPractitioner) {
//            boolean success = ((GeneralPractitioner)firstDoc).operate(firstPatient);
//            if (success) {
//                System.out.println("Successful operation!");
//            } else {
//                System.out.println("Operation failed!!!");
//            }
//        }

			System.out.println("HospitalRunner.main() - done!");
		}
	}

