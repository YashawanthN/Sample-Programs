package commonInterviewQuestionsJava;

public class duplicateSequence {

	public static void main(String[] args) {
		String str = "auto";
		StringBuffer result = new StringBuffer();
	
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			for(int j=0; j<=i; j++)
			{
				//result.append(ch);
				System.out.println(ch);
			}
			
			//It is just to provide spaces between them
			if(i< str.length()-1)
			{
				result.append(" ");
			}
		}
		System.out.println(result.toString());
	}

}
