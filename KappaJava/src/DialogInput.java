import javax.swing.*;

public class DialogInput {
    public static void main(String[] args){
        String firstName,secondName;
        firstName = JOptionPane.showInputDialog("Enter Your First Name");
        secondName = JOptionPane.showInputDialog("Enter Your Second Name");
        JOptionPane.showMessageDialog(null,"Your name is "+firstName+secondName);

    }
}
