package src.gui.creator;

import src.data.player.Skill;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougRiss on 4/16/2015.
 */
public class SkillCreator extends JFrame{
    private JTextField nameTextField;
    private JTextField descriptionTextField;
    private JButton backButton;
    private JButton saveButton;
    private JComboBox governingAbilityComboBox;
    private JPanel rootPanel;

    public SkillCreator(){
        super("Skill Creator");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        requestFocus();

        backButton.addActionListener(e -> {
            new ConfigurationManager();
            dispose();
        });

        saveButton.addActionListener(e -> {

        });
    }
}
