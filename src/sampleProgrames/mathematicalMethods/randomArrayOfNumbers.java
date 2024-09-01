package sampleProgrames.mathematicalMethods;

public class randomArrayOfNumbers {

	public static void main(String[] args) {

			    // create an array
			    int[] array = {34, 12, 44, 9, 67, 77, 98, 111};

			    int lowerBound = 0;
			    int upperBound = array.length;

			    // array.length will excluded
			    int range = upperBound - lowerBound;

			    System.out.println("Random Array Elements:");
			    // access 5 random array elements
			    for (int i = 0; i < upperBound; i ++) {

			      // get random array index
			      int random = (int)(Math.random() * range) + lowerBound;

			      System.out.print(array[random] + ", ");
			    }

			  }
			}
