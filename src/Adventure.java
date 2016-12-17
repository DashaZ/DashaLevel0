import javax.swing.JOptionPane;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String response = JOptionPane.showInputDialog("Welcome to Choose Your Own Adventure! \n "
		+ "Today, we're going to be choosing which path to take in the battle of the Alamo.\n"
		+ " First scenario: You have to choose which side you're on. \n"
		+ "The Mexicans or the Texans. Enter your answer below! ");
	
if (response.equals("Mexicans")){
String gummy = JOptionPane.showInputDialog("You have been offered two positions. \n"
		+ "Drummer boy at the front, or a messenger for more troops.\n "
		+ "Enter your answer below.");
if (gummy.equals("drummer boy at the front")){
JOptionPane.showInputDialog("You were the first to die, \n"
		+ "shot after the first drum.");
}
else if (gummy.equals("messenger for more troops")){
JOptionPane.showInputDialog("You couldn't find troops, but we won anyway. \n "
		+ "Oh well!");
}
}	
else if (response.equals("Texans")){
String answer = JOptionPane.showInputDialog("You have been offered three postions. \n"
		+ "Messenger for more troops or fighter. Enter your answer below.");
if (answer.equals("Fighter")){
JOptionPane.showInputDialog("You died. Sorry.");

}
else if (answer.equals("Messenger for more troops")){
JOptionPane.showInputDialog("You couldn't find help, \n "
		+ "and when you came back, everybody was dead.");
}
}




}
}
