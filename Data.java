import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

public class Data implements ActionListener {
	
	Cancel obj;
	Data(Cancel obj){
		this.obj=obj;
	}
	
	
		
	@Override
	public void actionPerformed(ActionEvent e ) {
		
		String s=obj.t.getText();
		
		if(s.equals("PN1010")) {
			obj.l2.setText("\"Darshan Ahemdabad to Indore  Train Has been Canceled\"");
			obj.f.add(obj.l2);
			obj.f.setVisible(true);
		}
		else {
			obj.t.setText("You have Enter worng");
		}
	}

}
