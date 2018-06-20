import javax.swing.*;

public class FreightCharge {
    public static void main(String[] args) {
        String prices;
        double p;
        prices = JOptionPane.showInputDialog("Enter the Price");
        p = Double.parseDouble(prices);
        if (p<25){
            JOptionPane.showMessageDialog(null,"Charge = $"+(p+15));
        }else if (p<50){
            JOptionPane.showMessageDialog(null,"Charge = $"+(p+10));
        }else if (p<75){
            JOptionPane.showMessageDialog(null,"Charge = $"+(p+5));
        }else{
            JOptionPane.showMessageDialog(null,"Charge = $"+(p));
        }
    }
}
