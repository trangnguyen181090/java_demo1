import java.util.ArrayList;
import java.util.List;

public class Student {
	int id;
	String firstName;
	String lastName;
	int age;
	
	public Student() {
		
	};
	
	public Student(int id, String firstName, String lastName, int age) {
		this.id = id;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	}
}

class StudentList {
	private List<Student> students = new ArrayList<>();
	
	// add student to list
	public void addStudent(Student student) {
		students.add(student);
	}
	
	// remove student from list
	public void removeStudent(int id) {
		students.remove(id);
	}
	
	// get list student
	public List<Student> getStudents() {
		return students;
	}
}

