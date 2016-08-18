package com.tiy.hospital;

import java.util.ArrayList;

/**
 * Created by Brett on 8/17/16.
 */
public class LoopRunner {

	public static void main(String[] args) {
		System.out.println("Running...");
		LoopRunner runner = new LoopRunner();
		runner.testArrays();

		String[] myStringArray = new String[5];
		for (int counter = 0; counter < myStringArray.length; counter++) {
			myStringArray[counter] = "Counter" + counter;
			System.out.println(myStringArray[counter]);
		}

		System.out.println();

		for (String currentString : myStringArray) {
			System.out.println(currentString.toUpperCase());
		}

		int[] thatStringArray = new int[6];
		for (int counter = 0; counter < thatStringArray.length; counter++) {
			thatStringArray[counter] = counter * counter;
			System.out.println(thatStringArray[counter]);
		}
	}

	public void testArrays() {
		for(int i = 0; i < 10; i++)
		{
			System.out.println("The index is " + i);
		}

//	public void testArrayList() {
//		ArrayList<String> myArrayList = new ArrayList<String>();
//		for (int counter = 0; )
//	}
	}

}
