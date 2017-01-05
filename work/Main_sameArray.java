package work;

import java.util.Scanner;

public class Main_sameArray {
	public static boolean equal(int[] list1 , int[] list2){
		for(int i=0;i<list1.length;i++){
			if(list1[i] != list2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] list1 = new int[5];
		int[] list2 = new int[5];
		
		System.out.println("输入数组一：");
		for(int i=0;i<list1.length;i++){
			list1[i] = input.nextInt();
		}
		System.out.println("输入数组二：");
		for(int i =0; i<list2.length;i++){
			list2[i] = input.nextInt();
		}
		if(equal(list1, list2)){
			System.out.println("Two lists are same");
		}
		else
			System.out.println("Two lists are identical");
	}

}
