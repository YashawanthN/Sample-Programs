package sampleProgrames.Strings;

public class evenCharStrings {

	public static void main(String[] args) {
		String originalStr = "I am Yash NSY";

		String[] words = originalStr.split(" ");

		for (String evenwords : words) {

			if (evenwords.length() % 2 == 0) {
				System.out.println(evenwords);
			}

		}

	}
}
