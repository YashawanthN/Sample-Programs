package sampleProgrames.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertListToArray {

	public static void main(String[] args) {
		
		String[] names = { "yash", "usha"};
		String strgs = "Java,Python,JavaScript";
		
		convertLsitToArray();
		convertArrayToList(names);
		convertArrayToString(names);
		ConvertStringToArray(strgs);

	}

	private static void ConvertStringToArray(String strgs) {
		String[] newStrs = strgs.split(",");
		
	for(String s : newStrs)
	{
		System.out.println(s);
	}
	}
	private static void convertArrayToString(String[] names) {
		String arraysString = Arrays.toString(names);
		
		System.out.println(arraysString);
		
	}

	// Convert array to List
	private static void convertArrayToList(String[] names) {
		
		List<String> lst = Arrays.asList(names);
		System.out.println(lst);
	}
// Convert List to array
	private static void convertLsitToArray() {
		List<String> lst = new ArrayList<String>();
		lst.add("Hello");
		lst.add("Yash");

		String[] str = lst.toArray(new String[0]);
		for (String arrayString : str) {
			System.out.println(arrayString);
		}
	}

}
