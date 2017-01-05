package work;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name:");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked in a week:");
		int hour = input.nextInt();
		System.out.println("Enter hourly pay rate:");
		double pay = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double federal_tax = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double state_tax = input.nextDouble();
		
		DecimalFormat df= new DecimalFormat("#.00");
		double deduction1 = hour * pay * federal_tax;
		double deduction2 = hour * pay * state_tax;
		double deduction = deduction1 + deduction2;
		double new_pay = hour * pay - deduction;
		System.out.println(df.format(new_pay));
		input.close();
	}

}
