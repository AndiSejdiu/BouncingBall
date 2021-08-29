
public class BounceController {
 
	private MovingBall ball;
	private MovingBall ball1;
	private AnimationWriter writer;
	BallColider colider;
	public BounceController(MovingBall b,MovingBall b2,AnimationWriter w) {
		
		ball=b;
		ball1=b2;
		colider=new BallColider(ball,ball1);
		writer=w;
	}
	
	public void runAnimation() {
		int time_unit=1;
		int painting_delay=10;
		while(true) {
			delay(painting_delay);
	
			ball.move(time_unit);
			ball1.move(time_unit);
			if(colider.hasColided()) {
				colider.change1();
				colider.change2();
			}
			writer.repaint();
		}
	}
		
	public void delay(int how_long) {
		
		try {
			Thread.sleep(how_long);
		} catch(Exception e ) {}
	}
	
}
