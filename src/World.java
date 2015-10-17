
public class World {
	private Robot robot;
	final AI ai;
	final Vector target;
	final double dt = 0.001;
	public double time = 0;
	
	public World (Robot robot, AI ai, Vector target) {
		this.robot = robot;
		this.ai = ai;
		this.target = target;
	}
	
	public void goToTarget() {
		while (true) {
			if (robot.didAchieve(target)) break;
			RobotCommand command = ai.nextMove(robot, dt, this);
			robot = robot.move(command);
			time += dt;
		}
	}
}
