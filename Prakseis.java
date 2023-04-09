package feniaAggelos;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Prakseis extends JFrame {
	JButton and = new JButton("AND");
	JButton or = new JButton("OR");
	JButton xor = new JButton("XOR");
	JButton lsh = new JButton("LSH");
	
	public Prakseis() {
		setVisible(true);
		setLayout(new GridLayout(4,1));
		add(and);
		add(or);
		add(xor);
		add(lsh);
	}
}
