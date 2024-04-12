import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ElectronicDevices extends JFrame {
    public ElectronicDevices() {
        setTitle("electronic devices");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(500, 700);
        setLayout(null);

        // Create buttons
        JButton button1 = createButton("Mobiles", 150);
        JButton button2 = createButton("Laptops", 250);
        JButton button3 = createButton("TV", 350);
        JButton button4 = createButton("AC", 450);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open frame for Electronic Devices
                Electronic_mobiles mobile = new Electronic_mobiles();
                mobile.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                 Electronic_laptops laptop = new Electronic_laptops();
                 laptop.setVisible(true);
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
               Electronic_tvs tv = new Electronic_tvs();
               tv.setVisible(true);
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                Electronic_acs ac = new Electronic_acs();
                ac.setVisible(true);
            }
        });

        // Create labels
        JLabel label1 = createLabel1("ELECTRONIC DEVICES");
        JLabel label2 = createLabel2("Happiness is not in money, but in shopping.!!");
        
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
        getContentPane().setBackground(new Color(239, 236, 236));
        setVisible(true);
    }
    private JButton createButton(String text, int y) {
        JButton button = new JButton(text);
        button.setFocusable(false);
        button.setBounds(90, y, 300, 60);
        button.setBackground(new Color(225, 175, 209));
        button.setForeground(new Color(73, 105, 137));
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        return button;
    }

    private JLabel createLabel1(String text) {
        JLabel label1 = new JLabel(text);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setBounds(15, 45, 450, 60);
        label1.setBackground(new Color(255, 190, 152));
        label1.setForeground(new Color(28,22,120));
        label1.setFont(new Font("MV Boli",Font.BOLD,40));
        return label1;
    }
    private JLabel createLabel2(String text) {
        JLabel label2 = new JLabel(text);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setBounds(40, 550, 400, 40);
        label2.setBackground(new Color(254, 236, 226));
        label2.setForeground(new Color(19, 93, 102));
        label2.setFont(new Font("MV Boli",Font.PLAIN,18));
        return label2;
    }
    public static void main(String[] args) {
        // Create an instance of CategoriesFrame
        SwingUtilities.invokeLater(CategoriesFrame::new);
    }
}
