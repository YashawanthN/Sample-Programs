package sampleProgrames.mathematicalMethods;

public class minValueFromArray {

	public static void main(String[] args) {

			    // create an array of int type
			    int[] arr = {4, 2, 5, 3, 6};

			    // assign first element of array as minimum value
			    int min = arr[0];

			    for (int i = 0; i < arr.length; i++) {

			      // compare all elements with min
			      // assign minimum value to min
			      min = Math.min(min, arr[i]);

			    }

			    System.out.println("Minimum Value: " + min);
			  }
			}

