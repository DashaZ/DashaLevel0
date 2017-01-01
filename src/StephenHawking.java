import javax.swing.JOptionPane;

public class StephenHawking {

	public static void main(String[] args) {
String thing = JOptionPane.showInputDialog("When should I stop counting?");
for (int i = 1; i < Integer.parseInt(thing); i++) {
if(i%5==0 && i%3==0){
speak("FizzBuzz");
}
else if(i%3==0){
speak("Fizz");
}
else if(i%5==0){
speak("Buzz");
}
else{
speak(Integer.toString(i));
}
	}

}

	static void speak(String words) {
		 try {
			 Runtime.getRuntime().exec("say " + words).waitFor();
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	}
}
