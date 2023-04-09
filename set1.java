package feniaAggelos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class set1 extends JFrame implements ActionListener{
	
	// attempt for a real visual calculator
	
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton and = new JButton("AND");
	JButton eq = new JButton("=");
	JTextArea txt = new JTextArea(5,5);
	
	JButton[] A = new JButton[4];
	
	public set1() {
		setSize(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	
		setLayout(new BorderLayout());
		add(txt, BorderLayout.NORTH);
		add(b0, BorderLayout.WEST);
		b0.addActionListener(this);
		add(b1, BorderLayout.EAST);
		b1.addActionListener(this);
		add(and, BorderLayout.CENTER);
		and.addActionListener(this);
		add(eq, BorderLayout.SOUTH);
		eq.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b0) {
			txt.setText("0\t");
			A[0] = b0;
		}
		if(e.getSource()==b1)  {
			txt.setText("1\t");
			A[1] = b1;
		}
		if(e.getSource()==and)  {
			txt.setText("AND");
		}
		if(e.getSource()==eq)  {
			txt.setText("=");
		}
	}
}
