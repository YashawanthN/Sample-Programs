package sampleProgrames.Arrays;

import java.util.Arrays;

public class copyArrayUsingCopyArray {

	public static void main(String[] args) {
		int[] array1 = { 100, 200, 300 };
		
		int[] array2 = new int[3];
		
		System.arraycopy(array1, 0, array2, 0, array1.length);
		System.out.println(Arrays.toString(array2));
		
		
		// To use toString() and copyOfRange() method
		
		        int[] source = {2, 3, 12, 4, 12, -2};
		      
		        // copying entire source array to destination
		        int[] destination1 = Arrays.copyOfRange(source, 0, source.length);      
		        System.out.println("destination1 = " + Arrays.toString(destination1)); 
		      
		        // copying from index 2 to 5 (5 is not included) 
		        int[] destination2 = Arrays.copyOfRange(source, 2, 5); 
		        System.out.println("destination2 = " + Arrays.toString(destination2));   
		    }
		}
