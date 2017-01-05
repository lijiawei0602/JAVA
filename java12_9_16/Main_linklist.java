package java12_9_16;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main_linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Show aShow = new Show();
		GUI aGui = new GUI();
	}

}

class GUI extends JFrame{
	Set<Double> set = new HashSet<>();
	JTextField jTextField2 = new JTextField(30);
	public GUI(){
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		JPanel jPanel = new JPanel();
		JTextField jTextField1 = new JTextField(30);
		
		jTextField1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					set.add(Double.parseDouble(jTextField1.getText()));
					jTextField2.setText("");
					for(Double n : set){
						jTextField2.setText(jTextField2.getText()+ n +" ");
					}
				}
				jTextField1.setText("");
			}
		});
		
		JButton sort = new JButton("sort");
		sort.addActionListener(e -> Sort());
		
		JButton shuffle = new JButton("shuffle");
		shuffle.addActionListener(e -> Shuffle());
		
		JButton reverse = new JButton("reverse");
		reverse.addActionListener(e -> Reverse());
		
		jPanel.add(new Label(" ‰»Î ˝◊÷:"));
		jPanel.add(jTextField1);
		jPanel.add(jTextField2);
		jPanel.add(sort);
		jPanel.add(shuffle);
		jPanel.add(reverse);
		this.add(jPanel);
		this.setSize(400,200);
		this.setVisible(true);
	}
	
	public void Sort(){
//		Double[] array = new Double[set.size()];
//		set.toArray(array);
//		Arrays.sort(array);
//		String text = "";
//		for(Double e : array){
//			text += (e+"");
//		}
//		jTextField2.setText(text);
		List<Double> aList =  new ArrayList<>();
		String text = "";
		aList.addAll(set);
		Collections.sort(aList);
		for(Double e : aList){
			text += (e+" ");
		}
		jTextField2.setText(text+"13");
	}
	
	public void Shuffle(){
		List<Double> aList =  new ArrayList<>();
		String text = "";
		aList.addAll(set);
		Collections.shuffle(aList);
		for(Double e : aList){
			text += (e+" ");
		}
		jTextField2.setText(text);
	}
	
	public void Reverse(){
		List<Double> aList =  new ArrayList<>();
		String text = "";
		aList.addAll(set);
		Collections.reverse(aList);
		for(Double e : aList){
			text += (e+" ");
		}
		jTextField2.setText(text);
	}
}
