package sampleProgrames.Numbers;

import java.util.Scanner;

public class fibonacisSeriesNumberOfSeries {

	public static void main(String[] args) {
		System.out.println("Enter the how many number of fibonacis series needed");

		try (Scanner scn = new Scanner(System.in)) {
			int num = scn.nextInt();
			int firstValue = 0, secondValue = 1, nextValue;
			
			for (int i = 1; i <= num; i++) 
			{
				System.out.println(firstValue + ",");
				
				nextValue = secondValue + firstValue;
				firstValue = secondValue;
				secondValue = nextValue;
			}
		}

	}

}
