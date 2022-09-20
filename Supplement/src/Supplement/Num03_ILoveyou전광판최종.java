package Supplement;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

class EDisplay extends Frame implements ActionListener{/////////////
    
    static int sw=0;////
 /////////////
    static String s1="              I LOVE YOU";///////////////
    Timer t1=new Timer();////////////////
 //////////////////
// GUI
    private Button b1=new Button("시~작~");
    private Button b2=new Button("끄~읕~");
    private TextField tf1 =new TextField();

    public EDisplay(){
        
        this.setLayout(null);
        
    b1.setSize(200,70);//버튼 크기
    b1.setForeground(new Color(0,0,255));
    b1.setBackground(new Color(255,180,100));
    b1.setFont(new Font("돋움",Font.BOLD,20));
    b1.setLocation(150,200); //버튼 내부위치 
        this.add(b1);//버튼 추가 
    b1.addActionListener(this); ////////////////// 
    
    b2.setSize(200,70);//버튼 크기
    b2.setForeground(new Color(0,0,255));
    b2.setBackground(new Color(255,180,100));
    b2.setFont(new Font("돋움",Font.BOLD,20));
    b2.setLocation(150,300); //버튼 내부위치 
        this.add(b2);//버튼 추가 
    b2.addActionListener(this); ///버튼 이벤트를 위하여/ 

        tf1.setSize(400,50);
        tf1.setForeground(new Color(0,0,255));
        tf1.setBackground(new Color(255,255,0));
    tf1.setFont(new Font("굴림",Font.BOLD,35));
        tf1.setLocation(30, 70);//텍스트 내부위치 
        this.add(tf1); 
    
        this.setBackground(new Color(0,200,0)); 
        this.setTitle("자바는 FUN FUN FUN !!!!!!");
        this.setSize(460, 400); //프레임 크기
        
        this.setVisible(true);
        
      
        addWindowListener(new WindowAdapter(){ //////////////////
                 public void windowClosing(WindowEvent e1){
                         dispose();
                         System.exit(0);
                         
                 }
        });
}

public void actionPerformed(ActionEvent e1){
        if(e1.getSource() == b1 && sw == 0) {
        	//b1.setVisible(false) ; 
        	b1.setEnabled(false) ;	//아이콘을 반투명으로
        	
            t1.schedule (new TimerTask()  {
        		// t1.scheduleAtFixedRate (new TimeTask() { }
        		public void run() {	//thread
        			try {
        				s1 = s1.substring(1,  s1.length()) + s1.substring(0 ,  1) ;
        				
        				tf1.setText(s1);
        				//////////////////////////////////////////////////
        			}	
        			catch (Exception e ) {
        				e.printStackTrace();
        			}
        		} // run - end
        	} , 0 , 250 ) ;//schdule-end // 1초 = 1000ms
        } // if-end
      sw=1 ; // 시작버튼이 한번만 작동되게
      
      if(e1.getSource() == b2) {	//끝 버튼이 눌러졌으면 (이벤트)
    	  t1.cancel();
      }
	}
}

public class Num03_ILoveyou전광판최종 {
    
    public static void main(String[] args) {
            
  EDisplay ed1=new EDisplay();
    }

}