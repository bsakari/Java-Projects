import javax.swing.*;

public class DialogInterest {
    public static void main(String[] args){
        String principle,rate,time;
        double p,r,t,interest;
        principle = JOptionPane.showInputDialog("Enter Principle");
        rate = JOptionPane.showInputDialog("Enter Rate");
        time = JOptionPane.showInputDialog("Enter Time");

        p = Double.parseDouble(principle);
        r = Double.parseDouble(rate);
        t = Double.parseDouble(time);
        interest = (p*r*t)/100;
        JOptionPane.showMessageDialog(null,"Interest = "+
        interest);
    }
}
