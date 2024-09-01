package sampleProgrames.mathematicalMethods;

public class maxInInteger {

	public static void main(String[] args) {

		// Math.max() with int arguments
		int num1 = 35;
		int num2 = 88;
		System.out.println(Math.max(num1, num2)); // 88

		// Math.max() with long arguments
		long num3 = 64532L;
		long num4 = 252324L;
		System.out.println(Math.max(num3, num4)); // 252324

		// Math.max() with float arguments
		float num5 = 4.5f;
		float num6 = 9.67f;
		System.out.println(Math.max(num5, num6)); // 9.67

		// Math.max() with double arguments
		double num7 = 23.44d;
		double num8 = 32.11d;
		System.out.println(Math.max(num7, num8)); // 32.11
	}
}
