
public class MovingBall {

	private double x_pos;
	private double y_pos;
	private int radius;
	
	private double x_velocity=3;
	private double y_velocity=4;
	
	private Box container;
	
	public MovingBall(double x_initial,double y_initial,int r,Box box,double x_v,double y_v) {
		x_pos=x_initial;
		y_pos=y_initial;
		radius=r;
		container=box;
		x_velocity=x_v;
		y_velocity=y_v;
	}
	
	public double xPosition() {
		return x_pos;
	}
	
	public double yPosition() {
		return y_pos;
	}
	public double xVelocity() {
		return x_velocity;
	}
	public double yVelocity() {
		return y_velocity;
	}
	public void setxVelocity(double x) {
		x_velocity=x;
	}
	public void setyVelocity(double y) {
		y_velocity=y;
	}
	public int radiusOf() {
		return radius;
	}
	public void move(double time_units) {
		x_pos+=x_velocity*time_units;
		y_pos+=y_velocity*time_units;
		
		if(container.inHorozontalContact(x_pos, radius)||container.inVerticalBarrierContact(x_pos, y_pos, radius)) {
			x_velocity=-x_velocity;

		}
		if(container.inVerticalContact(y_pos, radius)||container.inHorizontalBarrierContact(x_pos, y_pos, radius)) {
			y_velocity=-y_velocity;
		}
		

	}

}
	
	

