import javax.swing.*;

public class User_Input {
    public static void main(String[] args) {
        String principle = JOptionPane.showInputDialog("Enter Principle");
        String rate = JOptionPane.showInputDialog("Enter Rate");
        String time = JOptionPane.showInputDialog("Enter Time");
        double p = Double.parseDouble(principle);
        double r = Double.parseDouble(rate);
        double t = Double.parseDouble(time);

        double interest = (p*r*t)/100;
        JOptionPane.showMessageDialog(null,"Interest = "+interest);
    }

}
