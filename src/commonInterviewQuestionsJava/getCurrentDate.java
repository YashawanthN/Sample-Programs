package commonInterviewQuestionsJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class getCurrentDate {

	public static void main(String[] args) {
		DateFormat dateformat = new SimpleDateFormat("dd-mm-yy hh:mm:ss");
		Date currentDate = new Date();
		System.out.println(dateformat.format(currentDate));

	}

}
