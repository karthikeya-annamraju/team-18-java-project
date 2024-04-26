import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class chocolate1 extends JFrame {
    public chocolate1() {
        setTitle("chocolate");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(500, 700);
        setLayout(null);

        ImageIcon choco1 = new ImageIcon("images/choco1.jpg");

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
                    int writeQuery = statement.executeUpdate("UPDATE chocolates SET stock = stock - 1 WHERE chocolate_name = 'Cadbury Dairy Milk Silk'");
                    
                    ResultSet resultSet = statement.executeQuery("SELECT stock from chocolates WHERE chocolate_name = 'Cadbury Dairy Milk Silk'");

                    // ResultSet to print the value of stock
                    while (resultSet.next()) {
                        // Example: Retrieve data from the ResultSet
                        int stockCount = resultSet.getInt("stock");
                        if (stockCount > 0)  {
                            System.out.println("Remaining Stock(Dairy Milk Silk): "+stockCount);
                            JOptionPane.showMessageDialog(chocolate1.this , "YOU SUCCESSFULLY BOUGHT THIS ITEM!!");
                            
                        }
                        else {
                            JOptionPane.showMessageDialog(chocolate1.this , "THIS ITEM IS OUT OF STOCK");
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
        JLabel label1 = createLabel1("Dairy Milk Silk");
        JLabel label2 = createLabel2(30,120);
        label2.setIcon(choco1);
        JLabel label3 = createLabel3("<html> Brand : Cadbury <br/> Item Form : Bar <br/> Chocolate Type : Milk <br/> Flavour : Chocolate <br/> Net Quantity	: 146.0 gram <br/> Diet Type : Vegetarian <br/> PRICE : 100/-");
        JLabel label4 = createLabel4("<html> Indulge in a rich, smooth, and creamy celebration. Cadbury <br/> Silk Ganache is a decadent chocolate experience with rich <br/> cocoa notes that you can indulge in. This milk chocolate <br/> bar is a perfect sweet to indulge in all alone or as a chocolate <br/> gift pack for gifting on special occasions like birthdays and <br/> get-togethers. Every bar of Cadbury dairy mik chocolate is made <br/> from 100% sustainably sourced cocoa. It is suitable for <br/> vegetarians.");

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
        label1.setBounds(125, 30, 450, 60);
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
        SwingUtilities.invokeLater(FoodItems_chocolates::new);
    }
}
