package sampleProgrames.Arrays;

import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println(" Enter the count of numbers to array");
		int count = sc.nextInt();
		System.out.println(" Strore the values to array");
		for (int i=0; i<count;i++ )
		{
			num[i] = sc.nextInt();
		}
	
			for (int j=0;j<count-1;++j)
			{
				if(num[j]>num[j+1])
				{
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		
		for(int i=0; i<count; ++i)
		{
			System.out.println(num[i]);
		}
	}

}
