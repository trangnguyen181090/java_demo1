
public class Calculator {
	public static int compute(int item1, String op, int item2) {
		System.out.println("op: " + op);
		switch (op.charAt(0)) {
		case '+':
			return item1 + item2;
		case '-':
			return item1 - item2;
		case '*':
			return item1 * item2;
		case '/':
			return item1 / item2;
		}
		throw new IllegalArgumentException("Unknown operator: " + op);
	}
}
