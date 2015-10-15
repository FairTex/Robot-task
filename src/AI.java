
public class AI {
	final double epsilon = 0.001;
	
	public RobotCommand NextMove(Robot robot, double dt, World world) {
		double y = world.target.y - robot.position.y;
		double x = world.target.x - robot.position.x;
		double angle = Math.atan2(y, x); // Угол между роботом и целью
		double rotateAngle = angle - robot.direction; // Угол поворота
		double distance = robot.position.distanceTo(world.target) - robot.config.radius; // Расстояние между роботом и целью

		if (Math.abs(rotateAngle) < epsilon)
			return new RobotCommand(0, robot.config.vMax, dt);

		return new RobotCommand(rotateAngle > 0 ? robot.config.wMax : -robot.config.wMax, 0, dt);
	}
}
