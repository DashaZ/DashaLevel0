import javax.swing.JOptionPane;

public class Myage {

	public static void main(String[] args) {
		String myString;
		String input = JOptionPane.showInputDialog("What is your age?");
		int age = Integer.parseInt(input);
		myString = ("You have been one year old.\n");

		for (int i = 2; i < age; i++) {
			myString = myString + " You have been " + i + " years old\n";

		}
		JOptionPane.showMessageDialog(null, myString);
	}

}
