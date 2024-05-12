package sampleProgrames;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Entet the number for factorial");
			int num = scn.nextInt();
			int fact = 1;
			
			for(int i = 1; i<=num; i++)
			{
				fact = i * fact;
			}
			
			System.out.println("Factorial of a number " + num + " is: "+ fact);
		}

	}

}
