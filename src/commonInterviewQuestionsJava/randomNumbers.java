package commonInterviewQuestionsJava;

import java.util.Random;

public class randomNumbers {

	public static void main(String[] args) {
		
		Random randomNumbers = new Random();
		
		for( int i=0; i<5; i++) {
			System.out.println(randomNumbers.nextInt());
		}
		

	}

}
