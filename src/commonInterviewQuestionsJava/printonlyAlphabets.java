package commonInterviewQuestionsJava;

public class printonlyAlphabets {

	public static void main(String[] args) {
		String str = "Auto@#12";
		
		 String alphabetsOnly = str.replaceAll("[a-zA-Z]", "");
		 System.out.println(alphabetsOnly);

	}

}
