package sampleProgrames.Numbers;

import java.util.Scanner;

public class sumOfNaturalnumbers {

	public static void main(String[] args) 
	{
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Ente the natural number" );
			
			int num = scn.nextInt();
			int sum = 0;
			for (int i = 0; i<=num; i++)
			{
				sum = i+sum;
			}
			System.out.println("Sum of Natural numbers: " + sum);
		}
		

	}

}
