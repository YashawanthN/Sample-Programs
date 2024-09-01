package sampleProgrames.Strings.practiceStrings;

public class reverseofEachWordInString {

	public static void main(String[] args) {
		String sentence = "Yash is a QA Engineer";
		String[] words = sentence.split(" ");
		
		for(String singleString : words)
		{
			char ch;
			String reveString = "";
			for(int j=0; j<singleString.length(); j++)
			{
				ch = singleString.charAt(j);
				reveString = ch+reveString;
			}
			System.out.println("Original String of "+singleString +" is: "+reveString);
		}
		
		
	}

}
