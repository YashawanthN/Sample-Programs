package sampleProgrames.Numbers;

import java.util.Scanner;

public class addTwoInteger {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter first value");
			int firstNumber = scn.nextInt();
			
			System.out.println("Enter second  value");
			int secondNumber = scn.nextInt();
			
			int sum = firstNumber + secondNumber ;
			
			System.out.println("Sum of two values: " + sum);
		}
		
		
	}

}
