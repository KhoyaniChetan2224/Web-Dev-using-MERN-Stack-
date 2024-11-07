import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpThree extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    SignUpThree(String formno) {
        this.formno = formno;
        setLayout(null);
        setTitle("New Account Application From - Page 3");

        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel type = new JLabel("Account Type : ");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 110, 200, 30);
        add(type);
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 150, 250,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(350, 150, 250,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(100, 190, 250,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(350, 190, 250,20);
        r4.setBackground(Color.WHITE);
        add(r4);
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number : ");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 270, 200, 30);
        add(card);
        JLabel number = new JLabel("XXXX-XXXX-XXXX-X187");
        number.setFont(new Font("Raleway", Font.PLAIN, 20));
        number.setBounds(330, 270, 330, 30);
        add(number);
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.PLAIN, 12));
        carddetail.setBounds(100, 300, 330, 20);
        add(carddetail);

        JLabel pin = new JLabel("PIN Number : ");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 340, 200, 30);
        add(pin);
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.PLAIN, 20));
        pnumber.setBounds(330, 340, 330, 30);
        add(pnumber);
        JLabel pindetail = new JLabel("Your 4 Digit PIN Number");
        pindetail.setFont(new Font("Raleway", Font.PLAIN, 12));
        pindetail.setBounds(100, 370, 330, 20);
        add(pindetail);

        JLabel services = new JLabel("Services Required : ");
        services.setFont(new Font("Raleway",Font.BOLD, 22));
        services.setBounds(100, 420, 300, 30);
        add(services);
        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 470, 200, 18);
        c1.setBackground(Color.WHITE);
        add(c1);
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 470, 200, 18);
        c2.setBackground(Color.WHITE);
        add(c2);
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 520, 200, 18);
        c3.setBackground(Color.WHITE);
        add(c3);
        c4 = new JCheckBox("Email & SMS Alert");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 520, 200, 18);
        c4.setBackground(Color.WHITE);
        add(c4);
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 570, 200, 18);
        c5.setBackground(Color.WHITE);
        add(c5);
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 570, 200, 18);
        c6.setBackground(Color.WHITE);
        add(c6);
        c7 = new JCheckBox(" I Nereby declares that the above entered details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway", 0, 12));
        c7.setBounds(100, 620, 600, 14);
        c7.setBackground(Color.WHITE);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(360, 660, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(560, 660, 100, 30);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(Color.WHITE);
        setSize(850, 750);
        setLocation(350, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = "";
            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Reccuring Deposit Account";
            }

            Random random = new Random();
            String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            String facility = "";
            if (c1.isSelected()) {
                facility += " ATM Card";
            }
            if (c2.isSelected()) {
                facility += " Internet Banking";
            }
            if (c3.isSelected()) {
                facility += " Mobile banking";
            }
            if (c4.isSelected()) {
                facility += " Email & SMS Alert";
            }
            if (c5.isSelected()) {
                facility += " Cheque Book";
            }
            if (c6.isSelected()) {
                facility += " E-Statement";
            }

            try {
                if (accountType.isEmpty() || facility.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Data!...");
                } else {
                    Conn conn = new Conn();
                    String query = "insert into signupthree values('" + formno + "', '" + accountType + "', '" + cardNumber
                            + "', '" + pinNumber + "', '" + facility + "')";
                    conn.s.executeUpdate(query);

                    query = "insert into login values('" + formno + "', '" + cardNumber + "', '" + pinNumber + "')";
                    conn.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\nPIN Number: "
                            + pinNumber);
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(true);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if(ae.getSource() == cancel) {
            try {
                Conn conn = new Conn();
                String query = "delete from signup where formno='"+formno+"'";
                conn.s.executeUpdate(query);
                query = "delete from signuptwo where formno='"+formno+"'";
                conn.s.executeUpdate(query);

                setVisible(false);
                new Login().setVisible(true);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

}
