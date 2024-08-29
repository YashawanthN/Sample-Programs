package commonInterviewQuestionsJava;

public class removeDuplicatesInArrayWithoutUsingCollections {

	public static void main(String[] args) {
		int[] numbers = {5,6,5};
		int[] result = removeDuplicates(numbers);
		
		for( int uniqueNumbers: result)
		{
			System.out.println(uniqueNumbers);
		}
	}

	public static int[] removeDuplicates(int[] arr)
	{
		if(arr==null | arr.length == 0)
		{
			return new int[0];
		}
		
		int[] temp = new int [arr.length];
		int j = 0;
		
		for(int i = 0; i<arr.length-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++] = arr[i];
				
			}
		}
		 temp[j++] = arr[arr.length - 1];
		int[] result = new int[j];
		for(int i=0; i<j; i++)
		{
			result[i] = temp[j];
		}
		return result;
	}

}
