
public class Program {
	public static void main (String[] args) {
		Vector robotPosition = new Vector(0, 0);
		double robotDirection = 0;
		double maxLinearSpeed = 1;
		double maxAngularSpeed = 1;
		double robotRadius = 1;
		Vector target = new Vector(0, 10);
		
		Robot robot = new Robot(new RobotConfig(robotRadius, maxAngularSpeed, maxLinearSpeed), robotPosition, robotDirection);
		AI ai = new AI();
		World world = new World(robot, ai, target);
		double time = world.calculateTimeToTarget();
		
		System.out.println(time);
	}
}
