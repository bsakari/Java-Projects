import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        double[][] prices;
        Scanner input;
        prices = new double[5][2];
        input = new Scanner(System.in);
        System.out.println("Enter rices");
        for (int i = 0;i<5;i++){
            prices[i][0] = input.nextDouble();
            prices[i][1] = prices[i][0] * .70;
        }
        for (int i = 0;i<5;i++){
            System.out.println("The original Price = $"
        +prices[i][0]+"\tThe Discounred Price = $"+prices[i][1]);
        }

    }
}
