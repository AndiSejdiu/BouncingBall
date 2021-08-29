
public class BallColider {
	MovingBall ball1;
	MovingBall	ball2;
	public BallColider(MovingBall b1,MovingBall b2) {
		ball1=b1;
		ball2=b2;
	}
	
	public boolean hasColided() {
		if(Math.sqrt(Math.pow(ball1.xPosition()-ball2.xPosition(),2)+Math.pow(ball1.yPosition()-ball2.yPosition(),2))>ball1.radiusOf()+ball2.radiusOf()) {
			return false;
		}
		else {
			return true;
		}
	}
	public void change1() {
		double x1=ball1.xPosition();
		double y1=ball1.yPosition();
		double x2=ball2.xPosition();
		double y2=ball2.yPosition();
		double vx1=ball1.xVelocity();
		double vy1=ball1.yVelocity();
		
		double k1=(y2-y1)/(x2-x1);
		double k2=vy1/vx1;
		double k;
	if(vx1!=0) {
	k=(2*k1+k1*k1*k2-k2)/(1+2*k1*k2-k1*k1);
	}
	else {
	k=(-1/k1);
	}
	double solx1=-3/(Math.sqrt(k*k+1));
	double solx2=3/(Math.sqrt(k*k+1));
	double soly1=solx1*k;
	double soly2=solx2*k;
	
	boolean bool=y1>(-1/k1)*x1+(y2*y2-y1*y1+x2*x2-x1*x1)/(2*(y2-y1));
	if(((y1+soly1*2000000)>(-1/k1)*(x1+solx1*2000000)+(y2*y2-y1*y1+x2*x2-x1*x1)/(2*(y2-y1)))==bool) {
		ball1.setxVelocity(solx1);
		ball1.setyVelocity(soly1);
	}
	else {
		ball1.setxVelocity(solx2);
		ball1.setyVelocity(soly2);
	}
	
	
	}
	public void change2() {
		double x1=ball1.xPosition();
		double y1=ball1.yPosition();
		double x2=ball2.xPosition();
		double y2=ball2.yPosition();
		double vx1=ball2.xVelocity();
		double vy1=ball2.yVelocity();
	double k1=(y2-y1)/(x2-x1);
	double k2=vy1/vx1;
	double k;
	if(vx1!=0) {
		k=(2*k1+k1*k1*k2-k2)/(1+2*k1*k2-k1*k1);
		}
		else {
		k=(-1/k1);
		}
	double solx1=-3/(Math.sqrt(k*k+1));
	double solx2=3/(Math.sqrt(k*k+1));
	double soly1=solx1*k;
	double soly2=solx2*k;
	boolean bool=y2>(-1/k1)*x2+(y2*y2-y1*y1+x2*x2-x1*x1)/(2*(y2-y1));
	if(((y2+soly1*2000000)>(-1/k1)*(x2+solx1*2000000)+(y2*y2-y1*y1+x2*x2-x1*x1)/(2*(y2-y1)))==bool) {
		ball2.setxVelocity(solx1);
		ball2.setyVelocity(soly1);
	}
	else {
		ball2.setxVelocity(solx2);
		ball2.setyVelocity(soly2);
	}
	}
}
