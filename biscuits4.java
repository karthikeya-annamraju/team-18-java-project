import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class biscuits4 extends JFrame {
    public biscuits4() {
        setTitle("biscuits");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(500, 700);
        setLayout(null);

        ImageIcon choco1 = new ImageIcon("images/biscuits4.jpg");

        //creating buttons
        JButton button = createButton("BUY NOW");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a popup message when the button is clicked
                JOptionPane.showMessageDialog(biscuits4.this , "YOU SUCCESSFULLY BOUGHT THIS ITEM!!");
            }
        });

        // Create labels
        JLabel label1 = createLabel1("50-50 BISCUIT");
        JLabel label2 = createLabel2(30,120);
        label2.setIcon(choco1);
        JLabel label3 = createLabel3("<html> Diet Type : Vegetarian <br/> Number of Items : 1 <br/> Net Quantity : 45.0 gram <br/> Brand : Britannia <br/> Item Weight	: 45 Grams <br/> Number of Pieces : 1 <br/> Item Form : Solid");
        JLabel label4 = createLabel4("<html> Biscuits, a beloved staple in households worldwide, are <br/> versatile, crispy, and delectable treats that cater to a <br/> wide range of tastes and preferences. Whether enjoyed as a <br/> quick snack with tea, paired with cheese, or savored on <br/> their own, biscuits offer a delightful crunch and <br/> satisfying flavor experience.");

        // Add components to the frame
        getContentPane().add(label1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(label4);
        getContentPane().add(button);

        // Set frame properties
        ImageIcon image = new ImageIcon("images/logo.jpeg");
        setIconImage(image.getImage());
        getContentPane().setBackground(new Color(221, 221, 221));
        setVisible(true);
    }

    private JLabel createLabel1(String text) {
        JLabel label1 = new JLabel(text);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setBounds(115, 30, 450, 60);
        label1.setBackground(new Color(255, 190, 152));
        label1.setForeground(new Color(28,22,120));
        label1.setFont(new Font("MV Boli",Font.BOLD,30));
        return label1;
    }

    private JLabel createLabel2(int x,int y) {
        JLabel label2 = new JLabel();
        label2.setBounds(x, y, 200, 200);
        return label2;
    }

    private JLabel createLabel3(String text) {
        JLabel label3 = new JLabel(text);
        label3.setBounds(260, 120, 200, 200);
        label3.setBackground(new Color(221, 221, 221));
        label3.setForeground(new Color(0, 60, 67));
        label3.setFont(new Font("MV Boli",Font.BOLD,14));
        return label3;
    }

    private JLabel createLabel4(String text) {
        JLabel label4 = new JLabel(text);
        label4.setBounds(15, 290, 800, 300);
        label4.setBackground(new Color(238, 238, 238));
        label4.setForeground(new Color(19, 93, 102));
        label4.setFont(new Font("MV Boli",Font.BOLD,14));
        return label4;
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFocusable(false);
        button.setBounds(80, 560, 300, 40);
        button.setBackground(new Color(179, 200, 207));
        button.setForeground(new Color(73, 105, 137));
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        return button;
    }


    public static void main(String[] args) {
        // Create an instance of CategoriesFrame
        SwingUtilities.invokeLater(FoodItems_biscuits::new);
    }
}
