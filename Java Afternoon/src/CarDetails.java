import javax.swing.*;

public class CarDetails {
    public static void main(String[] args) {
        CarConstractor constractor;
        String car = JOptionPane.showInputDialog("Enter Car Name");
        String wSize = JOptionPane.showInputDialog("Enter Wheel Size");
        double wheelSize = Double.parseDouble(wSize);
        constractor = new CarConstractor(car,wheelSize);
        JOptionPane.showMessageDialog(null,constractor.toString());

    }
}
