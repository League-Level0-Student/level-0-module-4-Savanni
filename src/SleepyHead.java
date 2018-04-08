
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday = false, isVacation = false;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
		int ans = JOptionPane.showConfirmDialog(null, "Is it a weekday?");
		if (ans == 0) {
isWeekday = true;

		}
		if (ans == 1) {
		isWeekday = false;
		}
int vac = JOptionPane.showConfirmDialog(null, "Are you on vacation?");
if (vac == 0) {
	isVacation = true;
}
if (vac == 1) {
	isVacation = false;
}
if (isVacation == true) {
	JOptionPane.showMessageDialog(null, "Sleep in");
}
if (isWeekday == true && isVacation == true) {
	JOptionPane.showMessageDialog(null, "Sleep in");
}
if (isWeekday == false && isVacation == true) {
	JOptionPane.showMessageDialog(null, "Sleep in");
}
if (isWeekday == true && isVacation == false) {
	JOptionPane.showMessageDialog(null, "Get up to another pointless day of living, loser.");
}
		// 1 = no
		// 0 = yes
		// 2 = cancel
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
