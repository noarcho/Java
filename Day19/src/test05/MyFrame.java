package test05;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    private MyPanel p = new MyPanel();
     
    public MyFrame(){
         
        add(p);
         
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
     
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
 
}