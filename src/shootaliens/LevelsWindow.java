package shootaliens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LevelsWindow extends JPanel implements ActionListener, KeyListener {

	JFrame window = new JFrame();
	
	String[] s = {"Space-Level ", "Invaders-Level", "Boss-Level" };
	JComboBox nameOfLevels = new JComboBox(s);
	JButton enterButton = new JButton();
	JButton backButton = new JButton();
	
	Font customFont = new Font("Bold", Font.BOLD,30);
	Font comboFont = new Font("Italic", Font.ITALIC, 25);
	
	
	LevelsWindow()
	
	{
		this.setBackground(Color.BLACK);
		window.add(this);
	
		
		nameOfLevels.setFont(comboFont);
		nameOfLevels.setForeground(Color.DARK_GRAY);
		nameOfLevels.setBackground(Color.BLACK);
		window.add(nameOfLevels, BorderLayout.PAGE_START);
		
		backButton.setFont(customFont);
		backButton.setText("Back");
		backButton.setForeground(Color.BLACK);
		backButton.setBackground(Color.WHITE);
		backButton.addKeyListener(this);
		backButton.addActionListener(this);
		window.add(backButton, BorderLayout.PAGE_END);
		
		enterButton.setIcon(new ImageIcon("images//enter.png"));
		enterButton.addKeyListener(this);
		enterButton.addActionListener(this);
		window.add(enterButton,BorderLayout.CENTER);
		
		
		
		
		window.setSize(750,550);
		window.setLocation(50,50);
		window.setVisible(true);
		
		
	
	
	}
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent kp) {
		if(kp.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
		window.dispose();
		Menu m = new Menu();
	  
		}
	
		else if (kp.getKeyCode()==KeyEvent.VK_ENTER&&nameOfLevels.getSelectedIndex()==0)
		{
			Level_one lo = new Level_one();
		}
		else if (kp.getKeyCode()==KeyEvent.VK_ENTER&&nameOfLevels.getSelectedIndex()==1)
		{
			InvadersLevel il = new InvadersLevel();
		}
		else if (kp.getKeyCode()==KeyEvent.VK_ENTER&&nameOfLevels.getSelectedIndex()==2)
		{
			BossLevel bl = new BossLevel();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource () == backButton );
		{
		window.dispose();
		Menu m = new Menu ();
		}
		
		 if (ae.getSource()== enterButton&&nameOfLevels.getSelectedIndex()==0)
		{
			Level_one lo = new Level_one();
			
		}
		 else if (ae.getSource()== enterButton&&nameOfLevels.getSelectedIndex()==1)
			{
			 InvadersLevel il = new InvadersLevel();;
				
			}
	
		 else if (ae.getSource()== enterButton&&nameOfLevels.getSelectedIndex()==2)
			{
			 BossLevel bl = new BossLevel();
				
			}
	
	}

}
