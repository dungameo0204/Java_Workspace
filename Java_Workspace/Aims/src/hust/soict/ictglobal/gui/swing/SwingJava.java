package hust.soict.ictglobal.gui.swing;

import java.awt.Component;

import javax.swing.*;


public class SwingJava extends JFrame {
    public SwingJava(){
        JPanel tx= new JPanel();
        add(tx);
        JButton jb=new JButton("click here");
        tx.add(jb);
        setVisible(true);
        setSize(400,400);
        jb.addActionListener(this);
        
    }


	public static void main(String[] args) {
        SwingJava swing= new SwingJava();
    }
}
