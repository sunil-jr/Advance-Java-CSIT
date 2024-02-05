package swing.guicontrols;

import javax.swing.*;

public class SwingGUIControlsExample extends JFrame {
    public SwingGUIControlsExample(){
        setTitle("Swing GUI controls");
        setBounds(10,10,500,600);
        setLayout(null);

        //label for name
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(10, 15, 100, 50);

        //text field for name
        JTextField txtName = new JTextField();
        txtName.setBounds(115,15,200,50);

        //label for password
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(10, 70, 100, 50);

        //password field for password
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(115, 70, 200, 50);

        //label for description
        JLabel lblDesc = new JLabel("Description : ");
        lblDesc.setBounds(10, 125, 100, 50);

        //text area for description
        JTextArea txtDescription = new JTextArea();
        txtDescription.setBounds(115, 125, 300, 150);

        //label for language
        JLabel lblLanguages = new JLabel("Language : ");
        lblLanguages.setBounds(10, 280, 100, 50);

        //checkbox for nepali
        JCheckBox checkNepali = new JCheckBox("Nepali");
        checkNepali.setBounds(115, 280, 70, 50);

        //checkbox for english
        JCheckBox checkEnglish = new JCheckBox("English");
        checkEnglish.setBounds(190, 280, 70, 50);

        //label for gender
        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(10, 330, 100, 50);

        //radio button for male
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(115, 330, 70, 50);

        //radio button for female
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(190, 330, 70, 50);

        //button grouping for radio button, since without button group, the radio button will not be checked as individual(multiple buttons
        // are selected)
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);

        //adding all the components to the JFrame
        add(lblName);
        add(txtName);

        add(lblPassword);
        add(txtPassword);

        add(lblDesc);
        add(txtDescription);

        add(lblLanguages);
        add(checkEnglish);
        add(checkNepali);

        add(lblGender);
        add(male);
        add(female);


        //default false
        setVisible(true);
        //in the UI, pressing cross(exit) terminates the running program
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new SwingGUIControlsExample();
    }
}
