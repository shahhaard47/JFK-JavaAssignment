/*
JFK Java Programming Workshop
This is the solution to programming assignment inside assignment1.md
*/

/*
CHECK LIST FOR KEY PARTS OF SOLUTION: (run your codes first, check with solution to fix; then run again and if it still doesn't work, get in touch with me.)
1. return type 							(lines: 19)
2. else if statements' conditions 		(lines: 25, 28)
3. printDashboard println statements 	(lines: 47-49 + 40)
4. bonus question 'betterDashboard'		(lines: 56-70)
5. Make sure all function calls in main (lines: after 92)
	are proper
*/

class SwagBot {

	// this method should return which direction robot is currently heading
	public static String calculateRobotDirection(double leftSpeed, double rightSpeed) {
		String direction = "";
		// check if robot is turning right
		if (leftSpeed > rightSpeed) {
			direction = "right";
		}
		else if(leftSpeed < rightSpeed) {
			dierction = "left";
		}
		else if(leftSpeed > 0) {
			direction = "fwd";
		}
		else {
			direction = "bkwd";
		}

		return direction; // this return whatever `direction` is back to whoever (whomever?) called it
	}

	// should print summar of data passed in as parameter
	// Notice 'void' in function header, this means function does not return anything
	public static void printDashboard(String name, 
									double leftSpeed, 
									double rightSpeed, 
									String dir, 
									String driveType) {
		// put code here
		// first line
		System.out.println("Robot name: "+name+", Drive type: " + driveType + ", current driving direction: " + dir);
		// second line
		System.out.println("Details: leftSpeed = " + leftSpeed + ", rightSpeed = " + rightSpeed);
	}

	/*
Write a function named "betterDashboard" that does not require "dir" parameter
hint: inside your new function you can call `calculateRobotDirection to get the direction
	*/
	public static void betterDashboard(String name, double leftSpeed, rightSpeed, String driveType) {
		String dir = calculateRobotDirection(leftSpeed, rightSpeed);
		// two ways to do this now:
		// 1. this is the more elegant way
		//		now that we have the direction, we can just call the old function 
		//		to finish the job for us.
		printDashboard(name, leftSpeed, rightSpeed, dir, driveType);

		// OR
		// 2. this is the more brain dead way but still works
		/*
		System.out.println("Robot name: "+name+", Drive type: " + driveType + ", current driving direction: " + dir);
		System.out.println("Details: leftSpeed = " + leftSpeed + ", rightSpeed = " + rightSpeed);
		*/
	}
	

	public static void main(String[] args) {
		final String robotName = "SwagBot";
		double leftSpeed = 0.0; // should be between [-1.0, 1.0]
		double rightSpeed = 0.0;
		String direction = null; // 'left', 'right', 'fwd', 'back'
		String driveType = "tank"; // either 'tank' or 'arcade'

		// call printDashboard to print current state of robot
		direction = calculateRobotDirection(leftSpeed, rightSpeed);
		printDashboard(robotName, leftSpeed, rightSpeed, direction, driveType);

		// make sure robot is stopped
		leftSpeed = 0; rightSpeed = 0;
		direction = calculateRobotDirection(leftSpeed, rightSpeed);
		printDashboard(robotName, leftSpeed, rightSpeed, direction, driveType);

		// go fwd with full speed
		leftSpeed = 1.0;
		rightSpeed = 1.0;
		direction = calculateRobotDirection(leftSpeed, rightSpeed);
		printDashboard(robotName, leftSpeed, rightSpeed, direction, driveType);

		// write code to go fwd with half speed
		leftSpeed = 0.5;
		rightSpeed = 0.5;
		direction = calculateRobotDirection(leftSpeed, rightSpeed);
		printDashboard(robotName, leftSpeed, rightSpeed, direction, driveType);

		// write code to go bkwd with full speed -1, -1
		leftSpeed = -1;
		rightSpeed = -1;
		direction = calculateRobotDirection(leftSpeed, rightSpeed);
		printDashboard(robotName, leftSpeed, rightSpeed, direction, driveType);

		// NOTE: there are multiple ways of turning right
		//		as long as leftSpeed > rightSpeed, robot will turn right
		// write code to turn right
		leftSpeed = 0.5;
		rightSpeed = -0.5;
		direction = calculateRobotDirection(leftSpeed, rightSpeed);
		printDashboard(robotName, leftSpeed, rightSpeed, direction, driveType);

		// NOTE: same as above, there are multiple ways to turn left
		// 		here condition: rightSpeed > leftSpeed has to hold true
		// write code to turn left
		leftSpeed = -1;
		rightSpeed = 1;
		direction = calculateRobotDirection(leftSpeed, rightSpeed);
		printDashboard(robotName, leftSpeed, rightSpeed, direction, driveType);
	}
}