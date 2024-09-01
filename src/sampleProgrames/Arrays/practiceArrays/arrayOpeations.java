package sampleProgrames.Arrays.practiceArrays;

public class arrayOpeations {

	public static void main(String[] args) {
		arrayInteger();

	}
	public static void arrayInteger() {
		
		int[] number = new int[9];
		String statement_1 = "Display of empty array elements is :";
		displayofArray(statement_1,number);
		
		number[0]=10;
		
		String statement_2 = "Dispalay of elements with a value of first index is: ";
		displayofArray(statement_2,number);
		
		//Declaration and initialization of array
		int[] num = {5,8,9,11,3,5,9,0,1};
		String statement_3 = "print array before adding the values to array index is: ";
		// print array before adding the values to array index
		displayofArray(statement_3,num);
		
		// print array after adding the values to array index
		num[0]=20;
		String statement_4 = "print array after adding the values to array index";
		displayofArray(statement_4,num);
		
		//search an element by indexes
		
		System.out.println( "Array value of index 4 is: "+num[4]);
	
		
	}
	
	public static void displayofArray(String statement, int[] num)
	{
		for(int numbers:num)
		{
			System.out.println(statement+numbers);
		}
		System.out.print("\n");
	}

	
}
