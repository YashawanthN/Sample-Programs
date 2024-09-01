package sampleProgrames.Arrays;

public class largestAndSmallestInArray {

	public static void main(String[] args) {
		int[] num = new int[5];
		int max = num[0];
		int min = num[0];
		for(int i =0; i<=num.length;i++)
		{
			num[0] = 25;
			num[1] = 0;
			num[2] = 65;
			num[3] = 28;
			num[4] = 55;
		}
		 for ( int i=0; i< num.length; i++)
		 {
			 
				 if(num[i]>=max)
				 { 	
					 max = num[i];
				 }
				 else if(num[i]<= min)
				 {
					 min = num[i];
				 }
				 
		 }
		
			System.out.println("Largest value in a array is " +max);	
			System.out.println("Smallest value in a array is " +min);

	}

}
