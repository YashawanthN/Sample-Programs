package sampleProgrames;

public class primeNumber 
{
	public static void main(String[] args) 
	{
		int num = 9;
		boolean flag = true;

		if (num ==0 || num ==1) {
			System.out.println("Number which is lesser than equl to 1 is not a prime number");
		} 
		
			for (int i = 2; i <= num / 2; ++i) 
			{

				if (num % i == 0) 
				{
					flag = false;
					break;
				}
			}
			
		if(flag == true)
		{
			System.out.println(" Is a prime number");
		}
		else
		{
			System.out.println(" Is a Not a prime number");
		}
		
	}
}

