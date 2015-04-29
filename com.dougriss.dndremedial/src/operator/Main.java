package src.operator;

import src.data.game.Settings;
import src.gui.AppLauncher;

/**
 * Created by dougriss on 4/9/15.
 * where the program runs from
 */
public class Main {
    public static void main(String[] args) {
        Settings.getInstance();
        new AppLauncher();
    }
}
