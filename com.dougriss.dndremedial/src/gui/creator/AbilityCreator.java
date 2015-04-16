package src.gui.creator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougRiss on 4/16/2015.
 */
public class AbilityCreator extends JFrame{
    private JPanel rootPanel;
    private JTextField nameTextField;
    private JTextArea descriptionTextArea;
    private JButton saveButton;
    private JButton backButton;

    public AbilityCreator(){
        super("Ability Creator");
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
