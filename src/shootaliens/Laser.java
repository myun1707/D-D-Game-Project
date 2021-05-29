package shootaliens;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Laser {

	private int xAxis;
	private int yAxis;
	private String imagepath;
	
	public Laser(int xAxis, int yAxis, String imagepath) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.imagepath = imagepath;
	}
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	public void drawLaser(Graphics g) {
		ImageIcon img = new ImageIcon(imagepath);
		g.drawImage(img.getImage(),xAxis,yAxis,null);
	
	}
}
