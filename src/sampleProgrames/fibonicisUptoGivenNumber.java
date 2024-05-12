package sampleProgrames;

import java.util.Scanner;

public class fibonicisUptoGivenNumber {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println(" Fibonis umbers need up to where  ");
			int num = scn.nextInt();
			int firsrtNumber = 0, secondNumber = 1, thirdNumber;
			
			while(firsrtNumber <= num)
			{
				System.out.println(firsrtNumber);
				thirdNumber = firsrtNumber + secondNumber;
				firsrtNumber = secondNumber;
				secondNumber = thirdNumber;
				
			}
			
		}

	}

}
