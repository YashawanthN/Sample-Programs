package sampleProgrames.Strings;

public class insertStringIntoString {

	public static void main(String[] args) {
	String originalStr = "Yashawanth Yash";
	String insertStr = "NS ";
	StringBuffer newString = new StringBuffer(originalStr);
	
	for(int i = 0;i<originalStr.length();i++ )
	{
		if(originalStr.charAt(i)== ' ')
		{
			newString.insert(i+1, insertStr);
		}
	}
	System.out.println(newString);
	}

}
