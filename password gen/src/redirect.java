import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class redirect extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    JTextField textField1;
    JTextField textfield2;
    redirect(){
        String password = Main.getRngPassword();
        System.out.println("----------------------------------------------------------\n" + password + "\n----------------------------------------------------------");
        JOptionPane.showMessageDialog(null, "Your Password is successfully saved in your Clipboard");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Continue");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setEditable(false);
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.GREEN);
        textField.setFont(new Font("Calibri", Font.ITALIC, 20));
        textField.setText(password);

        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(250,40));
        textField1.setEditable(false);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.GREEN);
        textField1.setFont(new Font("Calibri", Font.ITALIC, 20));
        textField1.setText(Lib.slot1);

        textfield2 = new JTextField();
        textfield2.setPreferredSize(new Dimension(250,40));
        textfield2.setEditable(false);
        textfield2.setBackground(Color.BLACK);
        textfield2.setForeground(Color.GREEN);
        textfield2.setFont(new Font("Calibri", Font.ITALIC, 20));
        textfield2.setText(Lib.slot2);

        this.add(button);
        this.add(textField);
        if(Lib.number >= 1) this.add(textField1);
        if(Lib.number >= 2) this.add(textfield2);
        this.setLocation(400,400);
        this.setTitle("Recently saved passwords");
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            Lib.number = Lib.number + 1;
            Lib.slot1 = textField.getText();
            if(Lib.number>= 2) Lib.slot2 = textField1.getText();

            this.hide();
            new redirect();
        }
    }
}
