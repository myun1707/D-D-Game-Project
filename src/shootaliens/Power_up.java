package shootaliens;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Power_up {
private double x;
private double y;
private int r;
private int type;
private Color color1;

public Power_up(int type , double x, double y) {
	
	this.type = type;
	this.x = x;
	this.y = y;
	
	//if (type = 1) {
		//color1 = Color.PINK;}
	//if(type = 2 ){
		//color1 = Color.YELLOW;
	}
	//}
	public double getx() {return x;}
	public double gety() {return y;}
	public double getr() {return r;}
	
	public int getType() { return type;}
	
	public boolean update() {
		y += 2;
	if (y >Level_one.HEIGHT + r) {
		return true;
	}
		return false;
		
}
public void draw(Graphics2D g) {
	g.setColor(color1);
	g.fillRect((int)( x-r),(int) (y-r),2*r,2*r);
	g.setStroke(new BasicStroke(3));
	g.setColor(color1.darker());
	g.drawRect((int)( x-r),(int) (y-r),2*r,2*r);
	g.setStroke(new BasicStroke(1));
	
}

}
