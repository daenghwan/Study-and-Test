//package ¸Þ¸ðÀå;
//
//import java.awt.BorderLayout;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import java.awt.Font;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;
//import java.awt.Color;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class Num01_IDPWÃ¢ extends JFrame {
//
//	private JPanel contentPane;
//	private JTextField txtID;
//	private JTextField txtPW;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Num01_IDPWÃ¢ frame = new Num01_IDPWÃ¢();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the frame.
//	 */
//	public Num01_IDPWÃ¢() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 530, 530);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		JLabel lblID = new JLabel("ID");
//		lblID.setFont(new Font("±¼¸²", Font.BOLD, 20));
//		lblID.setBounds(34, 47, 80, 24);
//		contentPane.add(lblID);
//		
//		JLabel lblPW = new JLabel("PW");
//		lblPW.setFont(new Font("±¼¸²", Font.BOLD, 20));
//		lblPW.setBounds(34, 81, 80, 24);
//		contentPane.add(lblPW);
//		
//		txtID = new JTextField();
//		txtID.setBackground(Color.PINK);
//		txtID.setForeground(Color.GRAY);
//		txtID.setFont(new Font("±¼¸²", Font.BOLD, 20));
//		txtID.setBounds(110, 51, 140, 21);
//		contentPane.add(txtID);
//		txtID.setColumns(10);
//		
//		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
//		btnLogin.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//					dispose( ) ;
//					setVisible(false) ;
//					new Num02_Foodmenu ( ).setVisible(true) ;
//			}
//		});
//		btnLogin.setBackground(Color.GREEN);
//		btnLogin.setFont(new Font("±¼¸²", Font.BOLD, 20));
//		btnLogin.setBounds(154, 335, 188, 85);
//		contentPane.add(btnLogin);
//		
//		txtPW = new JTextField();
//		txtPW.setForeground(Color.GRAY);
//		txtPW.setFont(new Font("±¼¸²", Font.BOLD, 20));
//		txtPW.setColumns(10);
//		txtPW.setBackground(Color.MAGENTA);
//		txtPW.setBounds(110, 81, 140, 21);
//		contentPane.add(txtPW);
//	}
//}
