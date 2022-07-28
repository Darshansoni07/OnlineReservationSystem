import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Succes extends JFrame implements ActionListener {
	JTextField t,t1;
	Choice c,c1;
	JLabel l1,l2,l3,l4;
	JButton b;
	NeFa obj;
	Succes(NeFa Obj){
	this.obj = obj;
	}
	
	JFrame j=new JFrame();
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Succes();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Succes(){
		t=new JTextField();
		t.setBounds(50,150,100,20);
		
		l1=new JLabel("Enter Name:");
		l1.setBounds(30,50,250,20);
		t=new JTextField();
		t.setBounds(150,50,250,20);
		
		l2=new JLabel("Enter Age:");
		l2.setBounds(30,100,250,20);
		t1=new JTextField();
		t1.setBounds(150,100,250,20);
		
		l3=new JLabel("Select Train:");
		l3.setBounds(30,150,100,10);
		
		c=new Choice();
		c.setBounds(150,150,250,20);
		c.add("Indore to Mumbai");
		c.add("Indore to Ahemdabad");
		c.add("Indore to Pune");
		c.add("Indore to Bhopal");
		c.add("Indore to Shajapur");
		c.add("Mumbai to Indore");
		c.add("Ahemdabad to Indore");
		c.add("Pune to Indore");
		c.add("Bhopal to Indore");
		c.add("Shajapur to Indore");
				
		l4=new JLabel("Enter Time:");
		l4.setBounds(30,200,100,20);
		
		c1=new Choice();
		c1.setBounds(150,200,250,20);
		c1.add("9:00 AM");
		c1.add("12:15 PM");
		c1.add("4:30 PM");
		
		b=new JButton("Click");
		b.setBounds(200,250,120,20);
		
		 Book s=new Book(this);
		 b.addActionListener(s);
		
		
			
		j.add(l1);j.add(t);
		j.add(l2);j.add(t1);
		j.add(l3);j.add(c);
		j.add(l4);j.add(c1);
		j.add(b);
		
		
		j.add(t);
		j.setSize(500, 600);
		j.setLayout(null);
		j.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		//nn.main(new String[]{});
		//j.dispose();
		new Succes();
	}
	

}
