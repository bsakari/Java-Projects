import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        double[] names;
        double output;
        Scanner input;
        names = new double[5];
        System.out.println("Enter Prices");
        input = new Scanner(System.in);
        names[0] = input.nextDouble();
        names[1] = input.nextDouble();
        names[2] = input.nextDouble();
        names[3] = input.nextDouble();
        names[4] = input.nextDouble();
        output = names[0]+names[1]+names[2]+names[3]+names[4];
        System.out.println(output);
    }
}
