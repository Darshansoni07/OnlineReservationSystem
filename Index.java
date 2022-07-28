import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class NewFrame implements ActionListener{
	JFrame f;
	JButton b,b2;
	JTextField t,t1,textField1,textField2;
	JLabel l1,l2,l3,l4,L,userLabel,passLabel;
	Choice c,c1;
	JPanel newPanel;
	NewFrame(){
	f= new JFrame("Reservation System");
	f.setSize(600,700);
	
	 userLabel = new JLabel();  
     userLabel.setText("Username");      //set label value for textField1  
     userLabel.setBounds(30,50,250,20);  
     //create text field to get from the user  
     textField1 = new JTextField(15);    //set length of the text  
     textField1.setBounds(150,50,250,20);
     
     //create label for password  
     passLabel = new JLabel();  
     passLabel.setText("Password");      //set label value for textField2  
     passLabel.setBounds(30,100,250,20);
     
     //Button for Sumiting
     b2=new JButton("Submit");
     b2.setBounds(200,150,100,20);
     
     b2.addActionListener(this);
     
     //create text field to get password from the user  
     textField2 = new JPasswordField(15);    //set length for the password  
     textField2.setBounds(150,100,250,20);
    
     f.add(userLabel);
     f.add(textField1);
     f.add(passLabel);
     f.add(textField2);
     f.add(b2);
	L=new JLabel("Reservation System");

	L.setBounds(30,10,290,20);
	
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
	
	b.addActionListener(this);
	
	f.add(L);	
	/*f.add(l1);f.add(t);
	f.add(l2);f.add(t1);
	f.add(l3);f.add(c);
	f.add(l4);f.add(c1);
	f.add(b);*/
	
	
	f.setLayout(null);
	f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String userValue = textField1.getText();        //get user entered username from the textField1  
        String passValue = textField2.getText();
        if (userValue.equals("darshan@gmail.com") && passValue.equals("test")) {
		//String name=t.getText();
		//l1.setText(name);
		//l1.setBounds(120,300,100,20);
        
        	NeFa.main(new String[]{});
			f.dispose();
		
		
		textField1.setVisible(false);;
		textField2.setVisible(false);
		userLabel.setVisible(false);passLabel.setVisible(false);
		b2.setVisible(false);
        }
        else {
        	textField1.setText("You have Enter Worng");
        }
        
	}
        
}
public class Index {
public static void main(String[] args) {
	new NewFrame();

}
}
