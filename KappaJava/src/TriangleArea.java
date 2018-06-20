import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        double length,height,area;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the Length");
        length = input.nextDouble();
        System.out.println("Enter the Height");
        height = input.nextDouble();
        area = 0.5*length*height;
        System.out.printf("The area of your triangle is %6.4f",area);
    }
}
