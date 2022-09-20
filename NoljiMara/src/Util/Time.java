package Util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {
	
	//?ë°”ì˜ LocalDateTime ?°?´?„° ???…?„ DB?— insert ?•  ?•Œ ?•„?š”
	public static Timestamp localDateTimeToTimeStamp(LocalDateTime ldt) {
		return Timestamp.valueOf(ldt); // ?˜„?¬ ?‚ ì§œì? ?‹œê°?
	}
	
	//DB?˜ TimeStamp ?°?´?„° ???…?„ Javaë¡? select ?•˜?—¬ ê°?? ¸?˜¬ ?•Œ ?•„?š”
	public static LocalDateTime timeStampToLocalDateTime(Timestamp ts) {
		return ts.toLocalDateTime(); // ?˜„?¬ ?‚ ì§œì? ?‹œê°?
	}
	
	public static void main(String[] args) {
		Timestamp ts = localDateTimeToTimeStamp(LocalDateTime.now());
		System.out.println("ts : "+ts);
		
		LocalDateTime ldt = timeStampToLocalDateTime(ts);
		System.out.println("ldt : "+ldt);
	}
};
