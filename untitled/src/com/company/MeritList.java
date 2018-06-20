package com.company;

import javax.swing.*;

public class MeritList {
    public static void main(String[] args) {

        String points = JOptionPane.showInputDialog("Enter Points");

        Integer p = Integer.parseInt(points);


        if (p >= 6)
        {
            JOptionPane.showMessageDialog(null, "The Student Has a FIRST CLASS HONOURS");
        }
        if (p >= 4 && p < 6)
        {
            JOptionPane.showMessageDialog(null, "The Student Has a 2ND CLASS HONOURS");
        }

        if (p >= 2 && p < 4)
        {
            JOptionPane.showMessageDialog(null, "The Student Has a PASS");
        }
        if (p < 2)
        {
            JOptionPane.showMessageDialog(null, "The Student FAILED");
        }
    }
}
