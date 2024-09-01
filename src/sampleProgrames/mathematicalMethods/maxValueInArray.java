package sampleProgrames.mathematicalMethods;

public class maxValueInArray {

	public static void main(String[] args) {

		// create an array of int type
		int[] arr = { 4, 2, 5, 3, 6 };

		// assign first element of array as maximum value
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			// compare all elements with max
			// assign maximum value to max
			max = Math.max(max, arr[i]);

		}

		System.out.println("Maximum Value: " + max);
	}
}
