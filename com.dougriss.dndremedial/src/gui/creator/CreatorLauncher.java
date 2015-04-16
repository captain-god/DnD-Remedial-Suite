package src.gui.creator;

import src.gui.AppLauncher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougriss on 4/11/15.
 */
public class CreatorLauncher extends JFrame{
    private JButton characterCreatorButton;
    private JButton townCreatorButton;
    private JButton spellCreatorButton;
    private JButton configurationEditorButton;
    private JButton exitButton;
    private JPanel rootPanel;

    public CreatorLauncher(){
        super("Creator Launcher");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        requestFocus();

        characterCreatorButton.addActionListener(actionEvent -> {
            new CharacterCreator();
            dispose();
        });

        townCreatorButton.addActionListener(actionEvent -> {

        });

        spellCreatorButton.addActionListener(actionEvent -> {

        });

        configurationEditorButton.addActionListener(actionEvent -> {
            new ConfigurationManager();
            dispose();
        });

        exitButton.addActionListener(actionEvent -> {
            new AppLauncher();
            dispose();
        });
    }
}
