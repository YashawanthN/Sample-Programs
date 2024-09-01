package sampleProgrames.Strings;

public class evencharAtString {

	public static void main(String[] args) {
		String originalStr = "YashawanthNS";
		char ch;
		String newString = "";
		
		
		for (int i = 0; i<originalStr.length(); i+=2)
		{
			
				ch = originalStr.charAt(i);
				newString = ch + newString ;
			
		}
		System.out.println(newString);

	}

}
