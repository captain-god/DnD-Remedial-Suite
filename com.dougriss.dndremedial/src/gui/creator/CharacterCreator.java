package src.gui.creator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougriss on 4/11/15.
 */
public class CharacterCreator extends JFrame{

    private JPanel rootPanel;
    private JTextField nameTextField;
    private JComboBox classComboBox;
    private JComboBox multiClassComboBox;
    private JComboBox comboBox1;
    private JSpinner multiClassLevels;
    private JSpinner classLevels;
    private JComboBox alignmentComboBox;
    private JButton saveButton;
    private JButton backButton;

    public CharacterCreator(){
        super("Character Creator");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        requestFocus();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new CreatorLauncher();
                dispose();
            }
        });
    }
}
