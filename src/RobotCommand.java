
public class RobotCommand {
	final double velocity;
	final double angleVelocity;
	final double dt;
	
	public RobotCommand (double w, double v, double dt) {
		velocity = v;
		angleVelocity = w;
		this.dt = dt;
	}
}
