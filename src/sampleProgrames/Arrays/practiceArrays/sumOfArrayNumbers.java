package sampleProgrames.Arrays.practiceArrays;

public class sumOfArrayNumbers {

	public static void main(String[] args) {
		int[] num = {10, 15, 20};
		int sum= 0;
		
		for(int i=0; i<num.length;i++)
		{
			sum = sum + num[i];
		}
		System.out.println("Sum of the array values is: " + sum);
	}

}
