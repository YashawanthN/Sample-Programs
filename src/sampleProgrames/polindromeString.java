package sampleProgrames;

public class polindromeString {
	public static void main(String[] args) {
		String str = "NAMAN";
		String revStr = "";
		int strLength = str.length();
		
		for (int i = (strLength-1); i >= 0; i--) 
		{
			revStr = revStr + str.charAt(i);
		}
		if (str.toLowerCase().equals(revStr.toLowerCase())) 
		{
			System.out.println("Given string Is Palindrome");

		} else 
		{
			System.out.println("Is not Palindrome");
		}

	}
}