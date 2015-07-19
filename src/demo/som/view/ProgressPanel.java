package demo.som.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;

public class ProgressPanel extends JPanel {
	JLabel lblStatusReport;
	JLabel lblIterationReport;
	public static final String STATUS_STOP = "Stop";
	public static final String STATUS_RUNNING = "Running";

	/**
	 * Create the panel.
	 */
	public ProgressPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel panel = new JPanel();
		add(panel);

		JLabel lblStatus = new JLabel("Current Status: ");
		panel.add(lblStatus);

		lblStatusReport = new JLabel("Stopped");
		panel.add(lblStatusReport);

		JPanel panel_1 = new JPanel();
		add(panel_1);

		JLabel lblIteration = new JLabel("Iteration: ");
		panel_1.add(lblIteration);

		lblIterationReport = new JLabel("0");
		panel_1.add(lblIterationReport);
	}

	public void changeStatus(String status) {
		if (status.equals(STATUS_RUNNING))
			lblStatusReport.setText(STATUS_RUNNING);
		else
			lblStatusReport.setText(STATUS_STOP);
	}

	public void updateIteration(int iteration) {
		lblIterationReport.setText(String.valueOf(iteration));
	}
}
