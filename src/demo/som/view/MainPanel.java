package demo.som.view;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel sidePanel = new JPanel();
		add(sidePanel, BorderLayout.EAST);
		sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
		
		ControlPanel controlPanel = new ControlPanel();
		sidePanel.add(controlPanel);
		
		ProgressPanel progressPanel = new ProgressPanel();
		sidePanel.add(progressPanel);
		
		JPanel contentPanel = new JPanel();
		add(contentPanel, BorderLayout.CENTER);

	}
}
