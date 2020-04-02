package examples;
/*
/Program to have robot draw 4 interlocking squares of different colors
 * @author Yvonne R. Davis
*/

import org.jointheleague.graphical.robot.Robot;

public class IntroToRobot {
	public static void main(String[] args) {
		//count the number of squares drawn
		int square = 1;
		//initialize the degree the robot is turning
		int degree = 90;
		
		//instantiate a new robot
		Robot r2d2 = new Robot();
		
		//set the robot's pen down, determine it's width and the drawing speed of the robot
		r2d2.penDown();
		r2d2.setPenWidth(20);
		r2d2.setSpeed(5);
		
		//do...while loop counts the number of squares and changes the color of the drawing pen
		do 	{	
		//change the color of the drawing line		
		r2d2.setRandomPenColor();
		//for loop draws the 4 walls of the squares
		for (int i = 0; i < 4; i++) {
	
			r2d2.turn(degree);
			r2d2.move(100);
		}
		square++;
			if (square ==2) {
				degree = -90;
			}
			else if 
			(square ==3) {
				r2d2.move(-100);
			}
			else if (square ==4){
				degree = 90;
	
			}
	}
		while (square <= 4);
	}
}