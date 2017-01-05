package work;

public class Main_person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Student1 student = new Student1();
		Employee employee = new Employee();
		Faculty faculty = new Faculty();
		Staff staff = new Staff();
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}
class Person{
	String name;
	String address;
	String phoneNum;
	String mailAddress;
	public String toString(){
		return "Person";
	}
}
class Student1 extends Person{
	final String grade = "¥Û“ª";
	public String toString() {
		return "Student";
	}
}
class Employee extends Person{
	String office;
	double salary;
	MyDate date;
	public String toString() {
		return "Employee";
	}
}
class MyDate{
	int year,month,day;
}
class Faculty extends Employee{
	int time;
	String grade;
	public String toString() {
		return "Faculty";
	}
}
class Staff extends Employee{
	String name;
	public String toString(){
		return "Staff";
	}
}
