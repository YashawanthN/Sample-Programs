package sampleProgrames.Strings;

public class reverseOfString {

	public static void main(String[] args) {
		String originalName = "Yashawanth";
		String reverseName = "";
		char ch;
		
		for(int i=0;i<originalName.length();i++)
		{
			ch =originalName.charAt(i);
			reverseName = ch + reverseName;
			
		}
		System.out.println(reverseName);
		
	}

}
