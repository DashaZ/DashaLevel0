 import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;


// Copyright Wintriss Technical Schools 2013
public class HighLowGame {


	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99)+1;
		// 2. Print out the random variable above
		// 11. do the following 10 times
for (int i = 0; i < 10; i++) {
	String guess=JOptionPane.showInputDialog("Guess a number.");

	// 4. convert the users’ answer to an int (Integer.parseInt(string))
int reply=Integer.parseInt(guess);
	// 5. if the guess is correct
		// 6. win
if (random==reply){
JOptionPane.showMessageDialog(null, "You win!");
}
	// 7. if the guess is high
		// 8. tell them it's too high
if (random<reply){
JOptionPane.showMessageDialog(null, "Your guess is too high.");
}
	// 9. if the guess is low
		// 10. tell them it's too low
if (random>reply){
JOptionPane.showMessageDialog(null, "Your guess is too low.");
}

// 12. tell them they lose

}
JOptionPane.showMessageDialog(null, "Nice Job.");
	}
}




	



