package guessingGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 301);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 20, 147));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Do you want to play a game ?");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		lblNewLabel.setBounds(27, 30, 459, 62);
		contentPane.add(lblNewLabel);
		
		JButton btnYes = new JButton("YES");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GamePage gp = new GamePage();
				gp.setTitle("Welcome");
				gp.setVisible(true);
				dispose();
			}
		});
		btnYes.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnYes.setBounds(92, 147, 87, 45);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("NO");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNo.setBounds(287, 147, 87, 45);
		contentPane.add(btnNo);
	}
}
