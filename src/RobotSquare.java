import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args){
		// 1. Make a new Robot
Robot steve = new Robot();
		// 3. Put the robot's pen down
steve.penDown();
// 6. Make the robot move as fast as possible
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

