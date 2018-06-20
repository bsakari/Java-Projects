import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        double base,height,area;
        Scanner input;
        System.out.println("Enter the base value");
        input = new Scanner(System.in);
        base = input.nextDouble();
        System.out.println("Enter Height Value");
        height = input.nextDouble();
        area = 1/2*base*height;
        System.out.printf("The area of your triangle is %6.4f",area);
    }
}
