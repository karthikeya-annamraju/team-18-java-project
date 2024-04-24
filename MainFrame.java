import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class MainFrame{
    public static void main(String [] args)
    {
        ImageIcon image1 = new ImageIcon("images/image1.jpg");
        ImageIcon image2 = new ImageIcon("images/image2.jpg");
        ImageIcon image3 = new ImageIcon("images/image3.jpg");
        ImageIcon image4 = new ImageIcon("images/image4.jpg");

        JButton button = new JButton();
        button.setText("Click Here To View Products");
        button.setFocusable(false);
        //button.addActionListener(e -> System.out.println("hello"));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CategoriesFrame categories = new CategoriesFrame();
                categories.setVisible(true);
            }
        });
        button.setBackground(new Color(83, 92, 145));
        button.setForeground(new Color(248, 246, 227));
        button.setFont(new Font("Comic Sans",Font.BOLD,15));

        JLabel label1 = new JLabel();
        label1.setText("Hello Customers ! Welcome to Shopping Cart.");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setForeground(new Color(28,22,120));
        label1.setFont(new Font("Times New Roman",Font.PLAIN,22));
        JLabel label2 = new JLabel();
        label2.setIcon(image1);
        JLabel label3 = new JLabel();
        label3.setIcon(image2);
        JLabel label4 = new JLabel();
        label4.setIcon(image3);
        JLabel label5 = new JLabel();
        label5.setIcon(image4);

        JPanel heading = new JPanel();
        heading.setBounds(15, 20, 450, 50);
        heading.add(label1);
        heading.setBackground(new Color(204, 229, 255));

        JPanel img1 = new JPanel();
        //img1.setBackground(Color.BLUE);
        img1.setBounds(25, 90, 200, 200);
        img1.add(label2);

        JPanel img2 = new JPanel();
        //img2.setBackground(Color.RED);
        img2.setBounds(250, 90, 200, 200);
        img2.add(label3);

        JPanel img3 = new JPanel();
        //img3.setBackground(Color.YELLOW);
        img3.setBounds(25, 310, 200, 200);
        img3.add(label4);

        JPanel img4 = new JPanel();
        //img4.setBackground(Color.GREEN);
        img4.setBounds(250, 310, 200, 200);
        img4.add(label5);

        JPanel click = new JPanel();
        //click.setBackground(Color.GRAY);
        click.setBounds(60, 550, 350, 50);
        click.add(button);
        click.setBackground(new Color(204, 229, 255));

        JFrame frame = new JFrame();
        frame.setTitle("Online Shopping");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(500,700);
        frame.setLayout(null);
        frame.add(heading);
        frame.add(img1);
        frame.add(img2);
        frame.add(img3);
        frame.add(img4);
        frame.add(click);

        ImageIcon image = new ImageIcon("images/logo.jpeg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new ColorUIResource(204, 229, 255));
        
    }
}