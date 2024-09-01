package sampleProgrames.Numbers;

import java.util.Scanner;

public class evenOddNumbers {

	public static void main(String[] args) {
		int number;
		try (Scanner scn = new Scanner(System.in)) {
			
			System.out.println("Enter the number");
			number = scn.nextInt();
		}
		if(number % 2 == 0 )
		{
		System.out.println("Number is Even");
		}
		else 
		{
			System.out.println("Number is odd");
		}

	}

}
