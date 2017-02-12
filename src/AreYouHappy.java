import java.net.URI;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		boolean keepDoing = false;
		int happy =  JOptionPane.showConfirmDialog(null, "Are You Happy?");
			if(happy == 0){
				keepDoing = true;
				//playVideo()
			}
	else {
			int want = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");

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
	
