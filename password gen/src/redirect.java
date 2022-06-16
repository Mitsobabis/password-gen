import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class redirect extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    redirect(){
        String password = Main.getRngPassword();
        System.out.println("----------------------------------------------------------\n" + password + "\n----------------------------------------------------------");
        JOptionPane.showMessageDialog(null, "Your Password is successfully saved in your Clipboard");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));

        this.add(button);
        this.add(textField);
        this.setLocation(400,400);
        this.setTitle("Do you want to generate more random passwords?");
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
           String text = textField.getText();
            if(text.equals("Yes")){
                this.setVisible(false);
                new redirect();
            }
            else{
                System.out.println("[LOG] Shutting Down...");
                System.exit(0);
            }
        }
    }
}
