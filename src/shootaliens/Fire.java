package shootaliens;

import java.awt.Rectangle;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Fire extends Thread{
	
	Laser laser;
	Level_one lo;
	Enemy [] [] enemy;
	public static int score = 0;
	
	
	Fire(Laser laser , Level_one lo, Enemy[][]enemy)

	{
		this.laser = laser;
		this.lo = lo;
		this.enemy = enemy;
		
	}
	public Fire(Laser laser2, BossLevel bossLevel, Enemy[][] enemy) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run()
	{ 
		while(laser.getyAxis()>-700)
		{
			laser.setyAxis(laser.getyAxis()-10);
			checkCollision();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			lo.repaint();
			
		}
	}

public void checkCollision()
{
	Rectangle laserRect = new Rectangle (laser.getxAxis(),laser.getyAxis(),40,70);
	for(int i = 0 ; i<enemy.length; i++)
	{
		for (int j = 0; j<enemy[i].length;j++)
		{
			Rectangle enemyRect = new Rectangle(enemy[i][j].getxAxis(),enemy[i][j].getyAxis(),72,72);
			if(laserRect.intersects(enemyRect))
			{
				enemy[i][j].setxAxis(1000000);
				laser.setxAxis(-1000);
				score++;
				
				try {
					File sound = new File("sound//mix.wav");
					AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
					Clip clip =AudioSystem.getClip();
					clip.open(ais);
					clip.start();
					}
				catch(Exception e) {System.out.println(e);}
				
			}
		}
	}

}
}