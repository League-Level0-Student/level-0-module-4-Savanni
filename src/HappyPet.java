import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you you want to buy?");
		int happy = 0;
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 100; i++) {

			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cuddle", "Feed", "Groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				JOptionPane.showMessageDialog(null, "Your pet seems very happy to be with you!");
				happy++;
			}
			if (task == 1) {
				JOptionPane.showMessageDialog(null, "Your pet is well fed and is feeling ready to play!");
				happy++;
			}
			if (task == 2) {
				JOptionPane.showMessageDialog(null, "Your dog is looking good and happy!");
				happy++;
			}
			if (happy == 3) {
				JOptionPane.showMessageDialog(null, "Your pet is happy, but thinks you could use a break. It's not you, it's the pet.");
				break;
			}
		}
	}

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
}