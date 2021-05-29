package shootaliens;

import java.awt.Graphics;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OpeningWindow extends JPanel{

	
	JFrame window = new JFrame();
	

	
	OpeningWindow()
	{
		window.add(this);
		
		try {
			
			File sound = new File("sound//tone.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
			Clip clip =AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			
			}catch(Exception e) {System.out.println(e);}

	    
	
		
		
		window.setSize(640,360);
		window.setVisible(true);
		window.setLocation(50,50);
		
		
		try {
			Thread.sleep(10000);
			window.dispose();
			Menu m = new Menu();
			
		}catch(Exception e) {System.out.println(e);}
		
	
	}
	

	public void paint(Graphics g)
	{
		ImageIcon background = new ImageIcon("images//main_screen.png");
	
	 g.drawImage(background.getImage(),0,0,null);
	
	}
}
