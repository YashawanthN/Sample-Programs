package commonInterviewQuestionsJava;

public class reverseofString {

	public static void main(String[] args) {
		String name = "Yashawanth";
		char rev;
		String reverseName = "";
		
		for(int i = 0 ; i< name.length(); i++)
		{
			System.out.println(name.charAt(i));
			rev = name.charAt(i);
			reverseName = rev+reverseName;
		}
		System.out.println(reverseName);

	}

}
