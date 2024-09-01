package sampleProgrames.Numbers;

public class primeNumber 
{
	public static void main(String[] args) 
	{
		int num = 9;
		int flag =  0;

		if (num ==0 || num ==1) 
		{
			System.out.println("Number which is lesser than equl to 1 is not a prime number");
		} 
		else
			for (int i = 2; i <= num / 2; ++i) 
			{
				
				if (num % i == 0) 
				{
					System.out.println(" Is a Not a prime number");
					flag = 1;
					break;
				}
			}
			
		if(flag == 0)
		{
			System.out.println(" Is a prime number");
		}
		
		
	}
}