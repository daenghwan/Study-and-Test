package keyoske;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class TwoWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtID; //////////
	private JTextField txtPW; /////////

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoWindow frame = new TwoWindow(null);
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
	public TwoWindow(LoginVO lvo1) { // 인자를 넣어주고
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB2E4\uB978\uCC3D\uC774\uB77C\uB294");
		btnNewButton.setBounds(109, 21, 203, 78);
		contentPane.add(btnNewButton);
		
		txtID = new JTextField();
		txtID.setBackground(Color.PINK);
		txtID.setBounds(109, 138, 203, 21);
		contentPane.add(txtID);
		txtID.setColumns(10);
		txtID.setText(lvo1.getId( )) ; /////객체로 받아 id를 글상자에
		
		txtPW = new JTextField();
		txtPW.setBackground(Color.PINK);
		txtPW.setBounds(109, 187, 203, 21);
		contentPane.add(txtPW);
		txtPW.setColumns(10);
		txtPW.setText(lvo1.getPw( )) ; ///// 객체로 받아 pw를 글상자에
	}

}
