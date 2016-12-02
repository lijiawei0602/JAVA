package work;

import java.util.Scanner;

public class UpperString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int j=0;
		for(int i=0; i<s.length();i++){
			if(s.charAt(i) >='A' && s.charAt(i) <='Z'){
				System.out.print(s.charAt(i));
				j++;
			}
		}
		System.out.print("\n"+j);
	}

}
