package sampleProgrames.Strings;

public class equalsString {
	
	public static void main(String[] args)
	{
		String str1 = "Yashawanth";
		String str2 = "yashawanth";
		
		if(str1.equals(str2))
		{
			System.out.println(" String is matching");
		}
		else if(str1.equalsIgnoreCase(str2))
		{
			System.out.println(" String is matches by ignoring case");
		}
	}

}
