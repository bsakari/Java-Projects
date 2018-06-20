import javax.swing.*;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input;
        double[][] prices;
        prices = new double[5][2];
        input = new Scanner(System.in);
        //Loop to fetch input from the User
        //Proceed to calculate the discounted prices
        for (int i = 0;i<5;i++){
            String price = JOptionPane.showInputDialog(
                    "Enter Prices");
            //Original prices fetched from the user
            prices[i][0] = Integer.parseInt(price);
            //Calculate Discounted prices
            prices[i][1] = prices[i][0] * .70;
        }
        //Loop for printing the output in a tabbed format
        for (int i = 0;i<5;i++){
            JOptionPane.showMessageDialog(
                    null,"Original Prices = "+prices[i][0]
                            +"\t\t\tDiscounted Prices = "+prices[i][1]);
        }
    }
}
