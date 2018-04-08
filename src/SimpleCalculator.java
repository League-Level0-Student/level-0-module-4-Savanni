
import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for (int i = 0; i < 5; i++) {

			String num1 = JOptionPane.showInputDialog("Give me a number");
			String num2 = JOptionPane.showInputDialog("Give me another number");
			int num1v = Integer.parseInt(num1);
			int num2v = Integer.parseInt(num2);
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.

			int operation = JOptionPane.showOptionDialog(null, "What do you want to do with the numbers?", "Calculator",
					0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
					null);

			// 5. Call the methods created in steps 3 and 4 to perform the appropriate
			// operation.
			if (operation == 0) {
				add(num1v, num2v);
			}
			if (operation == 1) {
				subtract(num1v, num2v);
			}
			if (operation == 2) {
				multiply(num1v, num2v);
			}
			if (operation == 3) {
				divide(num1v, num2v);
			}
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + num2);
	}

	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 - num2);
	}

	static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 * num2);
	}

	static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, (double) num1 / (double) num2);
	}
}