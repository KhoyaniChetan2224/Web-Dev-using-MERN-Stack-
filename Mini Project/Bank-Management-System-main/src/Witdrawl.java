import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Witdrawl extends JFrame implements ActionListener {
    JTextField amount;
    JButton back, withdraw;
    String pinnumber;
    Witdrawl(String pinnumber) {
        setLayout(null);
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 ,800, 800);
        add(image);

        JLabel text = new JLabel("Enter the Amount you want to Withdrawal:");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 14));
        text.setBounds(150,300, 400, 20);
        image.add(text);

         amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(150, 345, 300, 25);
        image.add(amount);

        withdraw = new JButton("Withdraw");
        withdraw.setBounds(295, 460, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);

         back = new JButton("Back");
        back.setBounds(295, 495, 150, 30);
        back.addActionListener(this);
        image.add(back);


        setSize(800, 800);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == withdraw){
            String num = amount.getText();
            Date date = new Date();
            if (num.equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter the amount you want to withdraw..!");
            } else {
                Conn conn = new Conn();
                String s = "Withdrawal";
                String query = "insert into bank values('"+pinnumber+"','"+date+"','"+s+"','"+num+"')";
                try {
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs"+num+" Withdraw Successfully");

                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else if(ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }

}
