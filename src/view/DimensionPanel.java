package view;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.BorderLayout;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class DimensionPanel extends JPanel {
	private JTextField textField1;
	private JTextField textField2;

	private final int MIN, MAX;
	public AtomicInteger value1 = new AtomicInteger();
	public AtomicInteger value2 = new AtomicInteger();

	/**
	 * Create the panel.
	 */
	public DimensionPanel(String title, int min, int max,
			boolean restoreOnLostFocus) {
		MIN = min;
		MAX = max;
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setPreferredSize(new Dimension(300, 40));
		setSize(getPreferredSize());
		setLayout(new BorderLayout(0, 0));

		JLabel lblTitle = new JLabel(title);
		add(lblTitle, BorderLayout.NORTH);
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		textField1 = new JTextField();
		textField1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (restoreOnLostFocus)
					restore(value1, textField1);
				else
					check(value1, textField1);
			}
		});
		textField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(value1, textField1);
			}
		});
		panel.add(textField1);
		textField1.setColumns(10);

		JLabel lblX = new JLabel("X");
		panel.add(lblX);

		textField2 = new JTextField();
		textField2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (restoreOnLostFocus)
					restore(value2, textField2);
				else
					check(value2, textField2);
			}
		});
		textField2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check(value2, textField2);
			}
		});
		panel.add(textField2);
		textField2.setColumns(10);
	}

	void check(AtomicInteger value, JTextField textField) {
		if (textField.getText().length() > 0)
			try {
				int val = Integer.parseInt(textField.getText());
				if (val >= MIN && val <= MAX) {
					value.set(val);
				} else
					restore(value, textField);
			} catch (NumberFormatException e) {
				restore(value, textField);
			}
		else {
			value.set(MIN);
			restore(value, textField);
		}
	}

	void restore(AtomicInteger value, JTextField textField) {
		textField.setText(String.valueOf(value.get()));
	}
}
