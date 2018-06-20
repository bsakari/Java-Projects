import javax.swing.*;

public class CircleArea {
    public static void main(String[] args){
        String radius;
        double r,area;
        radius = JOptionPane.showInputDialog("Enter the Radius");
        r = Double.parseDouble(radius);
        area = Math.PI*r*r;
        JOptionPane.showMessageDialog(null,"Area = "+area);
    }
}
