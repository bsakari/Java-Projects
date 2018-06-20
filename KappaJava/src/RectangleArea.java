import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        double length,width,area;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the Length");
        length = input.nextDouble();
        System.out.println("Enter the width");
        width = input.nextDouble();
        area = length*width;
        System.out.println("The area of your Rectangle is "+area);
    }
}
