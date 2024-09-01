package sampleProgrames.Strings;

public class numberOfVowelsInaString {

	public static void main(String[] args) {
		String scr = "hellowe";
		int count=0;
		
		for(int i=0; i<scr.length(); i++)
		{
			switch(scr.charAt(i))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		System.out.println("Number of vowels in a string: "+count);
	}

}
