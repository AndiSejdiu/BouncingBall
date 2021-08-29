import java.awt.Color;
import java.awt.Graphics;



public class BoxWriter {

	Box box;
	
	public BoxWriter(Box b) {
		box=b;
	}
	
	public void paint(Graphics g) {
		int size=box.sizeof();
		g.setColor(Color.white);
		g.fillRect(0, 0, size, size);
		g.setColor(Color.black);
		g.drawRect(0, 0, size, size);
		g.setColor(Color.lightGray);
		g.fillRect(box.getXPosBarrier(), box.getYPosBarrier(), box.getWidthBarrier(), box.getHeightBarrier());
		g.setColor(Color.black);
		g.drawRect(box.getXPosBarrier(), box.getYPosBarrier(), box.getWidthBarrier(), box.getHeightBarrier());
	}
}
