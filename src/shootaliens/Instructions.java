package shootaliens;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class Instructions extends JFrame implements ActionListener , KeyListener { 
	JLabel label;
    ImageIcon icon;
    JLabel label1;
    JButton button;
    
    Container container;
    
    Font customFont = new Font("Italic", Font.ITALIC,22 );

   Instructions() 
   {
        super("How to play");
        icon = new ImageIcon("images//controller.png"); // Your Images path
        label = new JLabel("Press spacebar to shoot", icon, SwingConstants.LEFT);
        label1 = new JLabel("A== to move left & D== to move right");
        container = getContentPane(); // new ContentPane();
        button = new JButton("Back");

        container.setLayout(new FlowLayout());
       label.setFont(customFont);
       label1.setFont(customFont);
       

        container.add(label);
        container.add(label1);
        container.add(button,BorderLayout.LINE_START);

        setSize(420, 350);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new Instructions();
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent kp) {
		if(kp.getKeyCode() == KeyEvent.VK_ESCAPE)
		{
		((Window) container).dispose();
		Menu m = new Menu();
	  
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource () == button );
		{
		((Window) container).dispose();
		Menu m = new Menu ();
		}
		
	
	}
}