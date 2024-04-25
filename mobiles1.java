import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class mobiles1 extends JFrame {
    public mobiles1() {
        setTitle("mobiles");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(500, 700);
        setLayout(null);

        ImageIcon choco1 = new ImageIcon("images/mobiless2.jpg");

        //creating buttons
        JButton button = createButton("BUY NOW");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    // Establish a connection to stockCountbase
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/team18project", "root", "root");

                    // Create a Statement
                    Statement statement = connection.createStatement();

                    // Execute SQL query
                    int writeQuery = statement.executeUpdate("UPDATE mobiles SET stock = stock - 1 WHERE mobile_name = 'Google Pixel'");
                    
                    ResultSet resultSet = statement.executeQuery("SELECT stock from mobiles WHERE mobile_name = 'Google Pixel'");

                    // ResultSet to print the value of stock
                    while (resultSet.next()) {
                        // Example: Retrieve data from the ResultSet
                        int stockCount = resultSet.getInt("stock");
                        if (stockCount > 0)  {
                            System.out.println("Remaining Stock(Google Pixel): "+stockCount);
                            JOptionPane.showMessageDialog(mobiles1.this , "YOU SUCCESSFULLY BOUGHT THIS ITEM!!");
                        }
                        else {
                            JOptionPane.showMessageDialog(mobiles1.this , "THIS ITEM IS OUT OF STOCK");
                        }
                    }

                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });

        // Create labels
        JLabel label1 = createLabel1("GOOGLE PIXEL");
        JLabel label2 = createLabel2(30,120);
        label2.setIcon(choco1);
        JLabel label3 = createLabel3("<html> Brand : Generic <br/> Model Name : Pixel 7a <br/> Network Service Provider : Unlocked for All Carriers <br/> Operating System : Android 13.0 <br/> Cellular Technology : 5G <br/> PRICE : 49999/-");
        JLabel label4 = createLabel4("<html> Mobile phones have become an indispensable part of modern <br/> life, offering connectivity, convenience, and cutting-edge <br/> technology at your fingertips. From sleek smartphones to <br/> feature-rich devices, mobile phones come in a variety of styles, <br/> specifications, and price points, allowing you to find the <br/> perfect device to suit your needs and lifestyle.");

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
        label1.setBounds(135, 30, 450, 60);
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
        SwingUtilities.invokeLater(Electronic_mobiles::new);
    }
}
