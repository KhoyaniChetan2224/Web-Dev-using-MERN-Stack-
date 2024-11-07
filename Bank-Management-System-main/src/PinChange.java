import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    String pinnumber;
    JPasswordField pin, repin;
    JButton change, back;
    PinChange(String pinnumber) {
        setLayout(null);
        this.pinnumber = pinnumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0 ,800, 800);
        add(image);

        JLabel text = new JLabel("Change Your PIN");
        text.setBounds(227, 270, 500, 35);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setForeground(Color.WHITE);
        image.add(text);

        JLabel pintext = new JLabel("New PIN :");
        pintext.setBounds(165, 320, 100, 25);
        pintext.setFont(new Font("System", Font.BOLD, 14));
        pintext.setForeground(Color.WHITE);
        image.add(pintext);
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(300, 320, 130, 25);
        image.add(pin);

        JLabel repintext = new JLabel("Re-Enter PIN :");
        repintext.setBounds(165, 360, 140, 25);
        repintext.setFont(new Font("System", Font.BOLD, 14));
        repintext.setForeground(Color.WHITE);
        image.add(repintext);
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(300, 360, 130, 25);
        image.add(repin);

        change = new JButton("Change");
        change.setBounds(295, 460, 150, 30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("Back");
        back.setBounds(295, 495, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(800, 800);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == change) {
            try {
                String npin = pin.getText();
                String rpin = repin.getText();

                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Enter PIN does not match");
                    return;
                }
                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter New PIN");
                    return;
                }
                if (rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Re-Enter New PIN");
                    return;
                }

                Conn conn = new Conn();
                String query1 = "update bank set pin='"+rpin+"' where pin='"+pinnumber+"'";
                String query2 = "update login set pin='"+rpin+"' where pin='"+pinnumber+"'";
                String query3 = "update signupthree set pin='"+rpin+"' where pin='"+pinnumber+"'";
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "PIN Change Successfully");

                setVisible(false);
                new Transactions(rpin).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        } else if(ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }

}
