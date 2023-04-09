package feniaAggelos;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class keyboard extends JFrame{
	// ftiaxnw to pliktrologio
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	
	public keyboard() {

	setVisible(true);	
	setLayout(new GridLayout(4,3));
	add(b7);
	add(b8);
	add(b9);
	add(b4);
	add(b5);
	add(b6);
	add(b1);
	add(b2);
	add(b3);
	add(b0);
	}
}
