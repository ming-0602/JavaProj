package GUI;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class testlogin extends JFrame {
    private JFrame jf;
    private JButton jButton[];

    //    private String buttonNames[] = {"Login", "Exit"};
    public testlogin() {
        //page title
        super("Car Booking System");

        JPanel userfield = new JPanel();
        JPanel passfield = new JPanel();
        JPanel jpbut = new JPanel();
        JPanel all = new JPanel(new BorderLayout(2,3));

        JTextField text1 = new JTextField("Username: ");
        text1.setEditable(false);
        userfield.add(text1, BorderLayout.NORTH);
        JTextField inputtext1 = new JTextField(" ");
        inputtext1.setPreferredSize(new Dimension(100, 20));
        userfield.add(inputtext1);
        userfield.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));

        JTextField text2 = new JTextField("Password: ");
        text2.setEditable(false);
        passfield.add(text2,BorderLayout.NORTH);
        JTextField inputtext2 = new JTextField(" ");
        inputtext2.setPreferredSize(new Dimension(100, 20));
        passfield.add(inputtext2, BorderLayout.NORTH);
        passfield.setBorder(BorderFactory.createEmptyBorder(0, 0, 200, 0));

        JButton butlogin = new JButton("Login");
        jpbut.add(butlogin, BorderLayout.NORTH);
//        add(jpbut,BorderLayout.NORTH);
        jpbut.setBorder(BorderFactory.createEmptyBorder(40, 0, 0, 0));

        all.add(userfield, BorderLayout.NORTH);
        all.add(passfield, BorderLayout.NORTH);
        add(jpbut, BorderLayout.SOUTH);
        all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));

        add(all);
        setSize(600, 200);
        setVisible(true);

    }

    public static void main(String[] args) {
        testlogin lg = new testlogin();
    }

}