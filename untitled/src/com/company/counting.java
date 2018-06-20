package com.company;

import javax.swing.*;
import java.lang.reflect.Array;

public class counting {
    public static void main(String[] args) {
        String count = JOptionPane.showInputDialog("Enter The Number");
        Integer c = Integer.parseInt(count);


       for (int j = 0; j<=c; c--)
       {

         if(c%2==1)
         {

             System.out.println(c);
             //JOptionPane.showMessageDialog(null,"The numbers are"+c);
         }
       }

    }
}
