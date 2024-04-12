// Importing Frameworks
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;


// Shopping Cart

public class test {
    public static void main(String[] args) {

        // Main Frame
        JFrame mainFrame = new JFrame("Main Frame");
        mainFrame.setResizable(false);
        mainFrame.setSize(600, 400);
        mainFrame.setIconImage(new ImageIcon("images/img.jpg").getImage());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Products Button -> Main Frame.
        JButton button = new JButton("Products");
        button.setBounds(50, 100, 95, 30);
        mainFrame.add(button);  // add button to main frame.
        mainFrame.setLayout(null);

        // A Panel for Main Frame
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 100, 100);
        panel.add(button);
        mainFrame.add(panel);

        // Category Frame
        JFrame catFrame = new JFrame("Category Frame");
        //catFrame.setVisible(true);  // add this in action listener.
        catFrame.setResizable(false);
        catFrame.setSize(600, 400);
        catFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        // Electronics Frame
        JFrame elecFrame = new JFrame("Electronics Frame");
        elecFrame.setResizable(false);
        elecFrame.setSize(600, 400);
        elecFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Electronics Button -> Category Frame.
        JButton button2 = new JButton("Electronics");
        button.setBounds(100, 100, 95, 30);
        catFrame.add(button2);  // add button to category frame.

        // Electronics Button -> Category Frame.
        JButton button3 = new JButton("Furniture");
        button.setBounds(300, 100, 95, 30);
        catFrame.add(button3);  // add button to category frame.

        // A Panel for Category Frame
        JPanel panel2 = new JPanel();
        panel2.setBounds(70, 80, 100, 100);
        panel2.add(button2);
        panel2.add(button3);
        catFrame.add(panel2);

        // DataBase Connection

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                catFrame.setVisible(true);
            }
        });

        // Main Frame Visibility set True
        mainFrame.setVisible(true);
    }
}
