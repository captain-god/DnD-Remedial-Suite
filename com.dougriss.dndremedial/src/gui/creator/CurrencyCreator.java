package src.gui.creator;

import src.data.item.Currency;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dougRiss on 4/16/2015.
 */
public class CurrencyCreator extends JFrame{
    private JPanel rootPanel;
    private JTextField nameTextField;
    private JSpinner valueSpinner;
    private JButton saveButton;
    private JButton backButton;

    public CurrencyCreator(){
        super("Currency Creator");
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
