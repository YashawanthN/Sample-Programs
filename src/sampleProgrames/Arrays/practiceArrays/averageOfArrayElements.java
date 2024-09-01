package sampleProgrames.Arrays.practiceArrays;

public class averageOfArrayElements {

	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5 };
		int sum = 0;
		int count = originalArray.length;
		int average;
		
		for(int i=0; i<count;  i++)
		{
			sum =sum+originalArray[i];
		}
		
		average = sum/count;
		
		System.err.println("Average of array is: "+average);
	}

}
