import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {
static int SAD = 1;
static int ANGRY = 2;
static int HAPPY = 0;
	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What is your mood?", "#MyPersonalSoundtrack", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Angry" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a angry mood, use the playVideo method to play a calming song from YouTube.
if(userMood == 2){
 playVideo("https:www.youtube.com/watch?v=4D8ezH0iXh8");
}
		// 4. Play different songs for other moods.
if(userMood == 1){
	 playVideo("");
	}
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
