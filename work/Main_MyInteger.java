package work;

import java.util.Scanner;

import org.omg.CORBA.portable.ValueBase;

public class Main_MyInteger {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char[] arr = {'1','2'};
		
		MyInteger myInteger1 = new MyInteger(5);
//		MyInteger myInteger2 = new MyInteger(4);
//		MyInteger myInteger3 = new MyInteger(9);
		
		System.out.println(myInteger1.isEven());
		System.out.println(myInteger1.isOdd());
		System.out.println(myInteger1.isPrime());
		
		System.out.println(myInteger1.parseInt(arr));
		System.out.println(myInteger1.parseInt("98715"));
	}
}

class MyInteger{
	private int value;
	int i;
	
	public MyInteger(int value){	//构造方法
		this.value = value;
	}
	
	public	int getValue(){
		return value;
	}
		
	public boolean isEven(int value){
		if(value % 2 == 0){
			return false;
		}
		return true;
	}
	
	
	public boolean isEven(){
		return isEven(this.value);
	}
	
	public boolean isEven(MyInteger myInteger){
		return myInteger.isEven();
	}
	
	public boolean isOdd(int value){
		if(value % 2 == 0){
			return true;
		}
		return false;
	}
	
	public boolean isOdd(){
		return isOdd(this.value);
	}
	
	public boolean isOdd(MyInteger myInteger){
		return myInteger.isOdd();
	}
	
	public boolean isPrime(int value){
		for(i = 1 ; i < value ; i++){
			if(value %2 == 0){
				return false;
			}
		}
		return true;
	}
	
	public boolean isPrime(){
		return isPrime(this.value);
	}
	
	public boolean isPrime(MyInteger myInteger){
		return myInteger.isPrime();
	}
	
	public int parseInt(char[] cs){
		String s = new String(cs);
		return parseInt(s);
	}
	
	public int parseInt(String string){
		String s = new String(string);
		return Integer.valueOf(s);
	}
	
}