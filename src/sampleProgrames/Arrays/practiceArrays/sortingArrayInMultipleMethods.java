package sampleProgrames.Arrays.practiceArrays;

import java.util.Arrays;

public class sortingArrayInMultipleMethods {

	public static void main(String[] args) {
		int[] numbers = { 5, 1, 3, -2, 1, -6 };
		sortWithoutRemoveDuplicates(numbers);
		sortByRemovingDuplicates(numbers);
		findNegativeElement(numbers);
	}
	  private static void findNegativeElement(int[] num) {
		 
		 int count = 2;
		 int[] negative = new int[count];
		 for(int i=0; i<num.length; i++)
		 {
			 if(num[i]<0)
			 {
				 negative[i] = num[i];
				 count++;
			 }
			 
		 }
		System.out.println("print negative valeues"+Arrays.toString(negative));
	}
	private static void sortByRemovingDuplicates(int[] num) {
		
		  Arrays.sort(num);
		  int size = num.length;
		  int[] newArray = new int[size];
		  int j = 0;
		  
		  Arrays.sort(num);
		  
		  for(int i=0; i<size-1; i++)
		  {
			  if(num[i]!=num[i+1])
			  {
				  newArray[j] = num[i];
				  j++;
			  }
		  }
		 newArray[j++] = num[size-1];
		 int[] uniqueNumbers = new int[j];
	        for (int i = 0; i < j; i++) {
	            uniqueNumbers[i] = newArray[i];
	        }
	        System.out.println("Sorted array without duplicates: " + Arrays.toString(uniqueNumbers));
	}
	private static void sortWithoutRemoveDuplicates(int[] numbers) {
	  Arrays.sort(numbers);
	  
	  // sorting without removing duplicates
	  System.out.println("Sorted arrays with duplicates" +Arrays.toString(numbers));
	  
	  }
	 

}
