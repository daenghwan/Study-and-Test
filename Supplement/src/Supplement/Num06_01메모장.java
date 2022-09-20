package Supplement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.*;

class FileGUI2 extends Frame implements ActionListener {
	
	private Button b2 = new Button ("파일READ") ;
	private Button b3 = new Button ("파일SAVE") ;
	private TextArea ta1 = new TextArea( ) ;
	
	public FileGUI2(){	// 생성자 시작
        
        this.setLayout(null);
        
    b2.setSize(100,70);//버튼 크기
    b2.setForeground(new Color(0,0,0));
    b2.setBackground(new Color(0,255,255));
    b2.setFont(new Font("돋움",Font.BOLD,20));
    b2.setLocation(350,200); //버튼 내부위치 
        this.add(b2);//버튼 추가 
    b2.addActionListener(this); ////////////////// 

    b3.setSize(100,70);//버튼 크기
    b3.setForeground(new Color(0,0,0));
    b3.setBackground(new Color(0,255,255));
    b3.setFont(new Font("돋움",Font.BOLD,20));
    b3.setLocation(350,300); //버튼 내부위치 
        this.add(b3);//버튼 추가 
    b3.addActionListener(this); ////////////////// 

    ta1.setSize(300,340);// 크기
    ta1.setForeground(new Color(0,0,255));
    ta1.setBackground(new Color(255,255,153));
    ta1.setFont(new Font("돋움",Font.BOLD,20));
    ta1.setLocation(20,40); // 내부위치 
        this.add(ta1);// 추가 
    
        this.setBackground(new Color(051,153,255)); 
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

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == b2) {	// 읽기버튼 누름? 
		String fileData = null ;
		FileDialog fd1 = new FileDialog(this , "파일READ" , FileDialog.LOAD) ;
					
						// aa.txt
		
		  fd1.setVisible(true) ;
		String dirfile1 = fd1.getDirectory( ) + fd1.getFile( ) ;
			try { /*******************************************/
				FileReader fr = new FileReader(dirfile1) ; // aa.txt
				BufferedReader br = new BufferedReader(fr) ;
				String s;
				while ( ( s = br. readLine ( ) ) != null ) {
					fileData += s + "\n" ;
				}
				ta1.setText(fileData) ; //출력
				br.close ( ) ; fr.close ( ) ;
				/************************************************/
			} catch(Exception e1) {
				
				System.out.println("error") ;
				
			}
	}else if (e.getSource() == b3) {
		FileDialog fd2 = new FileDialog (this , "파일SAVE" , FileDialog.SAVE) ;
		
			fd2.setVisible(true) ;
			
		String dirfile2 = fd2.getDirectory( ) + fd2.getFile ( ) ;
			String fileData2 = ta1.getText( ) ;
			
			try {
					/*********************************************/
			FileWriter fw = new FileWriter(dirfile2) ;
			PrintWriter pw = new PrintWriter (fw) ;
			pw.println ( fileData2 ) ;
			pw.close ( ) ;
			fw.close ( ) ;
			/*********************************************/
			} catch (Exception e1) {
				System.out.println("error") ;
				}
			}
	
	
	}
}

	
	
public class Num06_01메모장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileGUI2 bb = new FileGUI2 () ; // 이거는 똑같이 적어야함.
		
		
	} // main - end

} // class Num06_01 메모장 - End
