import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double length,width,area;
        Scanner input;
        System.out.println("Enter Length");
        input = new Scanner(System.in);
        length = input.nextDouble();
        System.out.println("Enter Width");
        width = input.nextDouble();
        area = length*width;
        System.out.printf("The area of your Rectangle is %5.2f",area);
    }
}
