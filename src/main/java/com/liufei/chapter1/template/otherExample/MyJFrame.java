package com.liufei.chapter1.template.otherExample;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public static void main(String[] args) {
        MyJFrame myJFrame = new MyJFrame();
        myJFrame.setTitle("template pattern");
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJFrame.setSize(300,300);
        myJFrame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("hook！",100,100);
    }
}
