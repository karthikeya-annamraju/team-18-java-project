// import java.awt.Color;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import javax.swing.*;
public class chocolate1 extends JFrame {
    public chocolate1(){
        setTitle("Chocolate");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(500,700);
        setLayout(null);


        public static void main(String[] args){
            SwingUtilities.invokeLater(MainFrame::new);
        }
    }
}
