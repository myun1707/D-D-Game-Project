package shootaliens;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.SwingConstants;


public class Credits extends JFrame implements ActionListener , KeyListener{
	   
	
	private JPanel mainPanel, subPanel1, subPanel2 , subPanel3, subPanel4 , subPanel5;
		
	  
       
	   

	
		
		public Credits() {
			
		  
			setTitle("Creators of D&D Galaxy");
	      
			
		 mainPanel = new JPanel(); // main panel
	      mainPanel.setLayout(new GridLayout(5, 1));
	      mainPanel.add(new JLabel("Sarah Ansari", SwingConstants.CENTER));
	      mainPanel.setBackground(Color.white);
	      mainPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
	      subPanel1 = new JPanel(); // sub-panel 1
	      subPanel1.add(new JLabel("Romina Tutiven", SwingConstants.CENTER));
	      subPanel1.setBackground(Color.white);
	      subPanel2 = new JPanel(); // sub-panel 2
	      subPanel2.setBackground(Color.white);
	      subPanel2.add(new JLabel("Nicole Just", SwingConstants.CENTER));
	      subPanel3 = new JPanel(); // sub-panel 1
	      subPanel3.add(new JLabel("Steven Gonzalez", SwingConstants.CENTER));
	      subPanel3.setBackground(Color.white);
	      subPanel4 = new JPanel(); // sub-panel 1
	      subPanel4.add(new JLabel("Michael Yun", SwingConstants.CENTER));
	      subPanel4.setBackground(Color.white);
	      subPanel5 = new JPanel(); // sub-panel 1
	      subPanel5.add(new JButton("Back"));
	      subPanel5.setBackground(Color.white);
	     
	      
	      mainPanel.add(subPanel1);
	      mainPanel.add(subPanel2);
	      mainPanel.add(subPanel3);
	      mainPanel.add(subPanel4);
	      mainPanel.add(subPanel5);
	     

			
	     
	      add(mainPanel);
	      setSize(600, 400);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLocationRelativeTo(null);
	      setVisible(true);
	      
	      
	      
	    
	                  
	      
	      
	   }
	   public static void main(String[] args) {
	      new Credits();
	   }
	@Override
	public void keyTyped(KeyEvent kp) {
		
	  
		}
		
	
	@Override
	public void keyPressed(KeyEvent kp) {
		if(kp.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
		
		Menu m = new Menu();
	  
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource () == subPanel5 );
		{
		
		Menu m = new Menu ();
		}
		}
		
	}
	