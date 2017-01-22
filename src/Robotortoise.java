// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;




public class Robotortoise {
	public static void main(String[] args) {

		//3. ask the user what color they would like the tortoise to draw
		
		//4. use an if/else statement to set the pen color that the user requested

//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	//1. make the tortoise draw a shape (this will take more than one line of code)
Robot steve = new Robot ();
steve.penDown();
//6. Make the robot move as fast as possible
steve.setSpeed(10);
		// 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	steve.setRandomPenColor();
	steve.move(500);
steve.turn(90);
	
}
		// 		2. Move your robot 200 pixels
steve.move(450);
		// 		4. Turn the robot 90 degrees to the right (90 degrees)
steve.turn(90);

	}
	}



