package sampleProgrames.Numbers;

public class sumOfDigits {

	static int num = 153;
	static int digit;
	static int sum = 0;
	static int count = 0;

	public static void main(String[] args) {

		getsumofDigit();
		System.out.println(getcountofDigit());

	}

	public static void getsumofDigit() {

		while (num != 0) {
			digit = num % 10;
			num = num / 10;
			sum = sum + digit;
		}
		System.out.println(sum);
	}

	public static int getcountofDigit() {
		while (num != 0) {

			num = num / 10;
			count++;

		}
		return count;

	}

}
