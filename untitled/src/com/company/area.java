package com.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class area {
    public static void main(String[] args) {

        String length = JOptionPane.showInputDialog("Enter Length in Cm");
        String height = JOptionPane.showInputDialog("Enter Height in Cm");

        Double l = Double.parseDouble(length);
        Double h = Double.parseDouble(height);

        Double Area = l*h;

        JOptionPane.showMessageDialog(null,"Area = " + Area);


    }
}
