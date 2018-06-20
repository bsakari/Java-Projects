import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner input;
        double[][] prices;
        prices = new double[5][2];
        input = new Scanner(System.in);
        for (int A = 0;A <5;A++){
            System.out.println("Enter Original Prices");
            prices[A][0] = input.nextDouble();
            prices[A][1] = prices[A][0] * .70;
        }
        for (int A = 0;A < 5;A++){
            System.out.println("Original Price = "+prices[A][0]
            +"\tDicounted Prices = "+prices[A][1]);
        }
    }
}
