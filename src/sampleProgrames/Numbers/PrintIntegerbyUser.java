package sampleProgrames.Numbers;

import java.util.Scanner;

public class PrintIntegerbyUser {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter a number");
			
			int number = scn.nextInt();

			System.out.println("Numbers entered:" + " " + number);
		}

	}

}
