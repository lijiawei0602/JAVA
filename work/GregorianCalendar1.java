package work;

import java.util.GregorianCalendar;

public class GregorianCalendar1 {

	public static void main(String[] args) {
		GregorianCalendar gre = new GregorianCalendar();
		System.out.println(gre.get(GregorianCalendar.YEAR) +" "+ (gre.get(GregorianCalendar.MONTH)+1) +" "+ gre.get(GregorianCalendar.DAY_OF_MONTH));
		gre.setTimeInMillis(1234567898765L);
		System.out.println(gre.get(GregorianCalendar.YEAR) +" "+ (gre.get(GregorianCalendar.MONTH)+1) +" "+ gre.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
