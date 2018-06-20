import javax.swing.*;

public class DialogArea {
    public static void main(String[] args) {
        String radius,height;
        double r,h,area;
        radius = JOptionPane.showInputDialog("Enter Radius");
        r = Double.parseDouble(radius);
        height = JOptionPane.showInputDialog("Enter Height");
        h = Double.parseDouble(height);
        area = Math.PI*r*r*h;
        JOptionPane.showMessageDialog(null,"The volume of Your Cylinder is "+area);
    }
}
