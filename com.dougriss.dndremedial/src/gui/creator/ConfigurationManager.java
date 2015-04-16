package src.gui.creator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougriss on 4/11/15.
 */
public class ConfigurationManager extends JFrame {
    private JPanel rootPanel;
    private JPanel buttonPanel;
    private JButton abilitiesButton;
    private JButton featsButton;
    private JButton classesButton;
    private JButton skillsButton;
    private JButton racesButton;
    private JButton currencyButton;
    private JButton exitButton;
    private JButton viewConfigButton;
    private JButton itemsButton;
    private JButton rulesButton;
    private JButton loadConfigurationButton;
    private JButton saveConfigurationButton;
    private JButton newConfigurationButton;

    public ConfigurationManager(){
        super("Configuration");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        requestFocus();

        abilitiesButton.addActionListener(actionEvent -> {
            new AbilityCreator();
            dispose();
        });

        featsButton.addActionListener(actionEvent -> {

        });

        classesButton.addActionListener(actionEvent -> {
            new ClassCreator();
            dispose();
        });

        skillsButton.addActionListener(actionEvent -> {
            new SkillCreator();
            dispose();
        });

        racesButton.addActionListener(actionEvent -> {
            new RaceCreator();
            dispose();
        });

        currencyButton.addActionListener(actionEvent -> {
            new CurrencyCreator();
            dispose();
        });

        exitButton.addActionListener(actionEvent -> {
            new CreatorLauncher();
            dispose();
        });

        viewConfigButton.addActionListener(actionEvent -> {

        });

        itemsButton.addActionListener(actionEvent -> {
            new ItemCreatorLauncher();
            dispose();
        });

        rulesButton.addActionListener(actionEvent -> {

        });

        loadConfigurationButton.addActionListener(e -> {

        });

        saveConfigurationButton.addActionListener(e -> {

        });

        newConfigurationButton.addActionListener(e -> {

        });
    }
}
