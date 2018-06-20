import javax.swing.*;

public class RectangleSrea {
    public static void main(String[] args){
        String length,width;
        double l,w,area;
        length = JOptionPane.showInputDialog("Enter Length");
        width = JOptionPane.showInputDialog("Enter Width");
        l = Double.parseDouble(length);
        w = Double.parseDouble(width);
        area = l*w;
        JOptionPane.showMessageDialog(null,"Area = "+area);
    }
}
