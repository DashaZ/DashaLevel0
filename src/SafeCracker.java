import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SafeCracker {
static boolean safeIsCracked = false;
	public static void main(String[] args) {
		/* Your mission: use the tryCode method to crack the safe by trying all possible combinations */
while (!safeIsCracked){
	

String thing = JOptionPane.showInputDialog("Guess a number 1-500.");
int object = Integer.parseInt(thing);
tryCode(object);
	}
	}

	static void tryCode(int guess) {
		System.out.println("trying " + guess);

		int secretCode = we;
		if (guess> secretCode){
		JOptionPane.showMessageDialog(null, "Your number is too big");
		}
		else if (guess < secretCode){
			JOptionPane.showMessageDialog(null, "Your number is too small");
			}

		else if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			safeIsCracked = true;
			
		}
		}
	

	private static void playTheSoundOfSuccess() {
		AudioClip sound;
		try {
			sound = JApplet.newAudioClip(new File("/Users/League/Google Drive/league-sounds/me-gusta.wav").toURI().toURL());
			sound.play();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	

	final static int we = new Random().nextInt(500);
}

