package frontEnd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyGui extends JFrame {
    private JPanel Mypanel;
    private JButton librarianRoleButton;
    private JButton adminRoleButton;
    private EnterData enterData;
public MyGui()
{
setContentPane(Mypanel);
    setTitle("My Gui");
    setSize(450,300);
    setVisible(true);


    adminRoleButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            JOptionPane.showMessageDialog(null,"you are admin role");
            enterData=new EnterData();
            enterData.setTitle("Admin role");


        }
    });
    librarianRoleButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}

    private void createUIComponents() {
        // TODO: place custom component creation code here

}

    public static void main(String[] args) {
        MyGui myGui=new MyGui();
//        EnterData tableContnet=new EnterData();
    }
}
