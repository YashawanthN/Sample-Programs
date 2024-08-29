package sampleProgrames.Strings;

public class matchesString {
	// check whether a string contains only numbers

	  public static void main(String[] args) {

	    // a search pattern for only numbers
	    String regex = "^[0-9]+$";

	    System.out.println("123a".matches(regex)); // false
	    System.out.println("98416".matches(regex)); // true

	    System.out.println("98 41".matches(regex)); // false
	    
	    System.out.println("*************************");
	    
	    String regex1 = "^a...s$";

	    System.out.println("abs".matches(regex1)); // false
	    System.out.println("alias".matches(regex1)); // true
	    System.out.println("an abacus".matches(regex1)); // false

	    System.out.println("abyss".matches(regex1)); // true
	  }
	}

