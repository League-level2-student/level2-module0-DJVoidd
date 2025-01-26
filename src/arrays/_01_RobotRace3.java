package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace3 {
	//1. make a main method
	public static void main(String[] args) {


		//2. create an array of 5 robots.
		Robot[] robs;
		//3. use a for loop to initialize the robots.
		robs = new Robot[9];
		for (int i = 0; i < 9; i++) {
			robs[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robs[i].setX(0);
			robs[i].setY(295);
			robs[i].setSpeed(10000);
			robs[i].setAngle(2);
		}
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		Random ran = new Random();
		Boolean finish = true;
		JOptionPane.showConfirmDialog(null, "Start Race?");
		while(finish) {
			for (int i = 0; i < robs.length; i++) {
				if (ran.nextBoolean() == true) {
					robs[i].move(5);
					robs[i].turn(2);
				}
				
				
				
				
//				robs[i].move(ran.nextInt(50));
			
				if (robs[i].getY() == 300 && robs[i].getX() == 0) {
					finish = false;
					int j = i+1;
					JOptionPane.showMessageDialog(null, "Robot #" + j + " won!");
				}
			}
		}
	}
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
