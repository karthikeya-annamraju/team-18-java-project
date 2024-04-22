import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Cosmetics_lipsticks extends JFrame {
    public Cosmetics_lipsticks() {
        setTitle("lipsticks");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(500, 700);
        setLayout(null);

        ImageIcon choco1 = new ImageIcon("images/lipstick1.jpg");
        ImageIcon choco2 = new ImageIcon("images/lipstick2.jpg");
        ImageIcon choco3 = new ImageIcon("images/lipstick3.jpg");
        ImageIcon choco4 = new ImageIcon("images/lipstick4.jpg");

        // Create buttons
        JButton button1 = createButton(25,120);
        button1.setIcon(choco1);
        JButton button2 = createButton(250,120);
        button2.setIcon(choco2);
        JButton button3 = createButton(25,345);
        button3.setIcon(choco3);
        JButton button4 = createButton(250,345);
        button4.setIcon(choco4);
        
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open frame for Electronic Devices
               lipstick1 lipsticks1 = new lipstick1();
               lipsticks1.setVisible(true);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lipstick2 lipsticks2 = new lipstick2();
               lipsticks2.setVisible(true);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open frame for Electronic Devices
                lipstick3 lipsticks3 = new lipstick3();
               lipsticks3.setVisible(true);
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open frame for Electronic Devices
                lipstick4 lipsticks4 = new lipstick4();
               lipsticks4.setVisible(true);
            }
        });

        // Create labels
        JLabel label1 = createLabel1("CHOOSE BRAND");
        JLabel label2 = createLabel2("Happy customers, happy business.");
        
        // Add components to the frame
        getContentPane().add(label1);
        getContentPane().add(label2);
        getContentPane().add(button1);
        getContentPane().add(button2);
        getContentPane().add(button3);
        getContentPane().add(button4);

        // Set frame properties
        ImageIcon image = new ImageIcon("images/logo.jpeg");
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(225, 240, 218));
        setVisible(true);
    }
    private JButton createButton(int x,int y) {
        JButton button = new JButton();
        button.setFocusable(false);
        button.setBounds(x, y, 200, 200);
        button.setBackground(new Color(225, 175, 209));
        return button;
    }
    

    private JLabel createLabel1(String text) {
        JLabel label1 = new JLabel(text);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setBounds(80, 45, 450, 60);
        label1.setBackground(new Color(255, 190, 152));
        label1.setForeground(new Color(28,22,120));
        label1.setFont(new Font("MV Boli",Font.BOLD,40));
        return label1;
    }
    private JLabel createLabel2(String text) {
        JLabel label2 = new JLabel(text);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setBounds(90, 570, 400, 40);
        label2.setBackground(new Color(254, 236, 226));
        label2.setForeground(new Color(19, 93, 102));
        label2.setFont(new Font("MV Boli",Font.PLAIN,18));
        return label2;
    }
    public static void main(String[] args) {
        // Create an instance of CategoriesFrame
        SwingUtilities.invokeLater(Cosmetics::new);
    }
}
