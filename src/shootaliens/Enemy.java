package shootaliens;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Enemy {

	private int xAxis;
	private int yAxis;
	private String imagepath;

	
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
	
	
	public Enemy(int xAxis, int yAxis, String imagepath) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.imagepath = imagepath;
	}
	
	
	public void drawEnemy(Graphics g) {
		ImageIcon enemy = new ImageIcon(imagepath);
		g.drawImage(enemy.getImage(),xAxis,yAxis,null);
	}
	
	
}
