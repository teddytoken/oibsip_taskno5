package guessingGame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class GamePage extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField textShowNum;
	JLabel lblInfo;
	int compNo = 0; String str2 = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GamePage frame = new GamePage();
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
	public GamePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 511);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Component = new JLabel("I am thinking of a number between 1 to 100. Can you guess it?");
		Component.setForeground(new Color(255, 250, 240));
		Component.setFont(new Font("Tahoma", Font.BOLD, 20));
		Component.setBounds(22, 24, 640, 68);
		contentPane.add(Component);
		
		JLabel lblNewLabel_2 = new JLabel("Guess a number");
		lblNewLabel_2.setForeground(new Color(255, 165, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(77, 134, 225, 33);
		contentPane.add(lblNewLabel_2);
		
		txtNum = new JTextField();
		txtNum.setForeground(new Color(139, 0, 139));
		txtNum.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtNum.setBounds(385, 141, 200, 28);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JButton btnGuess = new JButton("Guess");
		btnGuess.setForeground(new Color(139, 0, 139));
		btnGuess.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int myNo= Integer.parseInt(txtNum.getText());
				//compNo= (int)(Math.random() * 10);
				if(myNo == compNo) {
					lblInfo.setText("You have guessed the right number");
				}
				else if(myNo <=0 || myNo > 100) {
					lblInfo.setText("Invalid guess!!! pls think of a number between 1 to 100");
				}
				else {
					lblInfo.setText("You haven't guessed the right number");
				}
			}
		});
		btnGuess.setBounds(77, 207, 119, 42);
		contentPane.add(btnGuess);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(139, 0, 139));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNum.setText("");
				lblInfo.setText("");
				textShowNum.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBounds(521, 207, 124, 42);
		contentPane.add(btnReset);
		
		JButton btnShow = new JButton("Show the number");
		btnShow.setForeground(new Color(139, 0, 139));
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				compNo= (int)(Math.random() * 100);
				str2= Integer.toString(compNo);
				textShowNum.setText(str2);
			}
		});
		btnShow.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnShow.setBounds(77, 353, 264, 33);
		contentPane.add(btnShow);
		
		lblInfo = new JLabel("");
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInfo.setBounds(131, 295, 454, 33);
		contentPane.add(lblInfo);
		
		textShowNum = new JTextField();
		textShowNum.setForeground(new Color(255, 215, 0));
		textShowNum.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textShowNum.setBounds(397, 355, 188, 28);
		contentPane.add(textShowNum);
		textShowNum.setColumns(10);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setForeground(new Color(139, 0, 139));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(292, 430, 119, 33);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 276, 645, 8);
		contentPane.add(separator);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNum.setText("");
			}
		});
		btnClear.setForeground(new Color(139, 0, 139));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(302, 207, 124, 42);
		contentPane.add(btnClear);
	}
}
