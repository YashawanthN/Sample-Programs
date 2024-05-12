package sampleProgrames;

public class polindromeNumber {

	public static void main(String[] args) {
		int num = 454;
		int revNum = 0;
		int digit;
		int temp = num;
		
		while (num!=0)
		{
			digit = num%10;
			revNum = (revNum*10)+ digit;
			num = num/10;
		}
		
			if ( temp == revNum)
			{
				System.out.println("Given number is Polindrome");
				
			}
			else
			{
				System.out.println("Not a polindrome");
			}

	}

}
