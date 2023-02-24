package test;

import java.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.*;

@SuppressWarnings("serial")
public class stream_test extends JFrame{
    public stream_test(){
        input command = new input();
        this.add(command);
        this.addKeyListener(command);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new stream_test();
    }
}

@SuppressWarnings("Serial")
class input extends JPanel implements KeyListener{
    @Override
    public void keyTyped(KeyEvent e){}
    @Override
    public void KeyPressed(KeyEvent e){
        System.out.println(e.getKeyChar() + "Click");
    }
    @Override
    public void keyReleased(KeyEvent e){}
}