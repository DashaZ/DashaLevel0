import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
 
/**
 * FriendlyRobots: This recipe creates 2 robots in opposite corners of the canvas, and moves them a random distance
 * towards each other until they overlap.
 * 
 *
 */
public class FriendlyRobots {
	// Starting positions
	int xPosLeft = 30;
	int yPosTop = 30;
	int xPosRight = 1200;
	int yPosBottom = 700;
 
	int maxNumGames = 30;
	int maxMoves = 200;
 
	public FriendlyRobots() {
 
		// 1. Create and initialize 2 robots.
 Robot Rob = new Robot();
 Robot Ot = new Robot();
 // Two robots, Rob and Ot. 
		// 2. fill in the steps(a,b, and c) in the setupRobot method.
 // Done
		// 3. call the setupRobot method using your two robots.
 setupRobot(Rob, Color.GRAY);
 setupRobot(Ot, Color.CYAN);
		// 4. Move robots back to the top-right and bottom-left corners
 
int dist = 250;
Rob.move(dist);
Rob.turn(90);
Rob.move(700);
Rob.turn(270);
Rob.move(dist);



Ot.turn(180);
Ot.move(dist);
Ot.turn(90);
Ot.move(dist);
Ot.move(dist);
Ot.turn(270);
Ot.move(50);

		// 5. do steps 5-6 repeatedly.
 
		// 6. use the seek methods below to have the robots find eachother.
for (int i = 0; i < 50; i++) {
 seekX(Rob, Ot);
 seekY(Rob, Ot);
 seekX(Ot, Rob);
 seekY(Ot, Rob);
}
//		// 7.Use the method below to check if robot friends have found each other
// foundFriend(Rob, Ot);
//		// 8. if the robots have found eachother make them sparkle , and dance.
// if(foundFriend(Rob,Ot) == true){
//	 for (int i = 0; i < 10; i++) {
//	 Rob.move(100);
//	 Ot.move(200);
// }
// }
//		// 9. print out the number of times the robots had to move before the found eachother.

//		// 10. use a confirmDialog to ask the user if they want to play again.
//		// repeat the game until the user says no.
// JOptionPane.showConfirmDialog(null, "Do you want to play again?");
}
 


	private void setupRobot(Robot robot, Color robotColor) {
		// a. set the speed of the robot
		robot.setSpeed(10);
		// b. set the pen color
		robot.setPenColor(robotColor);
		// c. put the pen down.
		robot.penDown();
	}
 
	private void seekX(Robot robot, Robot otherRobot) {
		// Move robot a random X distance towards otherRobot
		if (robot.getX() < otherRobot.getX()) {
			robot.setAngle(90);
			robot.move(new Random().nextInt(100));
		} else if (robot.getX() > otherRobot.getX()) {
			robot.setAngle(-90);
			robot.move(new Random().nextInt(100));
		}
		// Keep robot inside canvas
		if (robot.getX() > xPosRight)
			robot.setX(xPosRight);
		else if (robot.getX() < xPosLeft)
			robot.setX(xPosLeft);
	}
 
	private void seekY(Robot robot, Robot otherRobot) {
		// Move robot a random Y distance towards otherRobot
		if (robot.getY() < otherRobot.getY()) {
			robot.setAngle(180);
			robot.move(new Random().nextInt(100));
		} else if (robot.getY() > otherRobot.getY()) {
			robot.setAngle(0);
			robot.move(new Random().nextInt(100));
		}
		// Keep robot inside canvas
		if (robot.getY() > yPosBottom)
			robot.setY(yPosBottom);
		else if (robot.getY() < yPosTop)
			robot.setY(yPosTop);
	}
 
	private Boolean foundFriend(Robot robot1, Robot robot2) {
		// Check whether robots are within 10 pixels of each other
		if (Math.abs(robot1.getX() - robot2.getX()) < 10 && Math.abs(robot1.getY() - robot2.getY()) < 10)
			return true;
		else
			return false;
	}
 
	public static void main(String[] args) {
		new FriendlyRobots();
	}
}
 
 
