package java1_4_17;


import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){	
			String s1 = input.next();
			String s2 = input.next();
			if(prefix(s1, s2) != "")
				System.out.println("The common prefix is "+prefix(s1,s2));
			else{
				System.out.println("No common prefix");
			}
		}
	}
	
	public static String prefix(String s1 , String s2){
		String s3 = "";
		for(int i =0; i<Math.min(s1.length(), s2.length());i++){
			if(s1.charAt(i) != s2.charAt(i))
				break;
			else{
				s3 += s1.charAt(i);
			}
		}
		if(!s3.equals("")){
			return s3;
		}
		else
			return "";
	}

}
