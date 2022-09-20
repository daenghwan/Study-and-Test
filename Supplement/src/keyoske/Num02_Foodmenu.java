package keyoske;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Num02_Foodmenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Num02_Foodmenu frame = new Num02_Foodmenu();
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
	public Num02_Foodmenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHambuger = new JButton("\uD584\uBC84\uAC70");
		btnHambuger.setBackground(Color.PINK);
		btnHambuger.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnHambuger.setBounds(113, 36, 302, 116);
		contentPane.add(btnHambuger);
		
		JButton btnSandwich = new JButton("\uC0CC\uB4DC\uC704\uCE58");
		btnSandwich.setBackground(Color.GREEN);
		btnSandwich.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnSandwich.setBounds(113, 224, 302, 116);
		contentPane.add(btnSandwich);
	}
}
