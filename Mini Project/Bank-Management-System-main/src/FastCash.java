import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener {
    String pinnumber;
    JButton f1, f2, f3, f4, f5, f6, back;
    FastCash(String pinnumber) {
        setLayout(null);
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 ,800, 800);
        add(image);

        JLabel text = new JLabel("Select Withdrawal Amount");
        text.setBounds(200, 280, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 14));
        image.add(text);

         f1 = new JButton("Rs 100");
        f1.setBounds(150, 400, 125, 30);
        f1.addActionListener(this);
        image.add(f1);

         f2 = new JButton("Rs 500");
        f2.setBounds(325, 400, 125, 30);
        f2.addActionListener(this);
        image.add(f2);

         f3 = new JButton("Rs 1000");
        f3.setBounds(150, 435, 125, 30);
        f3.addActionListener(this);
        image.add(f3);

         f4 = new JButton("Rs 2000");
        f4.setBounds(325, 435, 125, 30);
        f4.addActionListener(this);
        image.add(f4);

         f5 = new JButton("Rs 5000");
        f5.setBounds(150, 470, 125, 30);
        f5.addActionListener(this);
        image.add(f5);

         f6 = new JButton("Rs 10000");
        f6.setBounds(325, 470, 125, 30);
        f6.addActionListener(this);
        image.add(f6);

         back = new JButton("Back");
        back.setBounds(150, 505, 125, 25);
        back.addActionListener(this);
        image.add(back);

        setSize(800, 800);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn conn = new Conn();
            try {
                ResultSet rs = conn.s.executeQuery("select * from bank where  pin='"+pinnumber+"'");
                int balance = 0;
                while (rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if(ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }

                Date date = new Date();
                String s = "Withdrawal";
                String query = "insert into bank values('"+pinnumber+"','"+date+"','"+s+"','"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount + " Withdrawal Successfully");

                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
