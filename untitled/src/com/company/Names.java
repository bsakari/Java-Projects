package com.company;

import javax.swing.*;

public class Names {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("First Name");
        String name2 = JOptionPane.showInputDialog("Second Name");
        String name3 = JOptionPane.showInputDialog("Third Name");
        String name4 = JOptionPane.showInputDialog("Fourth Name");
        String name5 = JOptionPane.showInputDialog("Fifth Name");
        JOptionPane.showMessageDialog(null,name1+"\n"+name2+"\n"+name3+"\n"+name4+"\n"+name5);
    }
}
