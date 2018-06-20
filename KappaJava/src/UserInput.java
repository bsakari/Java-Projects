import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        double number,square;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the number you want to calculate");
        number = input.nextDouble();
        square = number*number;
        System.out.println("The square of "+number+" is "+square);
    }
}
