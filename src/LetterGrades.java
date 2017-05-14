import javax.swing.JOptionPane;

public class LetterGrades {

	public static void main(String[] args) {


String percent = JOptionPane.showInputDialog("What percent did you get on the test?");
int p = Integer.parseInt(percent);
if(p >= 100 ){
JOptionPane.showInputDialog("You got an A+!");
}
else if(p >= 93 && p < 100 ){
JOptionPane.showInputDialog("You got an A!");
}
else if(p >= 90 && p < 93 ){
JOptionPane.showInputDialog("You got an A-!");
}
else if(p >= 87 && p < 90 ){
JOptionPane.showInputDialog("You got an B+!");
}
else if(p >= 83 && p < 87 ){
JOptionPane.showInputDialog("You got an B!");
}
else if(p >= 80 && p < 83 ){
JOptionPane.showInputDialog("You got an B-!");
}
else if(p >= 77 && p < 80 ){
JOptionPane.showInputDialog("You got an C+!");
}
else if(p >= 73 && p < 77 ){
JOptionPane.showInputDialog("You got an C!");
}
else if(p >= 70 && p < 73 ){
JOptionPane.showInputDialog("You got an C-!");
}
else if(p >= 67 && p < 70 ){
JOptionPane.showInputDialog("You got an D!");
}
else if(p >= 63 && p < 67 ){
JOptionPane.showInputDialog("You got an D!");
}
else if(p >= 60 && p < 63 ){
JOptionPane.showInputDialog("You got an D-!");
}
else if(p >= 0 && p < 60 ){
JOptionPane.showInputDialog("You got an F!");
}



	}

}
