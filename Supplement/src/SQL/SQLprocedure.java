package SQL;

public class SQLprocedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("오이이이잉?");
		
		// jdk : run 15 & edit 11
		
		// duehae.exe   30   80 (String[] args) 얘가 알아서 실행
		
		// 상단 메뉴바 RUN - Run Configurations... 클릭 ->
		// Project & Main Class 이름 일치하는지 확인 -> Name 밑에 (x) = Argument 클릭
		// -> Program arguments 에 30 80 입력 -> Apply -> Run
		
		// 남한테 파일 줄때는 Run Configurations... 값이 없어짐. 그래서 이렇게 남겨주기
		if(args.length != 2 ) { 
			System.out.println("인자 2개 입력 까먹지말구!!!!");
			System.out.println("사용법은 인자 2개 입력해야함.");
			System.exit(1);
			//return ;
		}
		
			
		
		System.out.println(Integer.parseInt(args[0])
		+ Integer.parseInt(args[1]));
		
	}

}

// 메모장 : 윈도우 -> 메모장아이콘을 클릭 - 실질적인건 notepad.exe - 메모장 뜸.
// java --> exe --> 가동되서 메모리에 뜸.
// copy aa bb aa의 사본인 bb 를 복붙.
// copy.exe aa bb  사실상 이건 아니지만, 이거랑 비슷하다고 함.
// 그러나 이클립스에선 실행이 기본적으로 안됨.
// 명령행 인자  (commandline argument)
// 30 + 80 프로그램을 작성
// duehae.exe   30   80       
// [실행파일] 30 80 하면 110이 나오는 프로그램을 만들고 싶음. 기본적으로X
// 리눅스
// ---------
//wc 30+80 하면 110 나옴.
// 자바
// ----------