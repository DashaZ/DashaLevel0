
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Dasha = "You control fire";
String Keith = "You can stretch like rubber";
String Mr_Stephen = "You can create a door in anything you touch";
String Dylan = "You";
String Dylan1 = "You are a giant cyborg";
String Eshaan = "";
String Joanne = "You can turn people into toys";
String David = "";
String Kaylay = "";
String Miller = "";
String Shiva = "You can multiply your hands and feet";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String answer=JOptionPane.showInputDialog("Enter a name. Any name.");
		// 3. Show the superpower in a pop-up, depending on the name entered.
if(answer.equals("Dasha")){
JOptionPane.showMessageDialog(null, Dasha);
}
else if(answer.equals("Keith")){
JOptionPane.showMessageDialog(null, Keith);
}
else if(answer.equals("Mr_Stephen")){
JOptionPane.showMessageDialog(null, Mr_Stephen);
}
else{JOptionPane.showMessageDialog(null, "You don't have a superpower.");
}

	}
}
