package Oct1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Checkboxes {

	private JFrame frame;
	private JCheckBox chckbxNewCheckBox;
	JCheckBox chckbxDeveloper;
	JCheckBox chckbxHr;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkboxes window = new Checkboxes();
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
	public Checkboxes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(new Dimension(800,6000));
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(10, 200, 100));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("QA");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setSelected(false);
			}
		});
		chckbxNewCheckBox.setBackground(Color.cyan);
		chckbxNewCheckBox.setBounds(99, 137, 129, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxDeveloper = new JCheckBox("Developer");
		chckbxDeveloper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxDeveloper.setSelected(false);
			}
		});
		chckbxDeveloper.setBackground(Color.cyan);
		chckbxDeveloper.setBounds(99, 109, 129, 23);
		frame.getContentPane().add(chckbxDeveloper);
		
		JLabel lblWhatIsYour = new JLabel("What is your dream job?");
		lblWhatIsYour.setBounds(63, 40, 191, 15);
		frame.getContentPane().add(lblWhatIsYour);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(109, 197, 117, 25);
		frame.getContentPane().add(btnSubmit);
		
		JCheckBox chckbxHr = new JCheckBox("HR");
		chckbxHr.setBackground(Color.cyan);
		chckbxHr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxDeveloper.setSelected(false);
				chckbxNewCheckBox.setSelected(false);
			}
		});
		chckbxHr.setBounds(99, 82, 129, 23);
		frame.getContentPane().add(chckbxHr);
	}

	public Color getFrameContentPaneBackground() {
		return frame.getContentPane().getBackground();
	}
	public void setFrameContentPaneBackground(Color background) {
		frame.getContentPane().setBackground(background);
	}
}
