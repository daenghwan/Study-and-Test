package Supplement;

public class Num03_ILoveYou전광판2 {

	public static void main (String  [ ] args) {
	
		
/*
		LOVE 단어를 123번째 글자인 OVE를 먼저 출력하고
		바로 이어서 L을 출력하는 형식의 프로그램을 작성하시오.
		단 , 이런형식의 출력을 200번 반복 출력하고 문법으로는
		substring () 을 사용하시오.
		실제로는 I Love You를 사용하시오.
*/
		String s1 = "          I LOVE YOU" ;
		//string s1 = "LOVE"
		kajaDisplay(s1) ; //메소드 2형식
		
		
	}

	private static void kajaDisplay(String s1) {
		
		for(int i = 0 ; i < 500 ; i++) {
		//s1 = s1.substring(1, 20) + s1.substring(0 , 1);
			s1 = s1.substring(1, s1.length()) + s1.substring(0 , 1);
			System.out.println(s1);
			// LOVE ==> OVE 뒤에 L을 붙이고 ==> VEL 뒤에 O를 붙이고 ....20번 반복
		}
		
		
	}
}
