import java.awt.Color;

public class BounceTheBall {
 public static void main(String[] args) {
	 int box_size=200;
	 int ball_radius=6;
	 
	 Box box=new Box(box_size,75,75,50,50);
	 MovingBall ball = new MovingBall((int)(box_size/3.0),(int)(box_size/5.0),ball_radius,box,-Math.sqrt(6),Math.sqrt(3));
	 MovingBall ball1=new MovingBall(120,50,ball_radius,box,Math.sqrt(4),Math.sqrt(5));
	 BallWriter ball_writer=new BallWriter(ball,Color.red,ball1,Color.green);
	 BoxWriter box_writer=new BoxWriter(box);
	 AnimationWriter writer =new AnimationWriter(box_writer,ball_writer,box_size);
	 new BounceController(ball,ball1,writer).runAnimation();
	 
 } 
}
