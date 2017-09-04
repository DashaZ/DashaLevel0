import javax.swing.JOptionPane;

public class AlaskaMadlibs {

	public static void main(String[] args) {
// Put this sentence in a pop up: Here is what happened on my cruise to Alaska
	JOptionPane.showMessageDialog(null, "Here is what happened on my cruise to Alaska.");
// Get the user to enter an adjective.
String adjective=JOptionPane.showInputDialog("Enter an adjective");
// Get the user to enter a verb.
String pluralnoun=JOptionPane.showInputDialog("Enter a plural noun.");
// Get the user to enter a temperature
String temperature=JOptionPane.showInputDialog("Enter a temperature. (Warm, cold, etc.)");
// Get the user to enter a food
String noun30=JOptionPane.showInputDialog("Enter a noun.");
//Get the user to enter a food
String noun32=JOptionPane.showInputDialog("Enter a noun.");
// Get the user to enter a place.
String place=JOptionPane.showInputDialog("Enter a place");
// Get the user to enter an adjective
String adjective2=JOptionPane.showInputDialog("Enter an adjective that ends with ier.");
// Get the user to enter a number
String number=JOptionPane.showInputDialog("Enter a number.");
// Get the user to enter a place
String noun=JOptionPane.showInputDialog("Enter a place");
// Get the user to enter a noun
String noun2=JOptionPane.showInputDialog("Enter a noun");
// Get the user to enter a bathroom item
String bathroomitem=JOptionPane.showInputDialog("Enter a bathroom item");
// Get the user to enter a funny name
String funnyname=JOptionPane.showInputDialog("Enter a funny name");
//Get the user to enter a animal name
String pluralanimal=JOptionPane.showInputDialog("Enter a plural animal.");
// Get the user to enter a drink
String drink=JOptionPane.showInputDialog("Enter the name of a drink.");
// Get the user to enter a book title
String book=JOptionPane.showInputDialog("Enter the title of a book.");
JOptionPane.showMessageDialog(null, "The first thing we did to prepare for the cruise was pack. Make sure you pack your "+adjective+" "+ pluralnoun+ ", \n and some warm clothes. It's " +temperature+ " up there! Next, board the boat. Once on the boat, you should find where your room is. It should look like " +place+ ", except " +adjective2+ ". Next, you go to eat, \n at the all you can eat buffet. Prepare to gain " +number+ " pounds! At the buffet, they have everything from " +noun30+ " to " +noun32+ " Now, you should explore the boat. \n There is everything on it, from pools, to gyms, to even a " +noun+ ". The cruise has several stops, Juneau, \n Skagway, Ketchican, and Victoria. In Juneau, we go dog sledding on a " +noun2+ ". Then, in Skagway, we watch a Vaudville musical about the town's history and their villain: " +bathroomitem+ "y Sam. Then, in Ketchikan, we went hiking in the " +funnyname+ " forest reserve, and saw a lot of " +pluralanimal+ "  We were \n only 2 feet away from them! Finally, we went and drank " +drink+ " at the Gatsby Mansion from the " +book+ ". It was so exiting. Sadly, the trip ended \n and we had to go home again. \n Goodbye Alaska!");
	}

}
