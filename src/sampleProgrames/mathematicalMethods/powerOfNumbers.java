package sampleProgrames.mathematicalMethods;

public class powerOfNumbers {

	public static void main(String[] args) {

			    // create a double variable
			    double num1 = 5.0;
			    double num2 = 3.0;

			    // Math.pow() with positive numbers
			    System.out.println(Math.pow(num1, num2));  // 125.0


			    // Math.pow() with zero
			    double zero = 0.0;
			    System.out.println(Math.pow(num1, zero));    // 0.0
			    System.out.println(Math.pow(zero, num2));    // 1.0


			    // Math.pow() with infinity
			    double infinity = Double.POSITIVE_INFINITY;
			    System.out.println(Math.pow(num1, infinity));  // Infinity
			    System.out.println(Math.pow(infinity, num2));  // Infinity


			    // Math.pow() with negative numbers
			    System.out.println(Math.pow(-num1, -num2));    // 0.008

			  }
			}

