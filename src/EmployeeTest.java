import java.util.Scanner;

public class EmployeeTest {
	public static void main(String args[]) {
	      /* Create two objects using constructor */
		
//	      Employee empOne = new Employee("James Smith");
//	      Employee empTwo = new Employee("Mary Anne");
//
//	      // Invoking methods for each object created
//	      empOne.empAge(26);
//	      empOne.empDesignation("Senior Software Engineer");
//	      empOne.empSalary(1000);
//	      empOne.printEmployee();
//
//	      empTwo.empAge(21);
//	      empTwo.empDesignation("Software Engineer");
//	      empTwo.empSalary(500);
//	      empTwo.printEmployee();
	      
	      /* Caculator */
		
//		Calculator cal = new Calculator();
//		System.out.println("Please enter your calculator");
//		Scanner scanner = new Scanner(System.in);
//		int item1 = scanner.nextInt();
//		String op = scanner.next();
//		int item2 = scanner.nextInt();
//		
//		System.out.println(cal.compute(item1, op, item2));
//		scanner.reset();
		
		/* Print Fibonacci series*/
		
//		Fibonacci fib = new Fibonacci();
//		
//		System.out.println("Please enter number which print Fibonacci: ");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		fib.fib(num);			
		
		/* Print star */
//		SortStars sort = new SortStars();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please enter number: ");
//		int num = scanner.nextInt();
//		String increate = scanner.next();
//		Boolean inc = new Boolean(increate);
//		sort.sort(num, inc);
		
		/* Students */
		Student student = new Student();
		
		StudentList students = new StudentList();
		students.addStudent(new Student(1, "Trang", "Nguyen", 28));
		students.addStudent(new Student(2, "Minh", "Nguyen", 29));

//		System.out.println("List of students:");
//		System.out.println(students.getStudents());
//		System.out.println(students.getSize());
//		students.addStudent(new Student(3, "Hung", "Nguyen", 28));
//		
//		System.out.println(students.getStudents());
//		System.out.println(students.getSize());
//		
//		System.out.println("Remove student");
//		students.removeStudent(0);
//		System.out.println(students.getStudents());
//		System.out.println(students.getSize());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please select option to make the feature below: ");
		System.out.println("1. Add student");
		System.out.println("2. Delete student");
		System.out.println("3. List students");
		int option;
		do {
			option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Please enter new Student");
				System.out.println("Enter id:");
				int id = scanner.nextInt();
				System.out.println("Enter First name:");
				String fName = scanner.next();
				System.out.println("Enter Last name:");
				String lName = scanner.next();
				System.out.println("Enter age:");
				int age = scanner.nextInt();
				
				students.addStudent(new Student(id, fName, lName, age));
				System.out.println("Add Student successfully!. List students:");
				students.pasteStudents(students.getStudents());
				break;
			case 2:
				System.out.println("Please enter student who you want to deleted (by id):");
				int idDel = scanner.nextInt();
				students.removeStudent(idDel);
				System.out.println("List students after deleted: ");
				students.pasteStudents(students.getStudents());
				break;
			case 3:
				System.out.println("List students: ");
				students.pasteStudents(students.getStudents());
				break;
			default:
				break;
			}
		} while (option != 4);
		
		
	   }

	private static boolean Boolean(String increate) {
		// TODO Auto-generated method stub
		return false;
	}
}
