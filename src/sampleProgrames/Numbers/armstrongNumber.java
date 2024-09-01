package sampleProgrames.Numbers;

public class armstrongNumber {
	
	static int  originalNumber = 371, remainder, sum= 0;
	static int number=originalNumber;
	
	public static void main(String[] args) 
	{
		
		int armstrongNum = getartmstrongNum();
		System.out.println(armstrongNum);
		
		if( armstrongNum==originalNumber)
		{
			System.out.printf(" Given number is armstrong Number %d \n",armstrongNum);
		}
		else
		{
			System.out.printf(" Given number is not a armstrong Number %d \n",armstrongNum);
		}

	}
	
	public static int getartmstrongNum()
	{
		while(number != 0)
		{
			remainder = number % 10;
			sum = (int) (sum + Math.pow(remainder, 3));
			number = number/10;
		}
		
		return sum;
		
	}

}
