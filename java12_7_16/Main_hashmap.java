package java12_7_16;

import java.util.HashMap;
import java.util.Scanner;

public class Main_hashmap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashMap = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		hashMap.put("ɽ��", "̫ԭ");
		hashMap.put("����", "����");
		hashMap.put("����", "����");
		String province = input.nextLine();
		System.out.println(province+"�е�ʡ�����:"+hashMap.get(province));
	}

}
