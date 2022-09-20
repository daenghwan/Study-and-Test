package KioskGUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.image.*;


public class MemberOder_Takeout extends JFrame {
    
	int count = 0;
	int total = 11000;
    String show = "";
    
    
    
    public MemberOder_Takeout() {
        // 디자인단
        // 프레임 설정단
        JFrame frame = new JFrame("회원 포장");
        frame.setBounds(0, 0, 1050, 1000);
        frame.setBackground(Color.black);
 
        // 폰트
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
        Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);
 
        // 북쪽
        Panel pNorth = new Panel();
        pNorth.setBackground(Color.black);
        pNorth.setLayout(null);
        pNorth.setSize(0, 580);
        pNorth.setFont(new Font("맑은 고딕", Font.BOLD, 18));
 
        // 배열 설정 부분
        String menu[] = { "추가","목이버섯", "팽이버섯", "라면사리", "중국당면", 
        		"돼지고기", "소고기", "양고기", "소시지", 
        		"청경채", "연근", "모듬채소", "감자", "음료수"};
        int price[] = { 15000, 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8500,5000, 5500, 6000, 6500, 1200 };
        
        JButton bt[] = new JButton[menu.length];      
        TextField suja[] = new TextField[menu.length];
        Button minus[] = new Button[menu.length];
        Button plus[] = new Button[menu.length];
        JButton ok[] = new JButton[menu.length];
        
        Label l[] = new Label[menu.length]; // 가격 라벨
        
        Label name[] = new Label[menu.length]; // 메뉴 라벨
        
        ImageIcon icon[] = new ImageIcon[menu.length];
        Image Img[] = new Image[menu.length];
        Image changedIcon[] = new Image[menu.length];
        ImageIcon picture[] = new ImageIcon[menu.length];
        

 
        // 버튼 설정 부분
        for (int i = 0; i < menu.length; i++) {
 
            // 메뉴 버튼

            bt[i] = new JButton(menu[i]);
            if (i < 7) {
                bt[i].setBounds(25 + i * 150, 50, 100, 100);
            } else {
                bt[i].setBounds(25 + (i -7) * 150, 350, 100, 100);
            }    
           
               
            icon[0] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\MaraTang.jpg");
            icon[1] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Mokyi.jpg");
            icon[2] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Paengyi.jpg");
            icon[3] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Lamyeon.jpg");
            icon[4] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Dangmyeon.jpg");
            icon[5] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Pig.jpg");
            icon[6] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Cow.jpg");
            icon[7] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Sheep.jpg");
            icon[8] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Soxiji.jpg");
            icon[9] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Chenggyeng.jpg");
            icon[10] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Yengun.jpg");
            icon[11] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Allvagetable.jpg");
            icon[12] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Gamja.jpg");
            icon[13] = new ImageIcon("D:\\김동환\\NoljiMaRa\\image\\Drink.jpg");
            
            Img[i] = icon[i].getImage();
            changedIcon[i] = Img[i].getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            picture[i]= new ImageIcon(changedIcon[i]);
            bt[i].setIcon( picture[i]);

 
            // 숫자 txt 버튼
            suja[i] = new TextField("0");
            suja[i].setBackground(Color.white);
            suja[i].setEditable(false);
            suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 150, 40, 20);
 
            // "-" 버튼
            minus[i] = new Button("-");
            minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
            minus[i].setEnabled(false);
 
            // "+" 버튼
            plus[i] = new Button("+");
            plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
            plus[i].setEnabled(false);
            
            // 메뉴이름
            name[i] = new Label(menu[i]);
            name[i].setFont(font1);
            name[i].setBounds(bt[i].getX() + 15, bt[i].getY() + 105, 100, 20);
            name[i].setForeground(Color.white);
                        
            // 가격
            l[i] = new Label(price[i] + "원");
            l[i].setBounds(bt[i].getX() + 20, suja[i].getY() - 25, 100, 20);
            l[i].setForeground(Color.white);
 
            // 확인 버튼
            ok[i] = new JButton("확인");
            ok[i].setBounds(bt[i].getX(), suja[i].getY() + 30, 100, 20);
            ok[i].setEnabled(false);
            
 
            pNorth.add(bt[i]);
            pNorth.add(suja[i]);
            pNorth.add(minus[i]);
            pNorth.add(plus[i]);
            pNorth.add(l[i]);
            pNorth.add(ok[i]);
            pNorth.add(name[i]); // 추가
        }
        // 중앙
        TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
        ta.setText("   상품명        단가        수량        합계\n   기본요금\t    11000\t\t  1\n");
        ta.setBackground(Color.white);
        ta.setEditable(false);
        ta.setFont(font1);
 
        // 남쪽
        Panel pSouth = new Panel();
        pSouth.setFont(font);
        pSouth.setBackground(new Color(255, 255, 215));
 
        Button bt1 = new Button("주문");
        Button bt2 = new Button("초기화");
        Button bt3 = new Button("닫기");
        pSouth.add(bt1);
        pSouth.add(bt2);
        pSouth.add(bt3);  
        
        // 주문버튼
        bt1.addActionListener(new ActionListener() {
 
        	@Override
            public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, ta.getText() + "총 금액 :" + total + "원\n" + " 주문되었습니다. \n 이용해주셔서 감사합니다. \n 조리되기까지 40분 소요됩니다.");
                for (int i = 0; i < menu.length; i++) {
                    bt[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    suja[i].setText("0");
                    ta.setText("   상품명        단가        수량       합계\n\n");
                    
 
                }
            }
        });

        

    // 초기화 버튼
    bt2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < menu.length; i++) {
                bt[i].setEnabled(true);
                minus[i].setEnabled(false);
                plus[i].setEnabled(false);
                suja[i].setText("0");
            }
        }
    });
    //bt3 닫기버튼
    bt3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    // 컴포넌트
    frame.getContentPane().add(pNorth, BorderLayout.NORTH);
    frame.getContentPane().add(ta, BorderLayout.CENTER);
    frame.getContentPane().add(pSouth, BorderLayout.SOUTH);
    frame.setVisible(true);
    
 // 이벤트단
    for (int i = 0; i < menu.length; i++) {
        int j = i;

        // 메뉴 버튼 이벤트 + - ok 버튼 활성화
        bt[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minus[j].setEnabled(true);
                plus[j].setEnabled(true);
                bt[j].setEnabled(false);
                ok[j].setEnabled(true);

                
                count = 0;
            }
        });

        // "-" 버튼 이벤트
        minus[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count > 0) {
                    count = count - 1;
                    suja[j].setText(count + "");
                    ok[j].setEnabled(true);
                } else {
                    minus[j].setEnabled(false);
                }
            }
        });
        
        // "+" 버튼 이벤트
        plus[i].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                count = count + 1;
                suja[j].setText(count + "");
                ok[j].setEnabled(true);
                if (count > 0) {
                    minus[j].setEnabled(true);
                }
            }
        });
        //확인 버튼 이벤트
        ok[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                show = bt[j].getActionCommand();
                ta.append("   " + show + "       " + price[j] + "        " + count + "         " + price[j] * count
                        + "원" + "\n");
                ok[j].setEnabled(false);
                total = total + price[j] * count;
            }
        });
    }
    // 끄기
    frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}
// 메인
public static void main(String[] args) {
    new MemberOder_Takeout();
}



	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

 }
