package commonInterviewQuestionsJava;

public class sumofDigits {

	public static void main(String[] args) {
		int num = 523;
		int remainder;
		int result = 0;
		
		while (num !=0)
		{
		remainder = num%10;
		result = remainder + result;
		num = num/10;
		}	
		System.out.println(result);

	}

}
