import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnimationWriter extends JPanel{
	private BoxWriter box_writer;
	private BallWriter ball_writer;

	
	public AnimationWriter(BoxWriter b,BallWriter l,int size) {
		box_writer=b;
		ball_writer=l;
		JFrame my_frame= new JFrame();
		my_frame.getContentPane().add(this);
			
		my_frame.setTitle("Bouncing Ball");
		my_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		my_frame.setSize(size, size);
		my_frame.setVisible(true);
	}
	public void paintComponent(Graphics g) {
		box_writer.paint(g);
		ball_writer.paint(g);

	}
}
