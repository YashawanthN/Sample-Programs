package sampleProgrames.Arrays;

public class storeArrayRecorddUsingForLoop {

	public static void main(String[] args) {
		int[] array = new int[5];
		int value = 10;
		
		for(int i=0; i<array.length;i++,value+=10)
		{
			array[i] = value;
		}
		
		for(int i = 0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
