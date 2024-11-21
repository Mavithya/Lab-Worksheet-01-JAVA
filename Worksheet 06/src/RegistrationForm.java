import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegistrationForm extends JFrame implements ActionListener {
    private final int FRAME_WIDTH = 1000;
    private final int FRAME_HEIGHT = 600;
    private final int FRAME_X = 300;
    private final int FRAME_Y = 100;

    private JButton submitBtn;
    private JCheckBox checkBox;
    private JButton resetBtn;
    private JLabel res, titleLable, nameLable, mobileLable, genderLable, dobLable, addressLable;
    private JTextField nameTextField, mobileTextField, addressTextField;
    private JRadioButton maleRadio, femaleRadio;
    private ButtonGroup genderButtonGroup;
    private JComboBox monthBox, yearBox, dayBox;
    private JTextArea textArea,resadd;

    RegistrationForm() {
        setTitle("RegistrationForm");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setLocation(FRAME_X, FRAME_Y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        titleLable = new JLabel("Registration Form");
        titleLable.setSize(350, 50);
        titleLable.setFont(new Font("Arial", Font.BOLD, 25));
        titleLable.setLocation(380, 20);
        contentPane.add(titleLable);

        nameLable = new JLabel("Name");
        nameLable.setSize(100, 50);
        nameLable.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLable.setLocation(100, 75);
        contentPane.add(nameLable);

        nameTextField = new JTextField();
        nameTextField.setSize(250, 30);
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameTextField.setLocation(200, 85);
        contentPane.add(nameTextField);

        mobileLable = new JLabel("Mobile");
        mobileLable.setSize(100, 50);
        mobileLable.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileLable.setLocation(100, 120);
        contentPane.add(mobileLable);

        mobileTextField = new JTextField();
        mobileTextField.setSize(250, 30);
        mobileTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        mobileTextField.setLocation(200, 130);
        contentPane.add(mobileTextField);

        genderLable = new JLabel("Gender");
        genderLable.setSize(100, 50);
        genderLable.setFont(new Font("Arial", Font.PLAIN, 15));
        genderLable.setLocation(100, 170);
        contentPane.add(genderLable);

        maleRadio = new JRadioButton("Male");
        maleRadio.setSize(100, 30);
        maleRadio.setLocation(200, 180);
        maleRadio.setFont(new Font("Arial", Font.PLAIN, 15));
        maleRadio.setSelected(true);
        contentPane.add(maleRadio);

        femaleRadio = new JRadioButton("Female");
        femaleRadio.setSize(100, 30);
        femaleRadio.setLocation(280, 180);
        femaleRadio.setFont(new Font("Arial", Font.PLAIN, 15));
        femaleRadio.setSelected(false);
        contentPane.add(femaleRadio);

        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadio);
        genderButtonGroup.add(femaleRadio);

        dobLable = new JLabel("DOB");
        dobLable.setSize(100, 50);
        dobLable.setFont(new Font("Arial", Font.PLAIN, 15));
        dobLable.setLocation(100, 210);
        contentPane.add(dobLable);

        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        dayBox = new JComboBox(day);
        dayBox.setSize(55, 30);
        dayBox.setLocation(200, 220);
        dayBox.setFont(new Font("Arial", Font.PLAIN, 15));
        contentPane.add(dayBox);

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthBox = new JComboBox(month);
        monthBox.setSize(120, 30);
        monthBox.setLocation(255, 220);
        monthBox.setFont(new Font("Arial", Font.PLAIN, 15));
        contentPane.add(monthBox);

        String[] years = {"1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
        yearBox = new JComboBox(years);
        yearBox.setSize(70, 30);
        yearBox.setLocation(375, 220);
        yearBox.setFont(new Font("Arial", Font.PLAIN, 15));
        contentPane.add(yearBox);

        addressLable = new JLabel("Address");
        addressLable.setSize(100, 50);
        addressLable.setFont(new Font("Arial", Font.PLAIN, 15));
        addressLable.setLocation(100, 270);
        contentPane.add(addressLable);

        addressTextField = new JTextField();
        addressTextField.setSize(250, 80);
        addressTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        addressTextField.setLocation(200, 280);
        contentPane.add(addressTextField);

        checkBox = new JCheckBox("Accept the terms and conditions");
        checkBox.setSize(300, 30);
        checkBox.setLocation(100, 400);
        checkBox.setFont(new Font("Arial", Font.PLAIN, 15));
        contentPane.add(checkBox);


        resetBtn = new JButton("Reset");
        resetBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        resetBtn.setSize(100, 30);
        resetBtn.setLocation(100, 450);
        resetBtn.addActionListener(this);
        contentPane.add(resetBtn);

        submitBtn = new JButton("Submit");
        submitBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        submitBtn.setSize(100, 30);
        submitBtn.setLocation(220, 450);
        submitBtn.addActionListener(this);
        contentPane.add(submitBtn);



        textArea = new JTextArea();
        textArea.setSize(300, 350);
        textArea.setLocation(550, 80);
        textArea.setLineWrap(true);
        textArea.setEnabled(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 15));
        contentPane.add(textArea);

        res = new JLabel("");
        res.setSize(500, 25);
        res.setLocation(100, 500);
        res.setFont(new Font("Arial", Font.PLAIN, 15));
        contentPane.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 180);
        resadd.setLineWrap(true);
        contentPane.add(resadd);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == submitBtn){
            if (checkBox.isSelected()){
                String data1;
                String data = "Name: "+nameTextField.getText()+"\n"+"Mobile: "+mobileTextField.getText()+"\n";
                if (maleRadio.isSelected())data1 = "Gender: Male"+"\n";
                else data1 = "Gender: Female"+"\n";
                String data2 = "DOB: "+dayBox.getSelectedItem()+"/"+monthBox.getSelectedItem()+"/"+yearBox.getSelectedItem()+"\n";
                String data3 = "Address: "+addressTextField.getText()+"\n";
                textArea.setText(data+data1+data2+data3);
                textArea.setEnabled(false);
                res.setText("Registration Successful");

            }else {
                textArea.setText("");
                resadd.setText("");
                res.setText("Please accept the terms and conditions");
            }

        }else if (event.getSource() == resetBtn){
//            String def = "";
            nameTextField.setText("");
            mobileTextField.setText("");
            addressTextField.setText("");
            textArea.setText("");
            res.setText("");
            checkBox.setSelected(false);
            maleRadio.setSelected(true);
            dayBox.setSelectedIndex(0);
            monthBox.setSelectedIndex(0);
            yearBox.setSelectedIndex(0);
            resadd.setText("");
        }

    }
}




