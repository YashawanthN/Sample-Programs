package sampleProgrames.Arrays.practiceArrays;

import java.util.Arrays;

public class copyArrayToArray {

	public static void main(String[] args) {
		
		int[] oroginalArray = { 2,4,5};
		copyByCode(oroginalArray);
		copyByArrayCopyMethod(oroginalArray);
		copyByCopyOfMethod(oroginalArray);
		copyBycloneMethod(oroginalArray);

	}

	private static void copyByCode(int[] oroginalArray) 
	{
		int[] newArray = new int[oroginalArray.length];
		
		for(int i=0; i<oroginalArray.length; i++)
		{
			newArray[i] = oroginalArray[i];
		}
		
		System.out.println("Copy array value to another array by code : "+Arrays.toString(newArray));
		
	}
	private static void copyByArrayCopyMethod(int[] oroginalArray) 
	{
		int[] newArray = new int[oroginalArray.length];
		System.arraycopy(oroginalArray, 0, newArray, 0, newArray.length);
		
		System.out.println("Copy array value to another array by 'Array Copy Method': "+Arrays.toString(newArray));
		
	}

	private static void copyByCopyOfMethod(int[] oroginalArray) 
	{
		int[] newArray = Arrays.copyOf(oroginalArray, oroginalArray.length);
		
		System.out.println("Copy array value to another array by 'copyOf Method': "+Arrays.toString(newArray));
		
	}

	private static void copyBycloneMethod(int[] oroginalArray) {
		
		int[] newArray  = oroginalArray.clone();
		
			System.out.println("Copy array value to another array by 'clone Method': " +Arrays.toString(newArray));
		
	}

}
