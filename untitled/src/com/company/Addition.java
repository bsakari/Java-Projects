package com.company;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Addition {


    public static void main(String[] args) {

        String firstName = ("Benjah");

/*        System.out.println(firstName + " Is learning Java");
        System.out.println("It's SO Interesting. " + firstName);
        JOptionPane*/

String name = JOptionPane.showInputDialog("Enter First Name");
String middle = JOptionPane.showInputDialog("Enter Middle Name");
String last = JOptionPane.showInputDialog("Enter Last Name");
        JOptionPane.showMessageDialog(null,"Your Name Is" + name + middle + last);


    }


}
