package com.liufei.chapter1.observer;

import javax.swing.*;
import java.awt.*;

public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("observer");
        jButton.addActionListener(e -> System.out.println("just do it"));
        jButton.addActionListener(e -> System.out.println("think about it"));
        jFrame.getContentPane().add(BorderLayout.CENTER,jButton);
        jFrame.setVisible(true);
    }
}
