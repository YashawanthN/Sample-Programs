package sampleProgrames.Arrays;

import java.util.Arrays;

public class copybyusingForLoop {

	public static void main(String[] args) {
		int[] array1 = {10,20,30};
		int[] array2 = new int[3];
		for(int i=0; i<array1.length;i++)
		{
			array2[i] = array1[i];
			//System.out.println(array2[i]);
		}
		System.out.println(Arrays.toString(array2));
		
	}

}
