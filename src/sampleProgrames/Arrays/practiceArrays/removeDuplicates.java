package sampleProgrames.Arrays.practiceArrays;

import java.util.Arrays;
import java.util.HashSet;


public class removeDuplicates {

	public static void main(String[] args) {
		int[] numbers = { 3, 2, 6, 2 };
		char[] arrChar = { 'a', 'b', 'c', 'a' };
		String[] str = { "Usha","yash","Teju","yash"};
		removeDuplicateInteger(numbers);
		removeDuplicateCharacters(arrChar);
		removeDuplicatesInStrings(str);
	}

	private static void removeDuplicatesInStrings(String[] str) {
		HashSet<String> names = new HashSet<>(Arrays.asList(str));
		System.out.println(names);
		
	}

	private static void removeDuplicateCharacters(char[] arrChar) {
		HashSet<Character> chars = new HashSet<>();
		for (char alphabets : arrChar) {
			chars.add(alphabets);
		}
		System.out.println(" Print after remove of duplicates in characters : "+chars.toString());
	}

	private static void removeDuplicateInteger(int[] arr) {
		HashSet<Integer> numbers = new HashSet<>();

		for (int num : arr) {
			numbers.add(num);
		}
		System.out.println(" Print after remove of duplicates in number array : " + numbers.toString());
	}

}
