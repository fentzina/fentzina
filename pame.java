package feniaAggelos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class pame extends JFrame implements ActionListener{
	int tmp = 0;
	
	JTextField txt = new JTextField();
	JTextField screen = new JTextField();
	
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
	
	JButton and = new JButton("AND");
	JButton or = new JButton("OR");
	JButton xor = new JButton("XOR");
	JButton lsh = new JButton("LSH");
	JButton eq = new JButton("=");
	
	public pame(){
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new GridLayout(5,5));
		add(txt);
		add(screen);
		
		add(b7);
		b7.addActionListener(this);
		add(b8);
		b8.addActionListener(this);
		add(b9);
		b9.addActionListener(this);
		add(b4);
		b4.addActionListener(this);
		add(b5);
		b5.addActionListener(this);
		add(b6);
		b6.addActionListener(this);
		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);
		add(b3);
		b3.addActionListener(this);
		add(b0);
		b0.addActionListener(this);
		
		add(and);
		and.addActionListener(this);
		add(or);
		or.addActionListener(this);
		add(xor);
		xor.addActionListener(this);
		add(lsh);
		lsh.addActionListener(this);
		
		add(eq);
		eq.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b0) {
			txt.setText("0");
			screen.setText("0");
			tmp = 0;
		}
		if(e.getSource()==b1){
			txt.setText("1");
			screen.setText("1");
			tmp = 1;
		}
		if(e.getSource()==b2){
			txt.setText("2");
			screen.setText("2");
			tmp = 2;
		}
		if(e.getSource()==b3) {
			txt.setText("3");
			screen.setText("3");
			tmp = 3;
		}
		if(e.getSource()==b4) {
			txt.setText("4");
			screen.setText("4");
			tmp = 4;
		}
		if(e.getSource()==b5) txt.setText("5");
		if(e.getSource()==b6) txt.setText("6");
		if(e.getSource()==b7) txt.setText("7");
		if(e.getSource()==b8) txt.setText("8");
		if(e.getSource()==b9) txt.setText("9");
		
		if(e.getSource()==and) {
			txt.setText("AND"); 
			screen.setText("AND");
			//and();
		}
		if(e.getSource()==or) txt.setText("OR");
		if(e.getSource()==xor) txt.setText("XOR");
		if(e.getSource()==lsh) txt.setText("LSH");
		
		if(e.getSource()==eq) {
			txt.setText("=");
			System.out.println(tmp);
		}
	}

	public void and(int n1, int n2) {
		tmp = n1&n2;
	}
	
	public void or(int n1, int n2) {
		tmp = n1|n2;
	}

}
