package sampleProgrames.Arrays.practiceArrays;

public class findSmalledstNumber {

	public static void main(String[] args) {
		int[] num = {50, 7, 15, 25};
		int min = num[0];
		
		for(int i=0; i<num.length; i++)
		{
			if(num[i]< min)
			{
				min = num[i];
			}
		}
		System.out.println("Minimum value of the array is: "+min);
	}

}
