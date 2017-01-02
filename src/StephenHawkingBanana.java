// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class StephenHawkingBanana
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
String banana = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
if(banana.equalsIgnoreCase("no")){
speak("You are crazy! This quiz is over.");
}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
else if(banana.equalsIgnoreCase("yes")){
String hobby=JOptionPane.showInputDialog(null, "What is your favorite hobby? ");
speak( hobby+" is much better with bananas!");
}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
else{
speak( "You are bananas!");
}
	}
		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
static void speak(String words) {
	 try {
		 Runtime.getRuntime().exec("say " + words).waitFor();
	 } catch (Exception e) {
		 e.printStackTrace();
	}

}
}
