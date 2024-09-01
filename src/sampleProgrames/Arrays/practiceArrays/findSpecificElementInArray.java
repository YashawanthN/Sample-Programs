package sampleProgrames.Arrays.practiceArrays;

public class findSpecificElementInArray {

	public static void main(String[] args) {
		int[] num = { 6, 9, 11, 13 };
		int target = 11;
		boolean found = false;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == target ) {
				found = true;
				continue;
			}
			if(found)
			{
			System.out.print(" Array contains tageted value: " + target);
			}
		}
	}

}
