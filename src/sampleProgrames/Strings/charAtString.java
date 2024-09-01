package sampleProgrames.Strings;

public class charAtString {

	public static void main(String[] args) {

		String str1 = "Java Programming";

		// returns character at index 2

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == 'P') 
			{
				System.out.println("Character is 'P' ");
			}
			else {
			System.out.println(" character is not a P");	
			}
		}

	}
}
