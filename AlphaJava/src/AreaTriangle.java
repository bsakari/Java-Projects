import javax.swing.*;

public class AreaTriangle {
    public static void main(String[] args){
        String base,height;
        double b,h,area;
        base = JOptionPane.showInputDialog("Enter the Base");
        height = JOptionPane.showInputDialog("Enter the Height");
        b = Double.parseDouble(base);
        h = Double.parseDouble(height);
        area = 1/2.0*b*h;
        JOptionPane.showMessageDialog(null,"Area = "+area);

    }
}
