package sampleProgrames.mathematicalMethods;

public class cubeRoot {

	public static void main(String[] args) {

			    // create a double variable
			    double value1 = Double.POSITIVE_INFINITY;
			    double value2 = 27.0;
			    double value3 = -64;
			    double value4 = 0.0;

			    // cube root of infinity
			    System.out.println(Math.cbrt(value1));  // Infinity

			    // cube root of a positive number
			    System.out.println(Math.cbrt(value2));  // 3.0

			    // cube root of a negative number
			    System.out.println(Math.cbrt(value3));  // -4.0

			    // cube root of zero
			    System.out.println(Math.cbrt(value4));  // 0.0
			  }
			}
