package test;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean x= true;
		String s="";

		while(x){
			String t = input.nextLine();
			if(!t.equals("end")){
				s += t;
//				System.out.println("132");
			}
			else
				x = false;
		}
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		String s3 = s.replaceAll(s1, s2);
		System.out.println(s3);
	}

}
