package shootaliens;

public class Dropper extends Thread {
	Level_one lo;
	Enemy[][] enemy;
	
	
	Dropper(Level_one lo , Enemy[][] enemy)
	{
		this.enemy = enemy;
		this.lo = lo;
		
	}

	public void run()
	{
		
		while(enemy[0][0].getyAxis()<700) 
		{
		for(int i = 0; i<enemy.length;i++)
		{
			for(int j = 0; j<enemy[i].length;j++)
			{
				enemy[i][j].setyAxis(enemy[i][j].getyAxis()+20);
				System.out.println(enemy[i][j].getyAxis());
				
			}
		}
			try {
				Thread.sleep(800);
			}catch(Exception e) {System.out.println(e);
			}
		lo.repaint();
		}
	}
}
