package Supplement;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BClass extends Frame implements ActionListener {
		Label laHigh = new Label("당신의 키는");				
		Label laWeight = new Label("당신의 몸무게는");
		
		TextField tfHigh = new TextField(); // 키 적을 빈 공간
		TextField tfWeight = new TextField(); // 몸무게 적을 빈 공간		
		
		Button btnBMI = new Button("BMI계산"); // 계산 버튼
		TextField tfResul = new TextField(); // 결과가 나올 빈 공간
		
		// 생성자 : 실행시 제일 먼저 찾아오는 곳.
		BClass () {
			this.setLayout(null); // 디자인은 개발자 마음대로.
			
			laHigh.setSize(90,30); //(가로 , 세로) pixel = 네모칸 크기
			laHigh.setLocation(20,70); // 라벨 내부위치
			this.add(laHigh); //라벨 추가
			
			laWeight.setSize(90,30);
			laWeight.setLocation(20,100);
			this.add(laWeight);				
			
			tfHigh.setSize(90,30); 
			tfHigh.setLocation(laHigh.getLocation().x+laHigh.getSize().width,70); 
			this.add(tfHigh);
			
			tfWeight.setSize(90,30); 
			tfWeight.setLocation(laWeight.getLocation().x+laWeight.getSize().width,100); 
			this.add(tfWeight);
			
			btnBMI.setSize(70,30);
			btnBMI.setLocation(200,300);
			this.add(btnBMI);			
			btnBMI.addActionListener(this);	//이벤트 등록
			
			tfResul.setSize(400,50);
			tfResul.setLocation(20,400);
			this.add(tfResul);
			
			this.setSize(500, 500);
			this.setBackground(Color.DARK_GRAY);
			this.setVisible(true);
			
			
			addWindowListener(new WindowAdapter() {	///// WindowListener 얘가 가지고 있는 정의가 5개 그래서 WindowAdapter가 나머지 4개를 다 커버 쳐줌.
				public void windowClosing(WindowEvent el) {
					dispose();
					System.exit (0); // 강제종료 // C언어 : exit()	// C# : Environment.Exit ()
				}
			} ) ;
		}
		
	@Override
	public void actionPerformed(ActionEvent e) { // actionPerformed 이벤트 처리함수
		// TODO Auto-generated method stub
		// event 처리할 부분을 여기에 적으면 됨.
		if(e.getSource () == btnBMI) {
			int High = Integer.parseInt (tfHigh.getText()) ;
			int Weight = Integer.parseInt (tfWeight.getText()) ;
			
			double MHigh = High / 100.0 ;
			double BMI =  Weight / Math.pow(MHigh , 2) ;
			
			String result ;
			
			if (BMI >= 30.0)
				result = "비만";
			else if ( BMI >= 25.0)
				result = "과제충";
			else if ( BMI >= 20.0)
				result = "보통";
			else
				result = "저체중";
			
			tfResul.setText("당신의 BMI지수는" + BMI + "이며" + result + "이군요!") ;
		}
		
		
	}
	
	
}


public class Num01_BMIcalcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// GUI : Graphic User Interface
		
		BClass b1 = new BClass();
		
	}

}

