package sampleProgrames.Strings;

public class replaceallRegexs {

	public static void main(String[] args) {
		String originalStr = "Yash123NS#$%";
		
		// replace all numbers using regex
		System.out.println(originalStr.replaceAll("\\d", " "));
		
		// Replace all special characters in to spaces using regular expression
		System.out.println(originalStr.replaceAll("[^a-zA-Z0-9]", " "));
		

	}

}
