package demo.som.view;

import myutils.gui.DimensionPanel;
import myutils.gui.NumberJTextField;
import myutils.gui.SliderPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ControlPanel extends JPanel {
	public static final int standard_padding = 25;
	public static final int MIN = 1;
	public static final int MAX = 1000;
	private NumberJTextField textField;

	/**
	 * Create the panel.
	 */
	public ControlPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		add(rigidArea_1);

		DimensionPanel panel_image_size = new DimensionPanel(
				"Image Size", MIN, MAX, false);
		add(panel_image_size);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Scale");
		panel_2.add(lblNewLabel, BorderLayout.NORTH);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.add(panel_3, BorderLayout.SOUTH);
		
		textField = new NumberJTextField(1,1000,false);
		panel_3.add(textField);
		textField.setColumns(10);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		add(rigidArea_4);

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
