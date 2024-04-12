import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class FoodItems_biscuits
{
    public static void main(String[] args)
    {
        ImageIcon choco1 = new ImageIcon("images/biscuits1.jpg");
        ImageIcon choco2 = new ImageIcon("images/biscuits2.jpg");
        ImageIcon choco3 = new ImageIcon("images/biscuits3.jpg");
        ImageIcon choco4 = new ImageIcon("images/biscuits4.jpg");

        JButton button1 = new JButton();
        button1.setBounds(25, 120, 200, 200);
        button1.addActionListener(e -> System.out.println("hello"));
        button1.setBackground(new Color(247, 238, 221));
        button1.setForeground(new Color(73, 105, 137));
        button1.setIcon(choco1);

        JButton button2 = new JButton();
        button2.setBounds(250, 120, 200, 200);
        button2.addActionListener(e -> System.out.println("hello"));
        button2.setBackground(new Color(247, 238, 221));
        button2.setForeground(new Color(73, 105, 137));
        button2.setIcon(choco2);

        JButton button3 = new JButton();
        button3.setBounds(25, 345, 200, 200);
        button3.addActionListener(e -> System.out.println("hello"));
        button3.setBackground(new Color(247, 238, 221));
        button3.setForeground(new Color(73, 105, 137));
        button3.setIcon(choco3);

        JButton button4 = new JButton();
        button4.setBounds(250, 345, 200, 200);
        button4.addActionListener(e -> System.out.println("hello"));
        button4.setBackground(new Color(247, 238, 221));
        button4.setForeground(new Color(73, 105, 137));
        button4.setIcon(choco4);

        JLabel label1 = new JLabel();
        label1.setText("CHOOSE BRAND");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setForeground(new Color(28,22,120));
        label1.setFont(new Font("MV Boli",Font.BOLD,38));

        JLabel label2 = new JLabel();
        label2.setText("Happy customers, happy business.");
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);
        label2.setForeground(new Color(19, 93, 102));
        label2.setFont(new Font("MV Boli",Font.PLAIN,18));

        JPanel heading = new JPanel();
        heading.setBounds(10, 35, 450, 60);
        heading.setBackground(new Color(190, 215, 180));
        heading.add(label1);

        JPanel tagline = new JPanel();
        tagline.setBounds(40, 580, 400, 40);
        tagline.setBackground(new Color(225, 240, 218));
        tagline.add(label2);

        JFrame frame = new JFrame();
        frame.setTitle("shopping cart");
        frame.setTitle("online shopping");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(500,700);
        frame.setLayout(null);
        frame.add(heading);
        frame.add(tagline);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        ImageIcon image = new ImageIcon("images/logo.jpeg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(225, 240, 218));
    }
}