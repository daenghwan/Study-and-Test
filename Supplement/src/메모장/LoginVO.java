package �޸���;

public class LoginVO {
		private String id;
		private String pw;
		//				DTO
		// jdbc      (value object)      (Date Access Object)�� �ظ�
		// �ڹ�					vo							DAO							db
								// 
			// int id																		id			number(5)
			// String name													name		varchar2(20)
			
									//		select
									//		insert

//(Date Access Object)�� �ظ� DAO : select, insert �� ����.
//(value object) vo = DTO : DB���� ������ ����� ����� ��ڴ�. ��ü�� ������ �̰� ��.
		
		public  LoginVO ( String id, String pw ) { //������
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
