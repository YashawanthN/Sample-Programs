package sampleProgrames.Strings.practiceStrings;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicateInString {

	public static void main(String[] args) {
		String str = "Yasha";
		removeDuplicateByStringBuilder(str);
		
		String duplicatesRemoved = removeDuplicateBySets(str);
		System.out.println("removeDuplicates using sets : "+duplicatesRemoved);
	}

	private static String removeDuplicateBySets(String str) {
		
		StringBuilder sb = new StringBuilder();
		Set<Character> charSet = new HashSet<>();
		
		for(char c : str.toCharArray())
		{
			if(!charSet.contains(c))
			{
				sb.append(c);
				charSet.add(c);
			}
		}
		return sb.toString();
	}

	private static void removeDuplicateByStringBuilder(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (sb.indexOf(Character.toString(ch)) == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());

	}

}
