import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are You Happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
		} else {
			String want = JOptionPane.showInputDialog("Do you want to be happy?");

			if (want.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
			}
			if (want.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}

		}
	}
}
