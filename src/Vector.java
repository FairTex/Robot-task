
public class Vector {
	final public double x;
	final public double y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanceTo(Vector to) {
		double y2 = to.y - this.y;
		double x2 = to.x - this.x;
		return Math.sqrt(y2 * y2 + x2 * x2);
	}
}
