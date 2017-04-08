import javax.swing.JOptionPane;

public class Quizlet {
static int YES = 0;
static int NO = 1;
static int WHAT = 2;
	public static void main(String[] args) {
int score = 0;
System.out.println("score = " + score);
int answer = JOptionPane.showOptionDialog(null, "Was New Mexico Ever a Part of Mexico?", "#GeographyQuiz", 0,
	JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No", "What" }, null);
 if(answer==0){
score++;
System.out.println("score = " + score);
int answer2 = JOptionPane.showOptionDialog(null, "Is New Zealand Part of Australia?", "#GeographyQuiz", 0,
		 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No", "What" }, null);
if(answer2==1){
	score++;
	System.out.println("score = " + score);
	int answer3 = JOptionPane.showOptionDialog(null, "What is the most common first name in the world?", "#GeographyQuiz", 0,
			 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Joe", "Mohammed", "Sophia" }, null);
	if(answer3==1){
		score++;
		System.out.println("score = " + score);
		int answer4 = JOptionPane.showOptionDialog(null, "Did you like this quiz?", "#GeographyQuiz", 0,
				 JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Yes", "No", "What" }, null);
			score++;
			System.out.println("score = " + score);
		
	
	
	}else{
		 score--;
		 System.out.println("score = " + score);
		 JOptionPane.showMessageDialog(null, "You lose!");
	 }
	
}
	 else{
		 score--;
		 System.out.println("score = " + score);
		 JOptionPane.showMessageDialog(null, "You lose!");
	 }
}
else{
	score--;
	System.out.println("score = " + score);
	JOptionPane.showMessageDialog(null, "You lose!");
}
	
 
 
	}
  
}



	
	
 
	


