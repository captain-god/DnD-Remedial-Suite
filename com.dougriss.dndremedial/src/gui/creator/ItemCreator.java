package src.gui.creator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougRiss on 4/16/2015.
 */
public class ItemCreator extends JFrame {
    private JButton saveButton;
    private JButton backButton;
    private JTextField nameTextField;
    private JTextArea descriptionTextArea;
    private JSpinner weightSpinner;
    private JSpinner costSpinner;
    private JPanel rootPanel;

    public ItemCreator(){
        super("Item Creator");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        requestFocus();

        saveButton.addActionListener(e -> {

        });

        backButton.addActionListener(e -> {
            new ConfigurationManager();
            dispose();
        });
    }
}
