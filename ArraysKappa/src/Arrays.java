import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input;
        int numStudents;
        double[] heights;
        input = new Scanner(System.in);
        System.out.println("How many students do you have?");
        numStudents = input.nextInt();
        heights = new double[numStudents];
        for (int i = 0;i < numStudents;i++){
            System.out.println("Enter Heigts");
            heights[i] = input.nextDouble();
        }
        double maxHeight;
        maxHeight = heights[0];
        for (int i = 0;i<heights.length;i++){
            if (maxHeight<heights[i]){
                maxHeight = heights[i];
            }
        }
        double total;
        total = 0;
        for (int i = 0;i<heights.length;i++){
            total+=heights[i];
        }
        System.out.println("Maximum height = "+maxHeight);
        System.out.println("\nAverage height = "+
                (total/numStudents));

    }
}
