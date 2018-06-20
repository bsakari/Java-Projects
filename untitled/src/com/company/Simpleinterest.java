package com.company;

import javax.swing.*;

public class Simpleinterest {
    public static void main(String[] args) {

        String principle = JOptionPane.showInputDialog("Enter Principle");
        String rate = JOptionPane.showInputDialog("Enter Rate");
        String time = JOptionPane.showInputDialog("Enter Time In Years");

        double p = Double.parseDouble(principle);
        double r = Double.parseDouble(rate);
        double t = Double.parseDouble(time);

        double intrest = (p*r*t)/100;

        JOptionPane.showMessageDialog(null,"Simple Interest = " + intrest);







    }

}
