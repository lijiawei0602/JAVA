package work;

import java.util.Scanner;

public class Main_student {
	public	static void sort(Student[] arr){
		Student t = new Student();
		
		for(int i=0; i<arr.length-1; i++){
			for(int j =0; j<arr.length-i-1;j++){
				if(arr[i].score < arr[j].score){
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生的个数：");
		int count = input.nextInt();
		Student[] arr = new Student[count];
		
		for(int i=0; i<arr.length; i++){
			arr[i]= new Student();
			System.out.print("\n输入名字:");
			arr[i].name = input.next();
			System.out.print("\n输入分数:");
			arr[i].score = input.nextDouble();
		}
		
		sort(arr);
		
		for(int i=arr.length-1; i>=0;i--){
			System.out.print("\n" + arr[i].name + " ");
			System.out.println(arr[i].score);
		}
	}

}
class Student{
	String name;
	double score;
	
}
