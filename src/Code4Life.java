import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		String hours = JOptionPane.showInputDialog("How many hours have you spent coding this week");
		int reply = Integer.parseInt(hours);
		if (reply > 5) {
			playBatmanTheme();
		}
		if (reply >= 3) {
			JOptionPane.showMessageDialog(null, "You are a Code Ninja");
		}
		if (reply < 2) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code instead");
		}
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
