import javax.swing.*;

public class DialogAddition {
    public static void main(String[] args) {
        String number1,number2;
        int num1,num2,answer;
        number1 = JOptionPane.showInputDialog("Enter Number 1");
        num1 = Integer.parseInt(number1);
        number2 = JOptionPane.showInputDialog("Enter Number 2");
        num2 = Integer.parseInt(number2);
        answer = num1+num2;
        JOptionPane.showMessageDialog(null,"The sum of your numbers is "+answer);
    }
}
