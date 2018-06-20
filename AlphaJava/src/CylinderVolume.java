import javax.swing.*;

public class CylinderVolume {
    public static void main(String[] args) {
        String height,radius;
        double h,r,area;
        height = JOptionPane.showInputDialog("Height");
        radius = JOptionPane.showInputDialog("Radius");
        h = Double.parseDouble(height);
        r = Double.parseDouble(radius);
        area = Math.PI*r*r*h;
        JOptionPane.showMessageDialog(null,"Volume = "+area);
    }
}
