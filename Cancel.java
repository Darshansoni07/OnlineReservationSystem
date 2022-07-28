import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cancel implements ActionListener{
    JFrame f;
    JLabel l,l2;
    JTextField t;
    JButton b;
	NeFa obj;
	Cancel(NeFa obj){
		this.obj = obj;
	}
	
	
	
	Cancel(){
		f=new JFrame();
		f.setSize(500, 500);
		
		l=new JLabel("Enter PNR No.");
		l.setBounds(30,50,250,20);
		
		l2=new JLabel("");
		l2.setBounds(30,100,400,150);
		
		t=new JTextField();
		t.setBounds(150,50,250,20);
		
		b=new JButton("Click Cancel");
		b.setBounds(200,250,120,20);
		
		f.add(t);
		f.add(l);
		f.add(b);
		f.add(l2);
		Data obj =new Data(this);
		b.addActionListener((ActionListener)obj);
		
		f.setLayout(null);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		new Cancel();
	}

}
