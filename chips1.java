import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class chips1 extends JFrame {
    public chips1() {
        setTitle("chips");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(500, 700);
        setLayout(null);

        ImageIcon choco1 = new ImageIcon("images/chips1.jpg");

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
                    int writeQuery = statement.executeUpdate("UPDATE chips SET stock = stock - 1 WHERE chips_name = 'Lays'");
                    
                    ResultSet resultSet = statement.executeQuery("SELECT stock from chips WHERE chips_name = 'Lays'");

                    // ResultSet to print the value of stock
                    while (resultSet.next()) {
                        // Example: Retrieve data from the ResultSet
                        int stockCount = resultSet.getInt("stock");
                        if (stockCount > 0)  {
                            System.out.println("Remaining Stock (Lays): "+stockCount);
                            JOptionPane.showMessageDialog(chips1.this , "YOU SUCCESSFULLY BOUGHT THIS ITEM!!");
                        }
                        else {
                            JOptionPane.showMessageDialog(chips1.this , "THIS ITEM IS OUT OF STOCK");
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
        JLabel label1 = createLabel1("LAY'S");
        JLabel label2 = createLabel2(30,120);
        label2.setIcon(choco1);
        JLabel label3 = createLabel3("<html> Brand : Lay's <br/> Net Quantity : 50.0 gram <br/> Number of Items : 1 <br/> Type : Potato Chip <br/Diet Type : Vegetarian <br/> Item Form : Chips <br/> Item Weight : 50 Grams");
        JLabel label4 = createLabel4("<html> Chips, also known as crisps in some regions, are a beloved snack <br/> enjoyed by millions worldwide for their irresistible crunch, bold <br/> flavors, and satisfyingly savory taste. Whether enjoyed as a <br/> quick bite between meals, a party snack, or a movie-night <br/> treat, chips offer a delightful snacking experience that appeals <br/> to all ages.");

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
        label1.setBounds(190, 30, 450, 60);
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
        SwingUtilities.invokeLater(FoodItems_chips::new);
    }
}
