package commonInterviewQuestionsJava;

public class primeNumberSnippets {
	
	static int num1 = 9;

	public static void main(String[] args) 
	{
		primeorNot(num1);
	}
	
	public static void primeorNot(int number)
	{
		
		if(number==0||number==1||number==2)
		{
			System.out.println(" Number is not a primer in case of 0,1 or 2 ");
		}
		
		for( int i = 2; i<= number/2; ++i )
		{
			if(number%i==0)
			{
				System.out.println(" Number is not a Prime number");
			}
			else
			{
				System.out.println(" Number is a prime munber");
			}
		}
	}
}
