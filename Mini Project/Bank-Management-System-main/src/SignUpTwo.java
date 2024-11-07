import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpTwo extends JFrame implements ActionListener {
    String formno;
    JComboBox religion, category, income, eduaction, occupation;
    JTextField Taadhar, Tpancode;
    JButton next;
    JRadioButton Syes, Sno, Eyes, Eno;

    SignUpTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        setTitle("New Account Application From - Page 2");

        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel r = new JLabel("Religion : ");
        r.setFont(new Font("Raleway", Font.BOLD, 20));
        r.setBounds(100, 140, 100, 30);
        add(r);
        String []valRel = {"Hindu", "Muslim", "Sikh", "Other"};
         religion = new JComboBox<>(valRel);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel c = new JLabel("Category : ");
        c.setFont(new Font("Raleway", Font.BOLD, 20));
        c.setBounds(100, 190, 200, 30);
        add(c);
        String []valCal = {"Gernal", "ST", "OBC", "SC", "Other"};
         category = new JComboBox<>(valCal);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel i = new JLabel("Income: ");
        i.setFont(new Font("Raleway", Font.BOLD, 20));
        i.setBounds(100, 240, 200, 30);
        add(i);
        String []valIn = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000"};
         income = new JComboBox<>(valIn);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel e = new JLabel("Educational");
        e.setFont(new Font("Raleway", Font.BOLD, 20));
        e.setBounds(100, 290, 200, 30);
        add(e);
        JLabel q = new JLabel("Qualification : ");
        q.setFont(new Font("Raleway", Font.BOLD, 20));
        q.setBounds(100, 315, 200, 30);
        add(q);
        String []valEQ = {"Non-Graduation", "Graduate", "Post-Graduation", "Other"};
         eduaction = new JComboBox<>(valEQ);
        eduaction.setBounds(300, 315, 400, 30);
        eduaction.setBackground(Color.WHITE);
        add(eduaction);

        JLabel o = new JLabel("Occupation : ");
        o.setFont(new Font("Raleway", Font.BOLD, 20));
        o.setBounds(100, 390, 200, 30);
        add(o);
        String []valO = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
         occupation = new JComboBox<>(valO);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel p = new JLabel("PAN No : ");
        p.setFont(new Font("Raleway", Font.BOLD, 20));
        p.setBounds(100, 440, 200, 30);
        add(p);
        Tpancode = new JTextField();
        Tpancode.setFont(new Font("Raleway", Font.BOLD, 14));
        Tpancode.setBounds(300, 440, 400, 30);
        add(Tpancode);

        JLabel a = new JLabel("Aadhar No : ");
        a.setFont(new Font("Raleway", Font.BOLD, 20));
        a.setBounds(100, 490, 200, 30);
        add(a);
        Taadhar = new JTextField();
        Taadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        Taadhar.setBounds(300, 490, 400, 30);
        add(Taadhar);

        JLabel s = new JLabel("Senior Citizen : ");
        s.setFont(new Font("Raleway", Font.BOLD, 20));
        s.setBounds(100, 540, 200, 30);
        add(s);
        Syes = new JRadioButton("Yes");
        Syes.setBounds(300, 540, 100, 30);
        Syes.setBackground(Color.WHITE);
        add(Syes);
        Sno = new JRadioButton("No");
        Sno.setBounds(450, 540, 100, 30);
        Sno.setBackground(Color.WHITE);
        add(Sno);
        ButtonGroup senior = new ButtonGroup();
        senior.add(Syes);
        senior.add(Sno);

        JLabel ex = new JLabel("Exisitng Account : ");
        ex.setFont(new Font("Raleway", Font.BOLD, 20));
        ex.setBounds(100, 590, 200, 30);
        add(ex);
        Eyes = new JRadioButton("Yes");
        Eyes.setBounds(300, 590, 100, 30);
        Eyes.setBackground(Color.WHITE);
        add(Eyes);
        Eno = new JRadioButton("No");
        Eno.setBounds(450, 590, 100, 30);
        Eno.setBackground(Color.WHITE);
        add(Eno);
        ButtonGroup Exising = new ButtonGroup();
        Exising.add(Eyes);
        Exising.add(Eno);

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
        String S_religion = (String)religion.getSelectedItem();
        String S_category = (String)category.getSelectedItem();
        String S_income = (String)income.getSelectedItem();
        String S_education = (String)eduaction.getSelectedItem();
        String S_occuaption = (String)occupation.getSelectedItem();
        String SeniorCitizon = "";
        if (Syes.isSelected()) {
            SeniorCitizon = "Yes";
        } else if(Sno.isSelected()) {
            SeniorCitizon = "No";
        }
        String ExistingAccount = "";
        if (Eyes.isSelected()) {
            ExistingAccount= "Yes";
        } else if(Eno.isSelected()) {
            ExistingAccount = "No";
        }
        String S_pan = (String)Tpancode.getText();
        String S_aadhar = (String)Taadhar.getText();

        try {
            if(formno.isEmpty()
                    || S_religion.isEmpty() || S_category.isEmpty() || S_income.isEmpty() || S_education.isEmpty()
                    || S_occuaption.isEmpty() || S_pan.isEmpty() || S_aadhar.isEmpty() || SeniorCitizon.isEmpty() || ExistingAccount.isEmpty()
            ) {
                     JOptionPane.showMessageDialog(null, "Please Enter Data!...");
            } else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "', '" + S_religion + "', '" + S_category + "', '" + S_income + "', '" +
                        S_education + "', '" + S_occuaption + "', '" + S_pan + "', '" + S_aadhar + "', '" + SeniorCitizon + "', '" + ExistingAccount + "')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpThree(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
