package Supplement;

import java.util.*;


public class Num04_Lotto·Î¶Ç¹øÈ£»Ì±â {

	public static void main(String[] args) {
		// ´çÃ· µÉ È®·ü
		//	1/45 x 1/44 x 1/43 x 1/42 x 1/40 = 1/860¸¸
		
		
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println( (int) Math.ceil(45*Math.random()) + "\t" ) ;
		}																		// 0 ~ 1
																				// 0 . xx ~ 44 . xxxx
																				// 1 . .		45 . xx
																				// 1 ~ 45
		
		
		
		System.out.println(" ");
		
	}

}
