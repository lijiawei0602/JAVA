package work;

public class Main_course {

	public static void main(String[] args) {
		// TODO Auto-generated method stu00000000000000000....................b
		Course course = new Course("JAVA");
		course.addStudent("Àî¼ÑÎ°");
		System.out.println(course.getStudents());
		System.out.println(course.getNumberOfStudents());
	}

}
class Course{
	private String courseName;
	private java.util.ArrayList students = new java.util.ArrayList();
	private int numberOfStudents;
	
	public Course(String courseName){
		this.courseName = courseName;
	}
	public void addStudent(String student){
		students.add(student);
	}
	public java.util.ArrayList getStudents(){
		return students;
	}
	public int getNumberOfStudents(){
		return students.size();
	}
	public String getCourseName(){
		return courseName;
	}
}