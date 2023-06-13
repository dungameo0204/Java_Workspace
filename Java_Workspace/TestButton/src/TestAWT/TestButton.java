package TestAWT;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class TestButton 
extends Frame 
implements ActionListener{
  private Panel p1,p2;
  private Label lblCount;
  private TextField tfCount;
  private Button btnCount;
  private int count=0;
public TestButton() {
	
	
	setLayout(new FlowLayout());
	lblCount =new Label("Counter");
	p1=new Panel();
	
	p1.add(lblCount);
	add(p1);
	add(lblCount);
	
	p2=new Panel();
	p2.add(lblCount);
	add(p2);
	tfCount= new TextField("0",10);
	tfCount.setEditable(true);
	add(tfCount);
	
	btnCount=new Button("Count");
	add(btnCount);
	
	btnCount.addActionListener(this);
	setTitle("TESTGUI");
	setSize(250,100);
	System.out.println(this);
	setVisible(true);
	System.out.println(lblCount);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	++count;
	tfCount.setText(count+"");
}
public static void main(String[] args) {
	TestButton app= new TestButton();
}
}
