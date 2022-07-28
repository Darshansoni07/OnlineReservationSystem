import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Book implements ActionListener{
	Succes obj;
	JFrame f;
	JLabel l;
	Book(Succes obj){
		this.obj=obj;
	}
	Book(){
		f=new JFrame();
		f.setSize(400,400);
		f.setLayout(null);
		l=new JLabel("\"Booking Done\"");
		l.setBounds(50,150,150,20);
		f.add(l);
		f.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//obj.t.setText("Booking Done");
		// TODO Auto-generated method stub
		new Book();
	}
	

}
