package commonInterviewQuestionsJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class removeDupliacteWithUsingLists {

	public static void main(String[] args) {
		Integer[] numbers = { 3,1,2,1 };
		
		//Convert Array to List 
		List<Integer> numbersInList = Arrays.asList(numbers);
		
		System.out.println("before remove duplicates" +numbersInList);
		
		//create HashSet to remove duplicate numbers in List
		HashSet<Integer> result = new HashSet<>(numbersInList);
		
		//convert hashSet back to an array
		Integer[] resultArray = result.toArray(new Integer[0]);
		
		// Convert array values to String
		System.out.println("After removing the duplicates" +Arrays.toString(resultArray));
	}

}
