package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame("Title");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame(String title) {
		initialize(title);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String title) {
		frame = new JFrame(title);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainPanel contentPane=new MainPanel();
		frame.setContentPane(contentPane);
	}

}
