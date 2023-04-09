package feniaAggelos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class lc extends JFrame {
	screen s = new screen();
	keyboard k = new keyboard();
	Prakseis p = new Prakseis();
	
	public lc(String title) {
		super(title);
		setSize(250,250);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		setLayout(new FlowLayout());
		add(s);
		add(k);
		add(p);
	}
	
	
}
