//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickelnumb = (JOptionPane.showInputDialog("How many nickels do you have?"));
		// Convert their answer to an int using Integer.parseInt()
int nickelint = Integer.parseInt(nickelnumb);
		// Ask the user how many dimes they have, and convert their answer
String dimenumb = (JOptionPane.showInputDialog("How many dimes do you have?"));
int dimeint = Integer.parseInt(dimenumb);
		// Ask the user how many quarters they have, and convert their answer
String quarternumb = (JOptionPane.showInputDialog("How many quarters do you have?"));
int quarterint = Integer.parseInt(quarternumb);
		// Calculate how much money the user has and save it in a double variable 
Double nickelcash = nickelint*0.05;
Double dimecash = dimeint*0.1;
Double quartercash = quarterint*0.25;
Double totalcash = nickelcash + dimecash+ quartercash;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $" + totalcash);
	}
}

