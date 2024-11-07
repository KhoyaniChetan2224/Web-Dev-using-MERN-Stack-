import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {
    String pinnumber;
    JButton deposit, withdrawl, ministatement, exit, balanceenuiry, fastcash, pinchange;
    Transactions(String pinnumber) {
        setLayout(null);
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 ,800, 800);
        add(image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(185, 280, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 14));
        image.add(text);

         deposit = new JButton("Deposit");
        deposit.setBounds(150, 400, 125, 30);
        deposit.addActionListener(this);
        image.add(deposit);

         withdrawl = new JButton("Withdrawal");
        withdrawl.setBounds(325, 400, 125, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

         fastcash = new JButton("Fast Cash");
        fastcash.setBounds(150, 435, 125, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

         ministatement = new JButton("Mini Statement");
        ministatement.setBounds(325, 435, 125, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);

         pinchange = new JButton("PIN Change");
        pinchange.setBounds(150, 470, 125, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

         balanceenuiry = new JButton("Balance Enquiry");
        balanceenuiry.setBounds(325, 470, 125, 30);
        balanceenuiry.addActionListener(this);
        image.add(balanceenuiry);

         exit = new JButton("Exit");
        exit.setBounds(150, 505, 125, 25);
        exit.addActionListener(this);
        image.add(exit);

        setSize(800, 800);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            System.exit(0);
        } else if(ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        } else if(ae.getSource() == withdrawl) {
            setVisible(false);
            new Witdrawl(pinnumber).setVisible(true);
        } else if(ae.getSource() == fastcash) {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        } else if(ae.getSource() == pinchange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        } else if(ae.getSource() == balanceenuiry) {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        } else if(ae.getSource() == ministatement) {
            new MiniStatement(pinnumber).setVisible(true);
        }
    }

}
