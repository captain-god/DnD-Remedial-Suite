package src.gui.creator;

import src.data.game.Settings;
import src.data.player.Ability;

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
            if (verifyContents()) {
                Settings.getInstance().addAbility(new Ability(nameTextField.getText(), descriptionTextArea.getText()));
                new ConfigurationManager();
                dispose();
            }
            else{
                JOptionPane.showConfirmDialog(null, "Please enter all information");
            }
        });

        backButton.addActionListener(e -> {
            new ConfigurationManager();
            dispose();
        });
    }

    private boolean verifyContents(){
        if(nameTextField.getText() == ""){
            return false;
        }
        else if (descriptionTextArea.getText()== ""){
            return false;
        }
        return true;
    }
}
