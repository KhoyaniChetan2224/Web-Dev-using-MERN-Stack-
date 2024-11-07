import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {

    long random;
    JTextField Tname, Tfname, Temail, Taddress, Tcity, Tstate, Tpincode;
    JButton next;
    JRadioButton male, female, married, unmarried, others;
    JDateChooser dateChooser;
    SignUpOne() {

        setLayout(null);
        setTitle("New Account Application From - Page 1");

        Random ran = new Random();
        random = (Math.abs(ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("Application From No : " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 32));
        formno.setBounds(205, 20, 600, 34);
        add(formno);

        JLabel personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);

        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

         Tname = new JTextField();
        Tname.setFont(new Font("Raleway", Font.BOLD, 14));
        Tname.setBounds(300, 140, 400, 30);
        add(Tname);

        JLabel fname = new JLabel("Father's Name : ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

         Tfname = new JTextField();
        Tfname.setFont(new Font("Raleway", Font.BOLD, 14));
        Tfname.setBounds(300, 190, 400, 30);
        add(Tfname);

        JLabel dob = new JLabel("Date of Birth : ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

         dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);

        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

         male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
         female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergruop = new ButtonGroup();
        gendergruop.add(male);
        gendergruop.add(female);

        JLabel email = new JLabel("Email Address : ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

         Temail = new JTextField();
        Temail.setFont(new Font("Raleway", Font.BOLD, 14));
        Temail.setBounds(300, 340, 400, 30);
        add(Temail);

        JLabel marital = new JLabel("Marital Status : ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

         married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
         others = new JRadioButton("Other");
        others.setBounds(630, 390, 100, 30);
        others.setBackground(Color.WHITE);
        add(others);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(others);

        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

         Taddress = new JTextField();
        Taddress.setFont(new Font("Raleway", Font.BOLD, 14));
        Taddress.setBounds(300, 440, 400, 30);
        add(Taddress);

        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

         Tcity = new JTextField();
        Tcity.setFont(new Font("Raleway", Font.BOLD, 14));
        Tcity.setBounds(300, 490, 400, 30);
        add(Tcity);

        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

         Tstate = new JTextField();
        Tstate.setFont(new Font("Raleway", Font.BOLD, 14));
        Tstate.setBounds(300, 540, 400, 30);
        add(Tstate);

        JLabel pincode = new JLabel("PIN Code : ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

         Tpincode = new JTextField();
        Tpincode.setFont(new Font("Raleway", Font.BOLD, 14));
        Tpincode.setBounds(300, 590, 400, 30);
        add(Tpincode);

         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 750);
        setLocation(350, 10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = Tname.getText();
        String fname = Tfname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = "";
        if (male.isSelected()) {
            gender = "Male";
        } else if(female.isSelected()) {
            gender = "Female";
        }
        String email = Temail.getText();
        String marital = "";
        if (married.isSelected()) {
            marital = "Married";
        } else if(unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (others.isSelected()) {
            marital = "Other";
        }
        String address = Taddress.getText();
        String city = Tcity.getText();
        String state = Tstate.getText();
        String pincode = Tpincode.getText();

        try {
            if (name.equals("")
                    || fname.isEmpty() || dob.isEmpty() || gender.isEmpty() || email.isEmpty() || marital.isEmpty()
                    || address.isEmpty() || city.isEmpty() || pincode.isEmpty() || state.isEmpty()
            ) {
                      JOptionPane.showMessageDialog(null, "Please Enter Data!...");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+
                        gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
