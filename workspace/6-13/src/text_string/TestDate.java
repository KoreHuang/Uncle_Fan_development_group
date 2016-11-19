package text_string;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDate {
	public static void main(String[] args) {
		Date date = new Date(0);
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String sDate = format.format(date);
		System.out.println(sDate);
		
		Calendar dar = Calendar.getInstance();
		
		System.out.println(dar.get(Calendar.YEAR));
		System.out.println(dar.get(Calendar.MONTH));
		System.out.println(dar.get(Calendar.DATE));
		
	}
	
}
