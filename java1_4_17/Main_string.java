package java1_4_17;

import java.util.Scanner;

public class Main_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
//		boolean a;
		System.out.println(jundge(s));
	}
	public static boolean jundge(String s){
		int i,num=0;
		
		if(s.charAt(0) == '-')
			s = s.substring(1);
		if( !Character.isDigit(s.charAt(0)) || !Character.isDigit(s.charAt(s.length()-1)) )
			return false;
		
		for(i=1;i<s.length()-1;i++){
			if(!Character.isDigit(s.charAt(i))){
				if(s.charAt(i) == '.')
					num++;
				else
					return false;
			}
		}
		
		if(num >1)
			return false;
		return true;
	}

}


















