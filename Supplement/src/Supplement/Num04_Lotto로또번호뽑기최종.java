package Supplement;

import java.awt.*; 
import java.awt.event.*;

class LRandomGUI2 extends Frame implements ActionListener{/////////////
	 
    // GUI
    private Button b1=new Button("눌러봐~");

    private TextField tf1 =new TextField();
    private TextField tf2 =new TextField();
    private TextField tf3 =new TextField();
    private TextField tf4 =new TextField();
    private TextField tf5 =new TextField();
    private TextField tf6 =new TextField();

    public LRandomGUI2(){
        
        this.setLayout(null);
        
        b1.setSize(100,70);//버튼 크기
        b1.setForeground(new Color(0,0,255));
        b1.setBackground(new Color(255,180,100));
        b1.setFont(new Font("돋움",Font.BOLD,20));
        b1.setLocation(170,250); //버튼 내부위치 
        	this.add(b1);//버튼 추가 
        	b1.addActionListener(this); ////////////////// 

        tf1.setSize(50,50);
        tf1.setForeground(new Color(0,0,255));
        tf1.setBackground(new Color(255,255,0));
        tf1.setFont(new Font("굴림",Font.BOLD,35));
        tf1.setLocation(30, 70);//텍스트 내부위치 
        	this.add(tf1); 
    
        tf2.setSize(50,50);
        tf2.setForeground(new Color(0,0,255));
        tf2.setBackground(new Color(255,255,0));
        tf2.setFont(new Font("굴림",Font.BOLD,35));
        tf2.setLocation(100, 70);//텍스트 내부위치 
        	this.add(tf2); 

        tf3.setSize(50,50);
        tf3.setForeground(new Color(0,0,255));
        tf3.setBackground(new Color(255,255,0));
        tf3.setFont(new Font("굴림",Font.BOLD,35));
        tf3.setLocation(170,70);//텍스트 내부위치 
        	this.add(tf3);
        
        tf4.setSize(50,50);
        tf4.setForeground(new Color(0,0,255));
        tf4.setBackground(new Color(255,255,0));
        tf4.setFont(new Font("굴림",Font.BOLD,35));
        tf4.setLocation(240,70);//텍스트 내부위치 
        	this.add(tf4);
        
        tf5.setSize(50,50);
        tf5.setForeground(new Color(0,0,255));
        tf5.setBackground(new Color(255,255,0));
        tf5.setFont(new Font("굴림",Font.BOLD,35));
        tf5.setLocation(310,70);//텍스트 내부위치 
        	this.add(tf5);
        
        tf6.setSize(50,50);
        tf6.setForeground(new Color(0,0,255));
        tf6.setBackground(new Color(255,255,0));
        tf6.setFont(new Font("굴림",Font.BOLD,35));
        tf6.setLocation(380,70);//텍스트 내부위치 
        	this.add(tf6);
        
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
public void actionPerformed(ActionEvent e1){//
	 if(e1.getSource() == b1){ //버튼이 눌러졌으면(이벤트) 
         int[] Bae=new int[6]; 

         for(int i=0; i< 6; i++){ //중복배제
                     Bae[i]=(int)(Math.ceil(Math.random()*45));
               for(int j=0; j< i; j++){
                           if(Bae[i]==Bae[j])
                                 i--;
                 } //j-end
         }//i-end
         

                for(int i=0;i< 6-1; i++){ //sort
                           for(int j=i+1;j< 6; j++){
                                            if(Bae[i] > Bae[j]){
                                                     int imsi;
                                                     imsi=Bae[i];
                                                     Bae[i]=Bae[j];
                                                     Bae[j]=imsi;
                                       }
                           }
                }
              
        //출력
        tf1.setText(String.valueOf(Bae[0]));
        tf2.setText(String.valueOf(Bae[1]));
        tf3.setText(String.valueOf(Bae[2]));
        tf4.setText(String.valueOf(Bae[3]));
        tf5.setText(String.valueOf(Bae[4]));
        tf6.setText(String.valueOf(Bae[5]));
        
      }//if-end   
      }
}
public class Num04_Lotto로또번호뽑기최종 {
  public static void main(String[] args) {
          LRandomGUI2 b=new LRandomGUI2();
  
  }
}



