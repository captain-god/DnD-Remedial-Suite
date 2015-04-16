package src.gui.creator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougRiss on 4/16/2015.
 */
public class ClassCreator extends JFrame{
    private JPanel rootPanel;
    private JTextField nameTextField;
    private JTextArea descriptionTextArea;
    private JComboBox hitDieComboBox;
    private JComboBox bonusFeatsComboBox;
    private JList list1;
    private JComboBox bonusSkillsComboBox;
    private JList list2;
    private JComboBox armorProficienciesComboBox;
    private JComboBox weaponProficienciesComboBox;
    private JList list3;
    private JCheckBox restrictAlignmentCheckBox;
    private JComboBox alignmentComboBox;
    private JButton saveButton;
    private JButton backButton;

    public ClassCreator(){
        super("Class Creator");
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
