
package hust.soict.ictglobal.gui.swing;

import javax.swing.*;
import java.awt.*;

public class SwingDemo extends JFrame {
	public SwingDemo() {

		JPanel mainPanel = new JPanel();

		mainPanel.add(new JLabel("Hello, world!"));

		setVisible(true);
		setSize(400, 400);
		setContentPane(mainPanel);
   
		
		mainPanel.add(new JButton("Button"));
		TextField tf=new TextField("enter your name",20);
		tf.setSize(100,100);
		mainPanel.add(tf);

		mainPanel.add(new JButton("khaf kfahkhaf"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		SwingDemo swing = new SwingDemo();
	}

}
