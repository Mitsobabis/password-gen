import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class redirect extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    redirect(){
        String password = Main.getRngPassword();
        System.out.println("----------------------------------------------------------\n" + password + "\n----------------------------------------------------------");
        JOptionPane.showMessageDialog(null, "Your Password is successfully saved in your Clipboard");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(Lib.number == 0) this.setLayout(new GridLayout(2, 1));
        else if(Lib.number == 1) this.setLayout(new GridLayout(3,1));
        else if(Lib.number == 2) this.setLayout(new GridLayout(4,1));
        else if(Lib.number == 3) this.setLayout(new GridLayout(5,1));
        else if(Lib.number == 4) this.setLayout(new GridLayout(6,1));
        else if(Lib.number >= 5) this.setLayout(new GridLayout(7,1));

        button = new JButton("Continue");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setEditable(false);
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.GREEN);
        textField.setSelectedTextColor(Color.YELLOW);
        textField.setSelectionColor(Color.cyan);
        textField.setFont(new Font("Calibri", Font.ITALIC, 20));
        textField.setText(password);

        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(250,40));
        textField1.setEditable(false);
        textField1.setBackground(Color.BLACK);
        textField1.setForeground(Color.GREEN);
        textField1.setSelectedTextColor(Color.YELLOW);
        textField1.setSelectionColor(Color.cyan);
        textField1.setFont(new Font("Calibri", Font.ITALIC, 20));
        textField1.setText(Lib.slot1);

        textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension(250,40));
        textField2.setEditable(false);
        textField2.setBackground(Color.BLACK);
        textField2.setForeground(Color.GREEN);
        textField2.setSelectedTextColor(Color.YELLOW);
        textField2.setSelectionColor(Color.cyan);
        textField2.setFont(new Font("Calibri", Font.ITALIC, 20));
        textField2.setText(Lib.slot2);

        textField3 = new JTextField();
        textField3.setPreferredSize(new Dimension(250,40));
        textField3.setEditable(false);
        textField3.setBackground(Color.BLACK);
        textField3.setForeground(Color.GREEN);
        textField3.setSelectedTextColor(Color.YELLOW);
        textField3.setSelectionColor(Color.cyan);
        textField3.setFont(new Font("Calibri", Font.ITALIC, 20));
        textField3.setText(Lib.slot3);

        textField4 = new JTextField();
        textField4.setPreferredSize(new Dimension(250,40));
        textField4.setEditable(false);
        textField4.setBackground(Color.BLACK);
        textField4.setForeground(Color.GREEN);
        textField4.setSelectedTextColor(Color.YELLOW);
        textField4.setSelectionColor(Color.cyan);
        textField4.setFont(new Font("Calibri", Font.ITALIC, 20));
        textField4.setText(Lib.slot4);

        textField5 = new JTextField();
        textField5.setPreferredSize(new Dimension(250,40));
        textField5.setEditable(false);
        textField5.setBackground(Color.BLACK);
        textField5.setForeground(Color.GREEN);
        textField5.setSelectedTextColor(Color.YELLOW);
        textField5.setSelectionColor(Color.cyan);
        textField5.setFont(new Font("Calibri", Font.ITALIC, 20));
        textField5.setText(Lib.slot5);

        this.add(textField);
        if(Lib.number >= 1) this.add(textField1);
        if(Lib.number >= 2) this.add(textField2);
        if(Lib.number >= 3) this.add(textField3);
        if(Lib.number >= 4) this.add(textField4);
        if(Lib.number >= 5) this.add(textField5);
        this.add(button);
        this.setLocation(400,350);
        this.setTitle("Recently saved passwords");
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            Lib.number = Lib.number + 1;
            Lib.slot1 = textField.getText();
            Lib.slot2 = textField1.getText();
            Lib.slot3 = textField2.getText();
            Lib.slot4 = textField3.getText();
            Lib.slot5 = textField4.getText();

            this.dispose();
            new redirect();
        }
    }
}
