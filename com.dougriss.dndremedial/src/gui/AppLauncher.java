package src.gui;

import src.gui.creator.CreatorLauncher;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougriss on 4/10/15.
 * Class to utilize intellij's gui thing.
 */
public class AppLauncher extends JFrame {
    private JPanel rootPanel;
    private JButton creatorButton;
    private JButton referenceButton;
    private JButton toolkitButton;
    private JButton exitButton;

    public AppLauncher() {
        super("D&D Remedial Suite");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        requestFocus();

        creatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new CreatorLauncher();
                dispose();
            }
        });

        referenceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //do reference things
            }
        });

        toolkitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //do toolkit things
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }
}
