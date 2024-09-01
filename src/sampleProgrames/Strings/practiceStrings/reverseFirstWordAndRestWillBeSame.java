package sampleProgrames.Strings.practiceStrings;

public class reverseFirstWordAndRestWillBeSame {

	public static void main(String[] args) {
		String[] str = { "yash", "usha", "teju" };
		
		byCode(str);
		byStringBuffer(str);
	}
	
	private static void byStringBuffer(String[] str) {
	
		str[0] = new StringBuilder(str[0]).reverse().toString();
		
		for( String newString: str)
		{
			System.out.println(newString);
		}
		
	}

	private static void byCode(String[] str) {
		for (int i = 0; i < str.length; i++) 
		{
			
			if (i == 0) 
			{
				char ch;
				String reverString = "";
				for (int j = 0; j < str[i].length(); j++) 
				{
					ch = str[i].charAt(j);
					reverString = ch + reverString;
				}
				str[i] = reverString;
			}
			
		}
		for (String newString : str) {
			System.out.println(newString);
		}
	}
		
	}

	


