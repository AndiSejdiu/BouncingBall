import java.awt.Color;
import java.awt.Graphics;

public class BallWriter {

	private MovingBall ball1;
	private MovingBall ball2;
	private Color ball1_color;
	private Color ball2_color;
	private BallColider colider;
	
	public BallWriter(MovingBall x1, Color c1,MovingBall x2,Color c2) {
		ball1=x1;
		ball1_color=c1;
		ball2=x2;
		ball2_color=c2;
		colider=new BallColider(ball1,ball2);
	}
	
	public void paint(Graphics g) {
		
		g.setColor(ball1_color);
		int radius1=ball1.radiusOf();
		double x1=ball1.xPosition();
		double y1=ball1.yPosition();
		double x2=ball2.xPosition();
		double y2=ball2.yPosition();
		g.fillOval((int)x1-radius1,(int) y1-radius1,radius1*2,radius1*2);
		
		g.setColor(ball2_color);
		int radius2=ball2.radiusOf();
		g.fillOval((int)x2-radius2,(int) y2-radius2,radius2*2,radius2*2);
		
		
	}
}
