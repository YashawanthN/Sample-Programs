package sampleProgrames.Strings;

import java.util.ArrayList;

public class joinString {

	public static void main(String[] args) {

		ArrayList<String> text = new ArrayList<>();

		// adding elements to the arraylist
		text.add("Java");
		text.add("is");
		text.add("fun");

		String result;

		result = String.join("-", text);

		System.out.println(result); // Java-is-fun

	}
}
