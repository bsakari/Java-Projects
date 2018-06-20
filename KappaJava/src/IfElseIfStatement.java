import javax.swing.*;

public class IfElseIfStatement {
    public static void main(String[] args){
        //Calculating the shipping cost of goods basing on budget
        //These are the Shipping rates
        //Over $75 free
        //Between $50 and $75, the cost is $5
        //Between $25 and $50, the cost is $10
        //Less than $25, the cost is $15
        String totalCost;
        double ttcost,one,two,three;
        one = 15.00;
        two = 10.00;
        three = 5.00;
        totalCost = JOptionPane.showInputDialog("Enter Your Total Cost");
        ttcost = Double.parseDouble(totalCost);
        if (ttcost<25){
            JOptionPane.showMessageDialog(null,"Your Total Cost is "+"$"+(ttcost+one));
        }else if (ttcost >= 25 && ttcost<50){
            JOptionPane.showMessageDialog(null,"Your Total Cost is "+"$"+(ttcost+two));
        }else if (ttcost >= 50 && ttcost <= 75){
            JOptionPane.showMessageDialog(null,"Your Total Cost is "+"$"+(ttcost+three));
        }else if (ttcost>75){
            JOptionPane.showMessageDialog(null,"Your Total Cost is "+"$"+ttcost);
        }

    }
}
