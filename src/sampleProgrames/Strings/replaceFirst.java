package sampleProgrames.Strings;

public class replaceFirst {

	public static void main(String[] args) {
		// Program to the first + character

		String str = "a+a-++b";

		// replace the first "+" with "#"
		System.out.println(str.replaceFirst("\\+", "#")); // a#a-++b

	}
}
