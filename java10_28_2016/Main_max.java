package java10_28_2016;


import java.util.*;

import java.util.Scanner;

public class Main_max {
	public static Object max(Comparable[] o){
		Object m = o[0];
		for(int i =0;i<o.length;i++){
			if(((Comparable) m).compareTo(o[i])<0 ){
				m=o[i];
			}
		}
		return m;
	}
	public static void main(String[] args){
		Integer[] crr = {1,2,3,2};
		System.out.println("�������"+max(crr));
		String[] arr = {"sda","dasdas","dasda"};
		System.out.println("�ַ������"+max(arr));		 
		System.out.println("�������"+max(new Date[]{new Date(2066,2,14),new Date(2013,3,56),new Date(2003,5,6)} ));
	}
}

