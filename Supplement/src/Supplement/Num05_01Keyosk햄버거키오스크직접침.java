package Supplement;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class JButtonClass extends JFrame
						implements ActionListener , ListSelectionListener {
			JLabel jl1 = new JLabel("**굿버거 햄버거 입니다**");
			JLabel jl2 = new JLabel("드실 메뉴를 선택하세요");
			// combobox	, listbox
			String[] wichi={"종로", "종로외"};
			JList jlist1=new JList(wichi);
			JButton jb1 = new JButton("볼케이노 비프 버거  : 5000");
			JButton jb2 = new JButton("더블 치즈 베이컨 버거  : 7000");
			JButton jb3 = new JButton("프레쉬 새우 버거    : 4500");
			JButton jb4 = new JButton("더블 볼케이노 비프 버거 :  5500");
			JButton jb5 = new JButton("주문합니다");
			JButton jb6 = new JButton("취소합니다");
			
			
			
			String joomoon1 = " " ;
			int hap = 0 ;
			int cnt = 0;
			
			public JButtonClass () {// 생성자 - start
				setLayout(new GridLayout(0 , 2 , 50 , 50)) ;
																	// 행 열
				jl1.setFont(new Font ("굴림" , Font.BOLD,25));
				jl2.setFont(new Font ("굴림" , Font.BOLD,25));
				jb1.setFont(new Font ("굴림" , Font.BOLD,15));
				jb2.setFont(new Font ("굴림" , Font.BOLD,15));
				jb3.setFont(new Font ("굴림" , Font.BOLD,15));
				jb4.setFont(new Font ("굴림" , Font.BOLD,15));
				jb5.setFont(new Font ("굴림" , Font.BOLD,15));
				jb6.setFont(new Font ("굴림" , Font.BOLD,15));
				
				jb5.setBackground(Color.orange);
				jb6.setBackground(Color.yellow); 
				
				jb1.addActionListener(this) ;
				jb2.addActionListener(this) ;
				jb3.addActionListener(this) ;
				jb4.addActionListener(this) ;
				jb5.addActionListener(this) ;
				jb6.addActionListener(this) ;
				jlist1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION) ;
				
				jlist1.addListSelectionListener(this) ;
				add(jl1) ;
				add(jl2) ;
				add(jb1) ;
				add(jb2) ;
				add(jb3) ;
				add(jb4) ;
				add(jb5) ;
				add(jb6) ;
				add(jlist1) ;
					
				setTitle("어서오세요 굿버거 입니다.");
				setSize(700, 700) ;
				setVisible(true);
				
			}//생성자 - end

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 누르는 버튼이
		// 버튼 6개 + listbox = 총 7개
		
		if (e.getSource() == jb1) {  // 볼케이노 비프 버거  : 5000
			joomoon1 += jb1.getText() + "\n" ;
			hap = hap + 5000;
			cnt++ ;
		}
		if (e.getSource() == jb2) {
			joomoon1 += jb2.getText() + "\n" ;
			hap = hap + 7000;
			cnt++ ;
		}
		if (e.getSource() == jb3) {
			joomoon1 += jb3.getText() + "\n" ;
			hap = hap + 4500;
			cnt++ ;
		}
		if (e.getSource() == jb4) {
			joomoon1 += jb4.getText() + "\n" ;
			hap = hap + 5500;
			cnt++ ;
		}
//--------------------- ↑↑↑↑↑↑ 햄버거 주문버튼	 --------------------//
		
//--------------------- ↓↓↓↓↓↓ 주문 확인 버튼	 --------------------//
		
		if (e.getSource() == jb5 ) {
		String msg1 = joomoon1 + "총금액 :" + String.valueOf(hap) + "원" + "\n" 
									+ "총 주문수량 :" + String.valueOf(cnt) + "개" ;
		JOptionPane.showConfirmDialog
											(jb5 , msg1 , "확인하세요" , JOptionPane.YES_NO_OPTION) ;
											// 클릭한 버튼 근처에 메세지박스가 뜸
		
											joomoon1 = " " ;  // 초기화
											hap = 0 ;
											cnt = 0 ;
		}
//--------------------- ↓↓↓↓↓↓ 주문 초기화 버튼	 --------------------//
		
		if (e.getSource() == jb6) {// 취소버튼
				joomoon1 = " " ; // 바로 초기화
				hap = 0 ;
				cnt = 0 ;
			JOptionPane.showMessageDialog(jb6 , "취소되었습니다.") ;
																				// 취소버튼 근처
		}
	

	}
	
//------------------------------------------------------------------------------
	
	@Override
		public void valueChanged(ListSelectionEvent e) {
		
		if (e.getSource() == jlist1) {
			int index1 = jlist1.getSelectedIndex()	;	
			String indexElement1
			= (String) jlist1.getModel().getElementAt(index1);
			JOptionPane.showMessageDialog(null , indexElement1 + "선택하셨군요") ;
																	// 출력시 화면 정가운데 출력
			
			hap = hap - 1000 ;
			}
		
		
	}
	
}

public class Num05_01Keyosk햄버거키오스크직접침 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new JButtonClass();
	}

}
