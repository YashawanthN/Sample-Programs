package sampleProgrames.mathematicalMethods;

public class randomnumbersInaRange {

	public static void main(String[] args) {

			    int upperBound = 20;
			    int lowerBound = 10;

			    // upperBound 20 will also be included
			    int range = (upperBound - lowerBound) + 1;

			    System.out.println("Random Numbers between 10 and 20:");

			    for (int i = 0; i < 10; i ++) {

			      // generate random number
			      // (int) convert double value to int
			      // Math.random() generate value between 0.0 and 1.0
			      int random = (int)(Math.random() * range) + lowerBound;

			      System.out.print(random + ", ");
			    }

			  }
			}
