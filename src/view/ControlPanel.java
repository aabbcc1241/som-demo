package view;

import javax.swing.JPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Dimension;
import java.awt.print.Paper;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

public class ControlPanel extends JPanel {
	public static final int standard_padding = 25;
	public static final int MIN = 1;
	public static final int MAX = 1000;

	/**
	 * Create the panel.
	 */
	public ControlPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		add(rigidArea_1);

		DimensionPanel panel_image_dimension = new DimensionPanel(
				"Image Dimensions", MIN, MAX, false);
		add(panel_image_dimension);

		DimensionPanel panel_image_cell = new DimensionPanel("Image Cells",
				MIN, MAX, false);
		add(panel_image_cell);

		SliderPanel panel_1 = new SliderPanel("Initial Learning Rate");
		add(panel_1);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		add(rigidArea_3);

		JPanel panel = new JPanel();
		add(panel);
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JButton btnStart = new JButton("Start");
		panel.add(btnStart);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		panel.add(rigidArea);

		JButton btnStop = new JButton("Stop");
		panel.add(btnStop);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		add(rigidArea_2);

	}
}
