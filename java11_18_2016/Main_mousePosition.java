package java11_18_2016;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_mousePosition extends JFrame{
	private static final Object FlowLayout = null;
	JLabel label = new JLabel();
	public Main_mousePosition(){
		this.add(label , FlowLayout);
		addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("(" +e.getX()+ "," +e.getY()+ ")");
				label.setVisible(true);
				label.setBounds(e.getX(), e.getY()-40, 100, 20);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("(" + e.getX() +","+ e.getY()+ ")");
				label.setVisible(true);
				label.setBounds(e.getX(), e.getY()-40, 100, 20);
			}
		});
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setVisible(false);;
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("(" + e.getX() +","+ e.getY()+ ")");
				label.setVisible(true);
				label.setBounds(e.getX(), e.getY()-40, 100, 20);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setVisible(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new Main_mousePosition();
		frame.setTitle("MousePosition");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
