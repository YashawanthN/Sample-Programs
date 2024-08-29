package sampleProgrames.Arrays.practiceArrays;

public class removeElementArray {

	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5 };
		int[] newArray = new int[originalArray.length - 1];
		int position = 2;
		int j = 0;

		for (int i = 0; i < originalArray.length; i++) {
			if (i != position) {
				newArray[j] = originalArray[i];
				j++;
			}
		}
		for (int i = 0; i < newArray.length; i++) {
            System.out.println("Position " + i + ": " + newArray[i]);
		}

	}

}
