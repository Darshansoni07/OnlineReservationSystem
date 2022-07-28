import java.awt.EventQueue;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class NeFa extends JFrame{
	JButton b1,b2;
	JFrame f;
public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new NeFa();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 NeFa(){
	 f=new JFrame();
	 f.setSize(500,600);
	 b1=new JButton("Reservation");
	 b1.setBounds(90,150,250,40);
	 Succes s=new Succes(this);
	 b1.addActionListener(s);
	 
	 b2=new JButton("Cancel");
	 b2.setBounds(90,250,250,40);
	 
	 Cancel c=new Cancel(this);
	 b2.addActionListener(c);
	 
	 f.add(b1);f.add(b2);
	 f.setLayout(null);
	 f.setVisible(true);
	 
 }

 
}
