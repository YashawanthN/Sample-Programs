package sampleProgrames.Numbers;

import java.util.Scanner;

public class factoriaNumber {

	public static void main(String[] args) {
		int fact = 1, num;
		System.out.println(" Enter the value to find the factorial");
		try (Scanner scn = new Scanner(System.in)) {
			num = scn.nextInt();
		}
		
		
		for( int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println(fact);
	}

}
