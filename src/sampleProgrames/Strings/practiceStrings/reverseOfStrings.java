package sampleProgrames.Strings.practiceStrings;

public class reverseOfStrings {

	public static void main(String[] args) {
		String str = "Yashawanth";
		int size = str.length();
		
		String reversedString1 = reverseByCode(str, size);
		System.out.println(" Reverse of string name is : "+reversedString1);
		
		String revString2 = revStringByStringBuilder(str, size);
		System.out.println(" Reverse of string name is : "+revString2);
	}

	private static String revStringByStringBuilder(String str, int size) {
		
		StringBuilder sb = new StringBuilder(str);
		String reversse = sb.reverse().toString();
		return  reversse;
	}

	private static String reverseByCode(String str, int size) {
		char revChar;
		String reverseStr = "";
		
		for(int i=0; i<size; i++)
		{
			revChar= str.charAt(i);
			reverseStr = revChar +reverseStr;
		}
		
		return reverseStr;
	}

}
