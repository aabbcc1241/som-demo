package demo.som.view;

import demo.som.controller.SomCanvas;

import javax.swing.*;
import java.awt.*;

public class ContentPanel extends JPanel {

    /**
     * Create the panel.
     */
    public ContentPanel() {
        setLayout(new BorderLayout(0, 0));

        SomCanvas canvas=new SomCanvas();
        add(canvas, BorderLayout.CENTER);
    }
}
