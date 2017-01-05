package java12_9_16;

import java.util.*;
public class Main_binary {
	
	public static <E extends Comparable<E>> int binarySearch(E[] list ,E key){
		int low=0,high=list.length,middle;
		middle = (low + high)/2;
		while(low <= high){
			if(list[middle].compareTo(key)<0){
				low = middle+1;
				middle = (low + high)/2;
			}
			if(list[middle].compareTo(key) >0){
				high = middle -1;
				middle = (low + high)/2;
			}
			if(list[middle].compareTo(key) == 0){
				return middle;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = binarySearch(new Integer[] {1 , 2 , 3 , 4 ,5 } , 5);
		System.out.println("查找到对应值的下标："+ res);
	}

}
