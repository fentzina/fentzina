package feniaAggelos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Caret;

public class calc extends JFrame implements ActionListener{
	
	// to store operations or numbers
	String s0 = ""; // total --> screen
	String s1 = ""; // total --> numbers-keyboard
	String s2 = ""; // operation choice
	
	// my Buttons
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
	
	JButton comma = new JButton(",");
	JButton clear = new JButton("C");
	
	JButton and= new JButton(" AND ");
	JButton or = new JButton(" OR ");
	JButton xor = new JButton(" XOR ");
	JButton lsh = new JButton(" LSH ");
	JButton eq = new JButton(" = ");
	
	JTextField tf = new JTextField();
	
	JPanel jp1 = new JPanel(); // for the keyboard
	JPanel jp2 = new JPanel(); // for the operations
	
	// my calculators graphics
	public calc(String title) {
		super(title);
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		jp1.setLayout(new GridLayout(4,3));
		jp1.add(b7); b7.addActionListener(this);
		jp1.add(b8); b8.addActionListener(this);
		jp1.add(b9); b9.addActionListener(this);
		jp1.add(b4); b4.addActionListener(this);
		jp1.add(b5); b5.addActionListener(this);
		jp1.add(b6); b6.addActionListener(this); 
		jp1.add(b1); b1.addActionListener(this);
		jp1.add(b2); b2.addActionListener(this);
		jp1.add(b3); b3.addActionListener(this);
		jp1.add(b0); b0.addActionListener(this);
		jp1.add(comma); comma.addActionListener(this);
		jp1.add(clear); clear.addActionListener(this);
		
		jp2.setLayout(new GridLayout(5,1));
		jp2.add(and); and.addActionListener(this);
		jp2.add(or); or.addActionListener(this);
		jp2.add(xor); xor.addActionListener(this);
		jp2.add(lsh); lsh.addActionListener(this);
		jp2.add(eq); eq.addActionListener(this);
		
		setLayout(new BorderLayout());
		add(tf, BorderLayout.NORTH);
		add(jp1, BorderLayout.CENTER);
		add(jp2, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// actionPerfomance for my buttons
		if(e.getSource()==b0) tf.setText("0");
		if(e.getSource()==b1) tf.setText("1");
		if(e.getSource()==b2) tf.setText("2");
		if(e.getSource()==b3) tf.setText("3");
		if(e.getSource()==b4) tf.setText("4");
		if(e.getSource()==b5) tf.setText("5");
		if(e.getSource()==b6) tf.setText("6");
		if(e.getSource()==b7) tf.setText("7");
		if(e.getSource()==b8) tf.setText("8");
		if(e.getSource()==b9) tf.setText("9");
		
		if(e.getSource()==and) tf.setText(" AND ");
		if(e.getSource()==or) tf.setText(" OR ");
		if(e.getSource()==xor) tf.setText(" XOR ");
		if(e.getSource()==lsh) tf.setText(" LSH ");
		if(e.getSource()==eq) tf.setText("=");
		
		// actually: for the screen
		String s = e.getActionCommand();
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
	            // if operand is present then add to second no 
	            if (!s1.equals("")) { 
	                s2 = s2 + s; 
	            } else
	                s0 = s0 + s; 
	  
	            // set the value of text 
	            tf.setText(s0 + s1 + s2 + ". "); 
	            
	       }else if (s.charAt(0) == 'C') { 
	            // clear the one letter 
	            s0 = s1 = s2 = ""; 
	  
	            // set the value of text 
	            tf.setText(s0 + s1 + s2); 
	        }else if (s.charAt(0) == '=') { 
	        	  
	            int tmp; 
	            int n1,n2;
                n1 = Integer.parseInt(s0);
                n2 = Integer.parseInt(s2);
                
	            // store the value in 1st 
	            if (s1.equals(" AND ")) 
	                tmp = n1 & n2;  
	            else if (s1.equals(" OR ")) 
	                tmp = n1 | n2;  
	            else if (s1.equals(" XOR ")) 
	                tmp = n1 ^ n2;  
	            else
	                tmp = n1 << n2;  
	  
	            // set the value of text 
	            tf.setText(s0 + s1 + s2 + "=" + tmp); 
	  
	            // convert it to string 
	            s0 = Double.toString(tmp); 
	  
	            s1 = s2 = ""; 
	        } 
	        else { 
	            // if there was no operand 
	            if (s1.equals("") || s2.equals("")) 
	                s1 = s; 
	            // else evaluate 
	            else { 
	                double tmp; 
	                double n1,n2;
	                n1 = Double.parseDouble(s0);
	                n2 = Double.parseDouble(s2);
	                
	                // store the value in 1st 
	                if (s1.equals(" AND ")) 
	                    tmp = (int)n1 & (int)n2; 
	                else if (s1.equals(" OR ")) 
	                    tmp = tmp = (int)n1 | (int)n2;  
	                else if (s1.equals(" XOR ")) 
	                    tmp = tmp = (int)n1 ^ (int)n2;  
	                else
	                	tmp = (int)n1 << (int)n2;   
	  
	                // convert it to string 
	                s0 = Double.toString(tmp); 
	  
	                // place the operator 
	                s1 = s; 
	  
	                // make the operand blank 
	                s2 = ""; 
	            } 
	  
	            // set the value of text 
	            tf.setText(s0 + s1 + s2); 
	        } 
	    } 
	
	}

