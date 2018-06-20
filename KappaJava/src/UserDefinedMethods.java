import javax.swing.*;

public class UserDefinedMethods {
    //Defing our Method
    public static double Average(double num1, double num2, double num3){
        double avg;
        avg = (num1+num2+num1)/3.0;
        return avg;
    }

    //Call your method in the main method
    public static void main(String[] args) {
        String firstNumber,secondNumber,thirdNumber;
        double fnum,snum,tnum,avg;
        firstNumber = JOptionPane.showInputDialog("Enter First Number");
        fnum = Double.parseDouble(firstNumber);
        secondNumber = JOptionPane.showInputDialog("Enter Second Number");
        snum = Double.parseDouble(secondNumber);
        thirdNumber = JOptionPane.showInputDialog("Enter Third Number");
        tnum = Double.parseDouble(thirdNumber);
        avg = Average(fnum,snum,tnum);
        JOptionPane.showMessageDialog(null,"The avaerage for your numbers is "+avg);
    }

}
