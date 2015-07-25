package demo.som.view;

import demo.som.controller.SomCanvas;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {
    public  SomCanvas somCanvas =new SomCanvas();

    /**
     * Create the panel.
     */
    public ContentPanel() {
        setLayout(new BorderLayout(0, 0));

        add(somCanvas, BorderLayout.CENTER);
    }
}
