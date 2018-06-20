import javax.swing.*;

public class IfElseRevision {
    public static void main(String[] args) {
        String PriceValue;
        double prices;
        PriceValue = JOptionPane.showInputDialog("Enter Your Total Amount");
        prices = Double.parseDouble(PriceValue);
        if (prices<=25){
            JOptionPane.showMessageDialog(null,"Your Total Bill is $"+(prices+15));
        }else  if (prices<=50){
            JOptionPane.showMessageDialog(null,"Your Total Bill is $"+(prices+10));
        } else  if (prices<=75){
            JOptionPane.showMessageDialog(null,"Your Total Bill is $"+(prices+5));
        }else  if (prices>75){
            JOptionPane.showMessageDialog(null,"Your Total Bill is $"+(prices));
        }

    }
}
