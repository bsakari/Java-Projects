import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        double length,width,area;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter Length");
        length = input.nextDouble();
        System.out.println("Enter Width");
        width = input.nextDouble();
        area = length*width;
        System.out.println("The area of your rectangle is "+area);
    }
}
