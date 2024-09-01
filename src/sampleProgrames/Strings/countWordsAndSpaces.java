package sampleProgrames.Strings;

public class countWordsAndSpaces {

	public static void main(String[] args) {
		
		String src = "I am a good tester";
		src.trim();
		int size = src.length();
		int spaces = 0;
		
	for(int i=0; i<size;i++)
	{
		if(src.charAt(i)== ' ')
		{
			spaces++;
		}
	}
	System.out.println("Count of spacex in a string: " +spaces);
	System.out.println("Count of words in a string: " +(spaces+1));
	}

}
