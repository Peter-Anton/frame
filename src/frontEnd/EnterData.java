package frontEnd;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class EnterData extends JFrame implements Node {
    private List<String> data;
    private JPanel panle2;
    private JTextField NameTextField;
    private JTextField IDTextField;
    private JButton addButton;
private     String name;
    private String id;
    private TableContent tableContent;
    public  EnterData(){
        setContentPane(panle2);

        setTitle("enter the data");

        setSize(450,300);

        setVisible(true);

        data=new ArrayList<>();

        tableContent=null;



        addButton.addActionListener(e -> {
            setVisible(false);
            if (tableContent==null){
                tableContent=new TableContent(new String[]{name,id});
                tableContent.setTitle("data of user");
            }
            name=NameTextField.getText();
             id= IDTextField.getText();
            String dataline=name+","+id;
            JOptionPane.showMessageDialog(null,dataline);
            data.add(dataline);
            tableContent.setVisible(true);
            String [] user=getUSerData();
            String [][] tabledata=new String[user.length][2];
            for (int i = 0; i <user.length ; i++) {
                tabledata[i]=user[i].split(",");
            }
            tableContent.setData(tabledata);
            tableContent.setParentNode(getParentNode());
        });

    }
    public void ActionButton(){


    }
    public String[] getUSerData(){
        return data.toArray(new String[0]);
    }

    @Override
    public void setParentNode(Node n) {

    }

    @Override
    public Node getParentNode() {
        return this;
    }
}
