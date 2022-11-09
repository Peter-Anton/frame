package frontEnd;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;

public class TableContent extends JFrame implements Node {
    private final String[] colomnsName;
    private JTable table1;
    private JPanel panel1;
    private Node parent;

    public TableContent(String[] colomnsName) {
        this.colomnsName = colomnsName;
        setContentPane(table1);
        setTitle("Data table");

        setSize(450,300);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                ((JFrame)getParentNode()).setVisible(true);

            }

        });


    }

    public void setData(String [][] data){
table1.setModel(new DefaultTableModel(data,colomnsName){
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
});

    }

    @Override
    public void setParentNode(Node n) {
        this.parent=n;
    }

    @Override
    public Node getParentNode() {
        return parent;
    }

}
