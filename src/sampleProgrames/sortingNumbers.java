package sampleProgrames;

import java.util.Arrays;

public class sortingNumbers {

	public static void main(String[] args) 
	{
		int[] numbers = { 20, 7, 5, 45 };
		Arrays.sort(numbers);
		for( int num : numbers)
		{
			System.out.println(num);
		}

	}

}
