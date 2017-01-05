package java12_7_16;

import java.util.HashMap;
import java.util.Scanner;

public class Main_hashmap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashMap = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		hashMap.put("山西", "太原");
		hashMap.put("陕西", "西安");
		hashMap.put("北京", "北京");
		String province = input.nextLine();
		System.out.println(province+"市的省会城市:"+hashMap.get(province));
	}

}
