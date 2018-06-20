import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.HeadlessException;
import java.awt.BorderLayout;

public class jj extends JApplet implements ActionListener {
    int x = 0;
    Container mimi;
    public jj()throws HeadlessException{
        JButton button =new JButton("Click Me");
        mimi = this.getContentPane();
        mimi.setLayout(new BorderLayout());
        button.add(mimi,BorderLayout.NORTH);
        button.addActionListener(this);
        mimi.setBackground(Color.blue);
    }
    public void actionPerformed(ActionEvent e){
        x=(x+1)%3;
        if (x == 0){
            mimi.setBackground(Color.blue);
        }else if (x == 1){
            mimi.setBackground(Color.yellow);
        }else if (x == 2){
            mimi.setBackground(Color.orange);
        }
    }
}
