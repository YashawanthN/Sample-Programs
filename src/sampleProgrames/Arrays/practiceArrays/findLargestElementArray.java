package sampleProgrames.Arrays.practiceArrays;

public class findLargestElementArray {

	public static void main(String[] args) {
		int[] num = {10, 20, 15, 25};
		int max = num[0];
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.println("Maximum number in a array is: " + max);
	}

}
