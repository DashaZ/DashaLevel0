import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[]args){
	String notcrush = JOptionPane.showInputDialog("Who do you NOT like?");
	JOptionPane.showMessageDialog(null, "You totally have a crush on " + notcrush + "!");
String bestfriend = JOptionPane.showInputDialog("Who is your best friend?");
JOptionPane.showMessageDialog(null, bestfriend + " is as sweet as candy!");
	}
}
