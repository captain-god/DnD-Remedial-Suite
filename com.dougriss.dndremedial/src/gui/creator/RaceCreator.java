package src.gui.creator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougRiss on 4/16/2015.
 */
public class RaceCreator extends JFrame{
    private JPanel rootPanel;
    private JTextField nameTextField;
    private JTextArea describeYourRaceTextArea;
    private JComboBox favoredClassComboBox;
    private JPanel abilityModPanel;
    private JPanel lifePanel;
    private JSpinner middleAgeSpinner;
    private JSpinner oldAgeSpinner;
    private JSpinner venerableSpinner;
    private JTextField maximumAgeTextField;
    private JButton saveButton;
    private JButton backButton;

    public RaceCreator(){
        super("Race Creator");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        requestFocus();

        backButton.addActionListener(e -> {
            new CreatorLauncher();
            dispose();
        });

        saveButton.addActionListener(e -> {

        });
    }
}
