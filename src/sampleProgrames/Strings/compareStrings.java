package sampleProgrames.Strings;

public class compareStrings {

	public static void main(String[] args) {
		String str1 = "Yashawanth";
		String str2 = "Yashwanth";
		String str3 = "yashawanth";
		
		if(str1.compareTo(str2)==0)
		{
			System.out.println(" String values are matchges");
		}
		else 
			System.out.println(" String values are not matches");
		if(str1.compareToIgnoreCase(str3)==0)
		{
			System.out.println(" String values are matchges");
		}
		else 
			System.out.println(" String values are not matches");
	}

}
