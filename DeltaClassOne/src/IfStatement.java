import javax.swing.*;

public class IfStatement {
    public static void main(String[] args) {
        String age;
        int a;
        age = JOptionPane.showInputDialog("Enter Your Age");
        a = Integer.parseInt(age);
        if (a<18) {
            JOptionPane.showMessageDialog(null,"You are Under Age");
        }else {
            JOptionPane.showMessageDialog(null,"You are an adult");
        }
    }
}
