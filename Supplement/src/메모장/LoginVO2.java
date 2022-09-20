package 메모장;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginVO2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginVO2 frame = new LoginVO2();
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
	public LoginVO2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					dispose( ) ;
					setVisible(false) ;
					new Num02_Foodmenu ( ).setVisible(true) ;
			}
		});
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778\uD558\uC790");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String txtid = txtID.getText( ) ;
				String txtpw = txtPW.getText( ) ;
			    LoginVO lvo1 = new LoginVO(txtid, txtpw) ;
			    //dispose ( ) ; // 지금 창 해제 //프레임을 닫는 것
				setVisible(false) ; //지금창 안보이게
				new TwoWindow (lvo1).setVisible (true) ;
			    
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton.setBounds(85, 33, 254, 66);
		contentPane.add(btnNewButton);
		
		txtID = new JTextField();
		txtID.setFont(new Font("굴림", Font.BOLD, 12));
		txtID.setBackground(Color.PINK);
		txtID.setText("qwer");
		txtID.setBounds(85, 128, 254, 31);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblID = new JLabel("\uC544\uC774\uB514");
		lblID.setFont(new Font("굴림", Font.BOLD, 15));
		lblID.setBounds(12, 131, 57, 28);
		contentPane.add(lblID);
		
		txtPW = new JTextField();
		txtPW.setFont(new Font("굴림", Font.BOLD, 12));
		txtPW.setForeground(new Color(0, 0, 0));
		txtPW.setBackground(Color.PINK);
		txtPW.setText("qwer");
		txtPW.setHorizontalAlignment(SwingConstants.LEFT);
		txtPW.setBounds(85, 182, 254, 31);
		contentPane.add(txtPW);
		txtPW.setColumns(10);
		
		JLabel lblPW = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		lblPW.setFont(new Font("굴림", Font.BOLD, 15));
		lblPW.setBounds(12, 185, 57, 28);
		contentPane.add(lblPW);
	}
}
