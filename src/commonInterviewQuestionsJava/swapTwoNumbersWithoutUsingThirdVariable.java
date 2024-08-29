package commonInterviewQuestionsJava;

public class swapTwoNumbersWithoutUsingThirdVariable {

	 static int a = 10;
	 static int b = 20;
	
	public static void main(String[] args) {
		System.out.println(" value of a before swap: "+a);
		System.out.println(" value of b before swap : "+b);
		swap(a,b);
	}

	private static void swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(" value of A after swap: "+a);
		System.out.println(" value of b after swap : "+b);
		
	}

}
