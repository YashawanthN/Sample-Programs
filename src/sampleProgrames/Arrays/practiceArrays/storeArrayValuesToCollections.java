package sampleProgrames.Arrays.practiceArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class storeArrayValuesToCollections {

	public static void main(String[] args) {
		
		int[] num = {3,5,6,9,5,8,9};
		String[] str = {"yash", "usha", "Teju", "yash"};
		char[] ch= { 'b', 'd', 'e', 'a','d', 'c'};
		storeInteger(num);
		storeStrings(str);
		storeCharacter(ch);
	}

	private static void storeCharacter(char[] ch) {
		
		Set<Character> chSet = new HashSet<>();
		
		System.out.println(chSet.size());
		
		for(char chSequence : ch) {
		chSet.add(chSequence);
		}
		System.out.println(chSet.size());
		System.out.println(chSet);
		
		Set<Character> newChSet = new HashSet<>();
		newChSet.addAll(chSet);
		System.out.println(newChSet);
	}

	private static void storeStrings(String[] str) {
		
		TreeSet<String> strSet = new TreeSet<>();
		for(String fullNames : str)
		{
			strSet.add(fullNames);
		}
		
		System.out.println(strSet);
//		String newStrng = strSet.toString();
//		System.out.println(newStrng);
	}

	private static void storeInteger(int[] num) {
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int digit : num)
		{
			numbers.add(digit);
		}
		
		String seqInt = numbers.toString();
		System.out.println(seqInt);
		
		Set<Integer> newNumbers = new HashSet<>();
		newNumbers.addAll(numbers);
		
		System.out.println(newNumbers);
		
	}

}
