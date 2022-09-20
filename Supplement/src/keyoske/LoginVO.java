package keyoske;

public class LoginVO {
		private String id;
		private String pw;
		//				DTO
		// jdbc      (value object)      (Date Access Object)의 준말
		// 자바					vo							DAO							db
								// 
			// int id																		id			number(5)
			// String name													name		varchar2(20)
			
									//		select
									//		insert

//(Date Access Object)의 준말 DAO : select, insert 를 쓴다.
//(value object) vo = DTO : DB에서 뭔가를 끌어내서 여기다 담겠다. 객체로 삼을때 이걸 씀.
		
		public  LoginVO ( String id, String pw ) { //생성자
			super ( ) ;
			this.id = id ;
			this.pw = pw ;
		}
		public LoginVO( ) { }
		
		public String getId( ) {
			return id ;
		}
		public void setId (String id) {
			this.id = id ;
		}
		public String getPw( ) {
			return pw ;
		}
		public void setPw( ) {
			this.pw = pw ;
		}
		
		
		
		
}
