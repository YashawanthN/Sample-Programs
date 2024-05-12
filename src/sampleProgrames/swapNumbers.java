package sampleProgrames;

public class swapNumbers {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int temp;

		System.out.println("Before Swapping number:" + num1 + "," + num2);

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After Swapping number:" + num1 + "," + num2);
	}

}
