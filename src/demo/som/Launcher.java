package demo.som;


import demo.som.view.MainFrame;

/**
 * Created by beenotung on 7/19/15.
 */
public class Launcher {
    public static void main(String[] args) {
        AppCfg.setIsDebug(true);
        MainFrame.start("SOM Demo");
    }
}
