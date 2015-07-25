package demo.som.view;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    public ControlPanel controlPanel = new ControlPanel();
    public ProgressPanel progressPanel = new ProgressPanel();
    public ContentPanel contentPanel = new ContentPanel();

    /**
     * Create the panel.
     */
    public MainPanel() {
        setLayout(new BorderLayout(0, 0));

        JPanel sidePanel = new JPanel();
        add(sidePanel, BorderLayout.EAST);
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));

        sidePanel.add(controlPanel);

        sidePanel.add(progressPanel);

        add(contentPanel, BorderLayout.CENTER);

    }
}
