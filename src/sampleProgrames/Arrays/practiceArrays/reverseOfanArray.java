package sampleProgrames.Arrays.practiceArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class reverseOfanArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };

		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(" " + num[i]);
		}

		reversebyInbuiltMethod(num);
	}

	private static void reversebyInbuiltMethod(int[] num) {

		Set<Integer> numbers = new TreeSet<>();

		for (int digit : num) {
			numbers.add(digit);
		}

		System.out.println("\n"+numbers);

		// Reverse the collection

		List<Integer> lst = new ArrayList<>(numbers);
		Collections.reverse(lst);
		System.out.println(lst);

	}

}
