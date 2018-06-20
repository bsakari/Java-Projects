import javax.swing.*;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int numStudents;
        double[] heights;
        String input;
        input = JOptionPane.showInputDialog("How many Students Do You Have?");
        numStudents = Integer.parseInt(input);
        heights = new double[numStudents];
        //Loop for Fetching heights
        for (int i = 0;i<numStudents;i++){
            String height;
            height = JOptionPane.showInputDialog("Enter Heights");
            heights[i] = Integer.parseInt(height);
        }
        //Loop for getting the maximum height
        double maxHeight;
        maxHeight = heights[0];
        for (int i = 1;i<heights.length;i++){
            if (maxHeight<heights[i]){
                maxHeight = heights[i];
            }
        }
        //Loop for Getting the total of heights
        double total;
        total = 0;
        for (int i = 0;i < heights.length;i++){
            total+=heights[i];
        }
        JOptionPane.showMessageDialog(null,"Maximum height in your class = "
                +maxHeight+" Inches");
        JOptionPane.showMessageDialog(null,"\nThe average of student heights in your class = "
                +(total/numStudents));

    }
}
