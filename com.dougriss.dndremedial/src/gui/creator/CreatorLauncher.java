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
    private JButton itemCreatorButton;
    private JButton ruleCreatorButton;
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

        characterCreatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new CharacterCreator();
                dispose();
            }
        });

        townCreatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        itemCreatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        ruleCreatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        configurationEditorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ConfigurationManager();
                dispose();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new AppLauncher();
                dispose();
            }
        });
    }
}
