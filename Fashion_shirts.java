import java.awt.Color;
import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import javax.swing.*;

public class Fashion_shirts extends JFrame {
    public Fashion_shirts() {
        setTitle("shirts");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(500, 700);
        setLayout(null);

        ImageIcon choco1 = new ImageIcon("images/shirt1.jpg");
        ImageIcon choco2 = new ImageIcon("images/shirt2.jpg");
        ImageIcon choco3 = new ImageIcon("images/shirt3.jpg");
        ImageIcon choco4 = new ImageIcon("images/shirt4.jpg");

        // Create buttons
        JButton button1 = createButton(25,120);
        button1.setIcon(choco1);
        JButton button2 = createButton(250,120);
        button2.setIcon(choco2);
        JButton button3 = createButton(25,345);
        button3.setIcon(choco3);
        JButton button4 = createButton(250,345);
        button4.setIcon(choco4);
        
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
        SwingUtilities.invokeLater(FashionWear::new);
    }
}
