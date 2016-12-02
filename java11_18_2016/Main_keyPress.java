package java11_18_2016;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_keyPress extends JFrame{
	JLabel label = new JLabel();
	public Main_keyPress(){
		this.add(label);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				label.setText(e.getKeyChar()+ "");
			}
		});
		
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setBounds(e.getX(), e.getY()-40, 100, 20);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
//				label.setBounds(e.getX(), e.getY(),100, 20);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new Main_keyPress();
		frame.setTitle("KeyPress");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

}
