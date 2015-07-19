package view;

import javax.swing.JPanel;
import java.awt.Canvas;
import java.awt.BorderLayout;

public class ContentPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ContentPanel() {
		setLayout(new BorderLayout(0, 0));
		
		Canvas canvas = new Canvas();
		add(canvas);

	}

}
