import java.io.PushbackReader;
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
	
	public int getId() {
	    return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String fname) {
		this.firstName = fname;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lname) {
		this.lastName = lname;
	}
	
	public int getAge() {
	    return age;
	}
	
	public void setAge(int age) {
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
	
	public int getSize() {
		return students.size();
	}
	
	public Student getById(int id) {
		return students.get(id);
	}
	
	private String getDetail(Student student) {
		return student.getId() + ". " + student.getFirstName() + " " + student.getLastName() + "   " + student.getAge();
	}
	
	public void pasteStudents(List<Student> students) {
		// TODO Auto-generated method stub
		for (int i =0;i<students.size();i++) {
			Student stu = getById(i);
			System.out.println(getDetail(stu));
		}
	}
}

