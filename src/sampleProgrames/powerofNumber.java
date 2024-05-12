package sampleProgrames;

public class powerofNumber 
{
	static int base = 2;
	static int exponent = 3;
	static double result = 1;

	public static void main(String[] args) 
	{
		
	double powResult = getPowerbyPowMethod();
	System.out.printf("find out the power by pow function is: %f \n ", powResult);
	
	result = 1;
	
	double whileResult = getPowerbyWhileLoop();
	System.out.printf("find out the power by while loop is: %f \n ", + whileResult);
	
	double forResult = getPowerbyForLoop();
	System.out.printf("find out the power by for loop is: %f \n ", + forResult);
	}
	
	public static double getPowerbyPowMethod()
	{
		result = Math.pow(base, exponent);
		return result;
	}
	
	public static double getPowerbyWhileLoop()
	{
		while(exponent!= 0) 
		{
			result = result * base;
			--exponent;
		}
		return result;
		
	}
	
	public static double getPowerbyForLoop()
	{
		for(;exponent!=0;--exponent)
		{
			result = result * base;
		}
		return result;
	}
}
