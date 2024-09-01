package sampleProgrames.Arrays;

public class dispay2DArrayValues {

	public static void main(String[] args) {
		int[][] array2D = { { 5, 10, 15 }, { 20, 25 }, { 30 } };

		for (int[] item : array2D) {
			for (int data : item) {
				System.out.println(data);
			}
		}
	}

}
