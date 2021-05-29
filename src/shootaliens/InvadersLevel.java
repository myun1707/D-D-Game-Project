package shootaliens;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InvadersLevel extends JPanel implements KeyListener {


	JFrame window = new JFrame("Invaders Level");
	Shooter shooter = new Shooter(380,400,"images//character.png");
	Enemy [][] enemy = new Enemy [2][10];
	int xAxis = 0;
	int yAxis = 0;

	
	Laser[] lasers =new Laser[1000];
	int count = 0;
	
	private boolean fail= false;
	
	InvadersLevel()
	{
		this.setFocusable(true);
		this.addKeyListener(this);
		
		window.add(this);
		
		
		try {
			File sound = new File("sound//leveltwo.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
			Clip clip =AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			}
		catch(Exception e) {System.out.println(e);}
		
		
		
		
		
		
		
		for (int i = 0; i<enemy.length;i++)
		{
			for (int j = 0; j<enemy[i].length;j++)
			{
				enemy[i][j] = new Enemy(xAxis,yAxis, "images//black.png");
				xAxis +=75;
			}
				yAxis+=75;
				xAxis = 0;
		}
		
		
	
		
		
		
		for(int i = 0;i<lasers.length; i++)
		{
			lasers [i]= new Laser(430,600, "images//laser.png");
		}

		
		window.setSize(780,620);
		window.setLocation(60,30);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	
	public void paint(Graphics g)
	{
	ImageIcon background = new ImageIcon("images//outer.png");
	g.drawImage(background.getImage(),0,0,null);
	
	
	shooter.drawShooter(g);
	
	for (int i=0; i<enemy.length;i++)
	{
		for (int j = 0; j<enemy[i].length;j++)
		{
			enemy[i][j].drawEnemy(g);
		}
	}

	for (int i =0; i<lasers.length;i++) 
		{
		
		
			lasers[i].drawLaser(g);
		}
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("",Font.BOLD,22));
		g.drawString("Score = "+Fire.score, 600, 500);
		
		levelFail();
		levelComplete();
	
	}
	
	
	public void levelComplete()
	{
		if(Fire.score>=20)
		{
			window.dispose();
		
			JOptionPane.showMessageDialog(null,"Level Completed");
		}
	}
	
	
	
	
	
	public void levelFail()
	{
		for(int i = 0; i<enemy.length;i++)
		{
			for(int j = 0; j<enemy[i].length;j++)
			{
				if(enemy[i][j].getyAxis()>400)
				{
					
					fail = true;
					
					break;
					
				}
			}
		}
	
			if(fail == true)
			{
				window.dispose();
				JOptionPane.showMessageDialog(null," Game over!");
				
			}
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
