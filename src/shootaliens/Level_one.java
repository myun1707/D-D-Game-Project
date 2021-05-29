package shootaliens;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Level_one extends JPanel implements KeyListener{

	JFrame window = new JFrame("Space Level");
	Shooter shooter = new Shooter(380,400,"images//character.png");
	Enemy [][] enemy = new Enemy [2][10];
	int xAxis = 0;
	int yAxis = 0;
	

	Laser[] lasers =new Laser[1000];
	int count = 0;
	Dropper dropper = new Dropper(this, enemy);
	private boolean fail= false;
	 
	Level_one()
	{
		this.setFocusable(true);
		this.addKeyListener(this);
		
		window.add(this);
		
		
		try {
			File sound = new File("sound//ring.wav");
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
				enemy[i][j] = new Enemy(xAxis,yAxis, "images//space.png");
				xAxis +=75;
			}
				yAxis+=75;
				xAxis = 0;
		}
		
		
		dropper.start();
		
		
		
		for(int i = 0;i<lasers.length; i++)
		{
			lasers [i]= new Laser(430,600, "images//laser.png");
		}

		
		window.setSize(750,620);
		window.setLocation(60,30);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
	
	public void paint(Graphics g)
	{
	ImageIcon background = new ImageIcon("images//outer-space.png");
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
			dropper.stop();
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
					dropper.stop();
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
	public void keyPressed(KeyEvent kp) {
		if( kp.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			if(shooter.getxAxis()<760)
				shooter.setxAxis(shooter.getxAxis()+20);
			this.repaint();
		}
		else if (kp.getKeyCode()==KeyEvent.VK_LEFT)
		{
			if(shooter.getxAxis()>-4)
			{
				shooter.setxAxis(shooter.getxAxis()-20);
			}
			this.repaint();
		}
		
		else if(kp.getKeyCode()==KeyEvent.VK_SPACE)
		{
			
			try {
				File sound = new File("sound//sound.wav");
				AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
				Clip clip =AudioSystem.getClip();
				clip.open(ais);
				clip.start();
				}
			catch(Exception e) {System.out.println(e);}
			
			Fire f = new Fire(lasers[count],this,enemy);
			lasers[count].setxAxis(shooter.getxAxis()+30);
			lasers[count].setyAxis(shooter.getyAxis()+10);
			
			f.start();
			count++;
					
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
