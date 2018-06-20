import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        double radius,area;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter Radius");
        radius = input.nextDouble();
        area = Math.PI*radius*radius;
        System.out.println("The area of your Circle is "+area);
    }
}
