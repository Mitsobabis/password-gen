import javax.swing.*;

public class redirect {
    redirect(){
        String password = Main.getRngPassword();
        System.out.println("----------------------------------------------------------\n" + password + "\n----------------------------------------------------------");
        JOptionPane.showInternalMessageDialog(null, password);
        String question = JOptionPane.showInputDialog("Do you want to generate more passwords?\nType 'Yes' to generate a new one, or anything else to exit!");
        if(question == null){
            System.exit(0);
        }else if(question.equals("Yes")){
            new redirect();
        }else{
            System.exit(0);
        }
    }
}
