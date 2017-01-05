package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Name_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] array = new String[n];
		for(int i =0; i<array.length; i++){
			array[i] = input.next();
		}
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
