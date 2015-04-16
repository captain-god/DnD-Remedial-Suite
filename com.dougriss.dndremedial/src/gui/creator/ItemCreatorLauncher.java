package src.gui.creator;

import src.data.item.Item;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougRiss on 4/16/2015.
 */
public class ItemCreatorLauncher extends JFrame{
    private JPanel rootPanel;
    private JButton itemButton;
    private JButton weaponButton;
    private JButton armorButton;
    private JButton backButton;

    public ItemCreatorLauncher(){
        super("Type");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        requestFocus();

        itemButton.addActionListener(e -> {
            new ItemCreator();
            dispose();
        });

        weaponButton.addActionListener(e -> {

        });

        armorButton.addActionListener(e -> {

        });

        backButton.addActionListener(e -> {
            new ConfigurationManager();
            dispose();
        });
    }
}
