package sampleProgrames.Numbers;

public class primeNumbersInIntervals {

	public static void main(String[] args) {
		int low = 21, high = 30;
		while (low <= high) 
		{
			boolean flag = true;
			for (int i = 2; i <= low / 2; ++i) 
			{

				if (low % i == 0) 
				{
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(" Is a prime number: " + low);
			} else {
				System.out.println(" Is a Not a prime number: " + low);
			}
			
			low++;
		}
		

	}
}
