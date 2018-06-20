package com.company;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.swing.*;

public class BMI {
    public static void main(String[] args) {
        String weight = JOptionPane.showInputDialog("Enter Patient's Weight in Kgs");
        String height = JOptionPane.showInputDialog("Enter Patient's Height in Cm");

        double w = Double.parseDouble(weight);
        double h = Double.parseDouble(height);

        double BMI = w/(h*h);
        JOptionPane.showMessageDialog(null,"BMI = " + BMI);
    }
}
