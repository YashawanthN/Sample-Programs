package sampleProgrames;

public class reverseNumber {

	public static void main(String[] args) {

		int num = 153;
		int digit;
		int reversed=0;
		
		while(num!=0) {
			digit = num % 10;
			reversed = reversed * 10 +digit;
			num = num / 10;
		}
		
		System.out.printf(" Reverse of a given number is: %d \n",reversed);
	}

}
