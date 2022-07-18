import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectCommandButton{
  JLabel label;

  public SelectCommandButton(){
    JFrame frame = new JFrame("Command button Test");
    JButton first = new JButton("First");
    JButton second = new JButton("Second");
    JButton third = new JButton("Third");
       JPanel panel = new JPanel();
    panel.add(first);
    panel.add(second);
    panel.add(third);
   
    first.addActionListener(new MyAction());
    second.addActionListener(new MyAction1());
    third.addActionListener(new MyAction2());
       label = new JLabel("Commnad Test");
    frame.add(panel, BorderLayout.NORTH);
    frame.add(label, BorderLayout.CENTER);
    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public class MyAction implements ActionListener{
    public void actionPerformed(ActionEvent e){
      label.setText(e.getActionCommand());
      JOptionPane.showMessageDialog(null,"This is the " + e.getActionCommand() + 
" command button.");
    }
  }
  
public class MyAction1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      label.setText(e.getActionCommand());
      JOptionPane.showMessageDialog(null,"This is the dara " + e.getActionCommand() + 
" command button.");
    }
  }

public class MyAction2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
      label.setText(e.getActionCommand());
      JOptionPane.showMessageDialog(null,"This is triu the " + e.getActionCommand() + 
" command button.");
    }
  }

public static void main(String[] args){
    SelectCommandButton sr = new SelectCommandButton();
  }
}
