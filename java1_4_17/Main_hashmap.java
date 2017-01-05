package java1_4_17;

import java.util.HashMap;
import java.util.Scanner;

public class Main_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Double> hm = new HashMap<String , Double>();
		String s;
		double score;
		Scanner input = new Scanner(System.in);
		
		
		
		while(true){
			
			s = input.next();
			if(s.equals("noname")){
				break;
			}
			score = input.nextDouble();
			hm.put(s, score);
		}
		
		
		String query = input.next();
		if(hm.get(query) == null){
			System.out.println("Not found.");
		}
		else
			System.out.println(hm.get(query) * 0.21);
	}

}
