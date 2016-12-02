package test;

import java.sql.Date;
import java.util.Scanner;

public class Main_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long a = input.nextLong();
		long b = input.nextLong();
		
		long c = a+b * 24 * 60 * 60 * 1000;
		Date date1 = new Date(a);
		Date date2 = new Date(c);
		
		System.out.println(date1);
		System.out.println(date2);
	}

}
