import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        //Accept input from the user
        //Take the user's input and calculate the square
        int userInput,square;
        Scanner input;
        System.out.println("Please enter a number to find its square");

        input = new Scanner(System.in);
        userInput = input.nextInt();
        square = userInput*userInput;
        System.out.println("The square of the inputed number is "+square);
    }
}
