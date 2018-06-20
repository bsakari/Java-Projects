import javax.swing.*;

public class UserDefinedMethod {
    //Defining the method
    public static double Avarage(double num1,double num2,double num3){
        double avg;
        avg = (num1+num2+num3)/3.0;
        return avg;
    }

    //Call the method in the main method
    public static void main(String[] args) {
        String firstNumber, secondNumber,thirdNumber;
        double fnum,snum,tnum,avg;
        firstNumber = JOptionPane.showInputDialog("Enter First Number");
        fnum = Double.parseDouble(firstNumber);
        secondNumber = JOptionPane.showInputDialog("Enter Second Number");
        snum = Double.parseDouble(secondNumber);
        thirdNumber = JOptionPane.showInputDialog("Enter Third Number");
        tnum = Double.parseDouble(thirdNumber);
        avg = Avarage(fnum,snum,tnum);
        JOptionPane.showMessageDialog(null,"The Avarage of your numbers is "+avg);
    }


}
