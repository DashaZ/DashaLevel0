import java.net.URI;

import javax.swing.JOptionPane;

public class AreYouHappy {
	static int YES = 0;
	static int NO = 1;
	public static void main(String[] args) {
		boolean keepDoing = false;
		int happy =  JOptionPane.showConfirmDialog(null, "Are You Happy?");
			if(happy == 0){
				keepDoing = true;
				playVideo("http:www.youtube.com/watch?v=H0m3Lfkzcw4");
			}
	else {
			int want = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
//this is fun
			if (want == 1) {
				keepDoing=true;
			}
			if (want == 0) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		
		}
	
	if(keepDoing){
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");

		}
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
	
