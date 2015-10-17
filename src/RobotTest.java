import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void test1() {
		Vector robotPosition = new Vector(0, 0);
		double robotDirection = 0;
		double maxLinearSpeed = 1;
		double maxAngularSpeed = 1;
		double robotRadius = 1;
		Vector target = new Vector(10, 0);
		
		Robot robot = new Robot(new RobotConfig(robotRadius, maxAngularSpeed, maxLinearSpeed), robotPosition, robotDirection);
		AI ai = new AI();
		World world = new World(robot, ai, target);
		world.goToTarget();
		
		assertTrue(world.time <= 10);
	}
	@Test
	public void test2() {
		Vector robotPosition = new Vector(100, 100);
		double robotDirection = 0;
		double maxLinearSpeed = 10;
		double maxAngularSpeed = 1;
		double robotRadius = 50;
		Vector target = new Vector(200, 200);
		
		Robot robot = new Robot(new RobotConfig(robotRadius, maxAngularSpeed, maxLinearSpeed), robotPosition, robotDirection);
		AI ai = new AI();
		World world = new World(robot, ai, target);
		world.goToTarget();
		
		assertTrue(world.time <= 9.93);
	}
	@Test
	public void test3() {
		Vector robotPosition = new Vector(100, 100);
		double robotDirection = 0;
		double maxLinearSpeed = 10;
		double maxAngularSpeed = 1;
		double robotRadius = 50;
		Vector target = new Vector(150, 100);
		
		Robot robot = new Robot(new RobotConfig(robotRadius, maxAngularSpeed, maxLinearSpeed), robotPosition, robotDirection);
		AI ai = new AI();
		World world = new World(robot, ai, target);
		world.goToTarget();
		
		assertTrue(world.time == 0);
	}

}
