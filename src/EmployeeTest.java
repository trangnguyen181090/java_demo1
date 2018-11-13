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
		SortStars sort = new SortStars();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = scanner.nextInt();
		String increate = scanner.next();
		Boolean inc = new Boolean(increate);
		sort.sort(num, inc);
		
		/* Students */
		Student student = new Student();
		
		
		
	   }

	private static boolean Boolean(String increate) {
		// TODO Auto-generated method stub
		return false;
	}
}
