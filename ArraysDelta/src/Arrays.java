import javax.swing.*;
public class Arrays {
    public static void main(String[] args) {
        int numStudents;
        double[] heights;
        String studi;

        studi = JOptionPane.showInputDialog(
                "How Many Students Do You Have?");
        numStudents = Integer.parseInt(studi);
        heights = new double[numStudents];
        //The loop for fetching from the user
        for (int i = 0;i <numStudents;i++){
            String height = JOptionPane.showInputDialog(
                    "Enter Heights");
            heights[i] = Double.parseDouble(height);
        }
        //Loop for Identifying the maximum height
        double maxHeight;
        maxHeight = heights[0];
        for (int i = 0;i <heights.length;i++){
            if (maxHeight<heights[i]){
                maxHeight = heights[i];
            }
        }
        //Loop for Getting the total heights before averaging
        double total;
        total = 0;
        for (int i = 0;i<heights.length;i++){
            total+=heights[i];
        }
        JOptionPane.showMessageDialog(null,"Maximum Height = "+maxHeight);
        JOptionPane.showMessageDialog(null,"Average Height = "+(total/numStudents));
    }
}
