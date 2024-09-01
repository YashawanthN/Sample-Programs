package sampleProgrames.Arrays.practiceArrays;

public class insetElementBetweenArray {

	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 4, 5 };
		int[] newArray = new int[originalArray.length + 1];
		int position = 2;
		int newElement = 3;

		for (int i = 0; i < position; i++) {
			newArray[i] = originalArray[i];
		}

		newArray[position] = newElement;

		for (int i = position + 1; i < newArray.length; i++) {
			newArray[i] = originalArray[i - 1];
		}

		for (int numbers : newArray) {
			System.out.println(numbers);
		}
	}

}
