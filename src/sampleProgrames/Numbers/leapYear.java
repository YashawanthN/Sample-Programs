package sampleProgrames.Numbers;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		int year;
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println(" Enter a year to validte whether it is leap year");
			year = scn.nextInt();
		}
		if (year % 4 == 0 && year % 100 == 0) {
			System.out.println("Year is Leap  year as well as Century year");
		} else if (year % 4 == 0) {
			System.out.println("Year is leap year");

		} else if (year % 100 == 0) {
			System.out.println(" Year is Century year");
		}

		else {
			System.out.println(" Year is not a Century year and not a Leap year");
		}

	}

}
