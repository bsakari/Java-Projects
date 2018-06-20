import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        double principle,rate,time,interest;
        Scanner input;
        input  = new Scanner(System.in);
        System.out.println("Enter Principle");
        principle = input.nextDouble();
        System.out.println("Enter Rate");
        rate = input.nextDouble();
        System.out.println("Enter Time");
        time = input.nextDouble();
        interest = principle*rate*time;
        System.out.printf("Your interest is %5.4f",interest);

    }
}
