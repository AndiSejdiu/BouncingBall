
public class Box {

private int box_size;
private int xPosBarrier;
private int yPosBarrier;
private int widthBarrier;
private int heightBarrier;

public Box(int size,int xPos,int yPos,int width,int height) {
	box_size=size;
	 xPosBarrier=xPos;
	 yPosBarrier=yPos;
	 widthBarrier=width;
	 heightBarrier=height;
}

public boolean inVerticalBarrierContact(double x_pos,double y_pos,int radius) {
	if(x_pos<xPosBarrier-2&&y_pos+radius/2+1> yPosBarrier&&y_pos-radius/2-1< yPosBarrier+heightBarrier&&x_pos+radius>xPosBarrier) {return true;}
	else if(x_pos>widthBarrier+xPosBarrier+2&&(y_pos+radius/2+1> yPosBarrier&&y_pos-radius/2-1< yPosBarrier+heightBarrier)&&x_pos-radius<xPosBarrier+widthBarrier) {	return true;}
	else {
	return false;
	}
}
public boolean inHorizontalBarrierContact(double x_pos,double y_pos,int radius) {
	if(y_pos<yPosBarrier-2&&(x_pos+radius/2+1> xPosBarrier&&x_pos-radius/2-1< xPosBarrier+widthBarrier)&&y_pos+radius>yPosBarrier) {return true;}
	else if(y_pos>heightBarrier+yPosBarrier+2&&(x_pos+radius/2+1> xPosBarrier&&x_pos-radius/2-1< xPosBarrier+widthBarrier)&&y_pos-radius<yPosBarrier+heightBarrier) {	return true;}
	else {
	return false;
	}
}
public boolean inHorozontalContact(double x_pos,int radius) {
	return(x_pos-radius<=0)||(x_pos+radius>=box_size);
}

public boolean inVerticalContact(double y_pos,int radius) {
	return(y_pos-radius<=0)||(y_pos+radius>=box_size);
}
public int sizeof() {
	return box_size;
}
public int getXPosBarrier() {
	return xPosBarrier;
}
public int getYPosBarrier() {
	return yPosBarrier;
}
public int getWidthBarrier() {
	return widthBarrier;
}
public int getHeightBarrier() {
	return heightBarrier;
}

}
