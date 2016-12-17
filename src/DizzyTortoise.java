import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
				
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
String answer = JOptionPane.showInputDialog("On a scale from 1-10, how dizzy do you want the tortoise to be? (10 is the dizziest)");
 // 1. Use the dance method to make the Tortoise spin.
		 
int number = Integer.parseInt(answer);
dance(number);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			
			Tortoise.turn(360);
		}
	}
}
