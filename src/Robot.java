
public class Robot {
	final RobotConfig config;
	final Vector position;
	final double direction;
	
	public Robot(RobotConfig config, Vector position, double direction) {
		this.config = config;
		this.position = position;
		this.direction = direction;
	}
	
	public Robot move (RobotCommand command) {
		double distance = command.velocity * command.dt;
		double newY = Math.sin(direction) * distance;
		double newX = Math.cos(direction) * distance;
		
		return new Robot(config, 
				new Vector(position.x + newX, position.y + newY), 
				direction + command.angleVelocity * command.dt);
	}
	
	public boolean didAchieve(Vector target) {
		return position.distanceTo(target) <= config.radius;
	}
	
}
