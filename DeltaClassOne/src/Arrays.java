import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        double[] prices;
        double total;
        Scanner input;
        prices = new double[5];
        input = new Scanner(System.in);
        System.out.println("Enter the five prices");
        prices[0] = input.nextDouble();
        prices[1] = input.nextDouble();
        prices[2] = input.nextDouble();
        prices[3] = input.nextDouble();
        prices[4] = input.nextDouble();
        total = prices[0]+prices[1]+prices[2]+ prices[3]+prices[4];
        System.out.println("Your total cost is "+total);
    }
}
