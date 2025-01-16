package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {


		//2. create an array of 5 robots.
		Robot[] robs;
		//3. use a for loop to initialize the robots.
		robs = new Robot[9];
		for (int i = 0; i < 9; i++) {
			robs[i] = new Robot();
			//4. make each robot start at the bottom of the screen, side by side, facing up
			robs[i].setX(i*100 + 50);
			robs[i].setSpeed(5);
			
		}
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		Random ran = new Random();
		Boolean finish = true;
		JOptionPane.showMessageDialog(null, "Start Race?");
		while(finish) {
			for (Robot robot : robs) {
				robot.move(ran.nextInt(50));
				System.out.println(robot.getY());
				if (robot.getY() < 0) {
					finish = false;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "");
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!

		//8. try different races with different amounts of robots.

		//9. make the robots race around a circular track.
	}
}