package shootaliens;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





public class Menu extends JPanel implements ActionListener , KeyListener{

JFrame window = new JFrame();



JButton playButton = new JButton("Start Game");
JButton exitButton = new JButton("Exit");
JButton leaderboardButton = new JButton("LeaderBoard");
JButton creditButton = new JButton("Credits");
JButton instructionsButton = new JButton("How to play");

Font customFont = new Font("Bold", Font.BOLD,14 );



Menu()
	{
	
	
	window.add(this);
	
	window.add( creditButton ,BorderLayout.PAGE_START);
	   
    // Adding JButton "btn2" on JFrame.
    window.add(exitButton , BorderLayout.PAGE_END);

    // Adding JButton "btn3" on JFrame.
    window.add(leaderboardButton ,BorderLayout.EAST);

    // Adding JButton "btn4" on JFrame.
    window.add(instructionsButton , BorderLayout.WEST);

    // Adding JButton "btn5" on JFrame.
    window.add(playButton, BorderLayout.CENTER);



	playButton.setFont(customFont);
    playButton.addActionListener(this);
	playButton.addKeyListener(this);
	
	

	leaderboardButton.setFont(customFont);
	leaderboardButton.addActionListener(this);
	leaderboardButton.addKeyListener(this);

	
	
	creditButton.setFont(customFont);
	creditButton.addActionListener(this);
	creditButton.addKeyListener(this);
	

	
	
	
	exitButton.setFont(customFont);
	exitButton.addActionListener(this);
	exitButton.addKeyListener(this);

	
	instructionsButton.setFont(customFont);
	instructionsButton.addActionListener(this);
	instructionsButton.addKeyListener(this);
	
   
        // Function to set visible status of JFrame
      
     
        
       
        window.setLocation(50,50);
        window.setUndecorated(true);
        window.setSize(500,300);
		window.setVisible(true);
		
		
        
    	
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent kp) {
		if(kp.getKeyCode()==KeyEvent.VK_ESCAPE)
		{
			window.dispose();
		}
		else if (kp.getKeyCode()==KeyEvent.VK_ENTER)
		{
			window.dispose();
			LevelsWindow lw = new LevelsWindow();
		}
		else if (kp.getKeyCode()==KeyEvent.VK_ENTER)
		{
			window.dispose();
			Credits w = new Credits();
		}
		else if (kp.getKeyCode()==KeyEvent.VK_ENTER)
		{
			window.dispose();
			Instructions w = new Instructions();
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== exitButton)
		{
			window.dispose();
		}
	
		else if (ae.getSource()== playButton)
		{
			window.dispose();
			LevelsWindow lw = new LevelsWindow();
		}
		else if(ae.getSource()== creditButton)
		{
			window.dispose();
			Credits w = new Credits();
		}
		else if(ae.getSource()== instructionsButton)
		{
			window.dispose();
			Instructions w = new Instructions();
		}
	
	
	}


	
		
	}


