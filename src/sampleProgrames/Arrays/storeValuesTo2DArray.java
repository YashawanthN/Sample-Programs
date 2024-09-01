package sampleProgrames.Arrays;

public class storeValuesTo2DArray {

	public static void main(String[] args) {
		int[][] Array2D = new int[2][2];
		int value1 = 10;
		
		for(int i=0; i<Array2D.length; i++)
		{
			for (int j= 0; j<Array2D.length; j++, value1+=10)
			{
				Array2D[i][j]= value1;
			}
		}
		
		for(int i=0; i<Array2D.length; i++)
		{
			for (int j= 0; j<Array2D.length; j++, value1+=10)
			{
				System.out.println(Array2D[i][j]);
			}
		}
	}
}
