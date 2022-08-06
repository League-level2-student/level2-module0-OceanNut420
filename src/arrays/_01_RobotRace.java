package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	
	//2. create an array of 5 robots.
		Robot[] rob = {new Robot(), new Robot(), new Robot(),new Robot(),new Robot()};
	//3. use a for loop to initialize the robots.
		int x = 55;
		for(int i=0;i<2;i++) {
			
		
		//4. make each robot start at the bottom of the screen, side by side, facing up
			rob[i].moveTo(x,275);
			rob[i].setSpeed(10);
			x = x+100;
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		Random rand = new Random();
		int pos[] = {275,275};
		boolean e = false;
		boolean half = false;
		
		while(pos[0]< 1000) {
		for(int i=0;i<2;i++) {
			int ran = rand.nextInt(50);
			rob[i].move(ran);
			rob[i].turn(8);
			pos[i] = rob[i].getY();
			
			int won = i+1;
			if(pos[i] > 300) {
				half = true;
			}
			
			if(pos[i] < 275 && half == true) {
				JOptionPane.showMessageDialog(null, "rob " + won + " wonned! + radio + rob " + won + " gets party");
				e = true;
				break;
				}
			
			}
		if(e = true) {
			break;
		}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//noooooooooooo
	//7. declare that robot the winner and throw it a party!
		//nooooooooooooooooooooooooooo
	//8. try different races with different amounts of robots.
		//noooooooooooooooo
	//9. make the robots race around a circular track.
		
	}
}
