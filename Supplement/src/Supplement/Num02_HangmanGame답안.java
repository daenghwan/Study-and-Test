package Supplement;

import java.util.Arrays;
import java.util.Scanner;

public class Num02_HangmanGame답안 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// 행맨 게임 제일 처음 화면은 밑줄이 나옴
			// _ _ _ _ _
			
			// String str1 = "apple";
			// String jool = "_____";
			
			// char [] ch1 = {'a', 'p', 'p', 'l', 'e'}; // 문자상수배열
			// char [] jool = {'_', '_', '_', '_', '_'};
			
			String [] moonja = {"a", "p", "p", "l", "e"}; // 문자열배열
			String [] jool = {"_", "_", "_", "_", "_"};
			
			
			
			// 초기치 작업인데 사실 프로그램 작성시에는 먼저 쓰지 않음
			String ip;
			// int cnt = 0;
			int sw = 0;
			// count와 flag기법
			
					
			
			
			// 처음에 jool(밑출) 출력-//nested 기법
			for(int i = 0; i<jool.length; i++) {
				System.out.print(jool[i]);
			}
			System.out.println();
			
			
			
			
			Scanner scan1 = new Scanner(System.in);
			
			for(int i = 1; i<=13; i++) { // 13-for-start
				// cnt = 0;
				System.out.println("예상글자입력:");
				ip = scan1.next(); // nextLine() // i love you
				for(int j = 0; j<5; j++) { // 맞추었으면 밑줄지우고 대신 해당 문자를 아래로
					if(ip.equals(moonja[j])) // 내용비교
						jool[j] = moonja[j]; // 영문자를 밑출로 내려보냄
				}
				/* a  p  p  l  e  ==> moonja배열
				
				   a  p  p  _  _  ==> jool배열    */
				
				
				
				/*	  apple
					  _pp__    */
				
				for(int j = 0; j<5; j++) {
					System.out.print(jool[j]); // 시작하자마자 p를 입력하고 맞추었으니 _pp__
				}
				
				System.out.println("\t"+i+"번시도"); // 1번시도
				
				
				// 배열 통채로 비교
					// if(aa>3) {
				if(Arrays.equals(moonja, jool)) { // true?
					System.out.println("참잘했어요.");
					sw = 1; // 13번까지 계속 진행 한 후 결과보기
					break; // 반복문을 빠져 나오는 것으로 13-for-end 다음으로 exit				
				}
				
			} ///////////////////// 13-for-end
			
			
			// 13번 시도 후 오답일 때, for문 나오기전 정답
			if(sw == 0) {
				System.out.print("다음기회에");
			}
			
			
		} // main-end

	} // class-end
