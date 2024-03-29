package Day13.Ex01_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/*
 * java.time 패키지에 있는 LocalDate, LocalTime 클래스
 * 
 */

public class DateTimeCreate {
	
	public static void main(String[] args) {
		
		// **LocalDate		: "날짜"를 다루는 클래스
		System.out.println("[LocalDate]");
		LocalDate nowDate = LocalDate.now();			// .now(); 현재 날짜 정보를 갖는 객체를 생성
		System.out.println("현재 날짜 : " + nowDate);
		
		LocalDate endDate = LocalDate.of(2024, 1, 24);	// 날짜 정보를 지정하여 객체 생성
		System.out.println("종료 날짜 : " + endDate);
		
		// **LocalTime 		: "시간"을 다루는 클래스
		System.out.println("[LocalTime]");
		LocalTime nowTime = LocalTime.now();		
		System.out.println("현재 시간 : " + nowTime);
		
		LocalTime endTime = LocalTime.of(18, 20, 00);
		System.out.println("종료 시간 : " + endTime);
		
		// **LocalDateTime 		: "날짜/시간"을 다루는 클래스
		System.out.println("[LocalDateTime]");
		LocalDateTime nowDateTime = LocalDateTime.now();			
		System.out.println("현재 시간 : " + nowDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2024, 8, 1, 18, 20, 00);
		System.out.println("종료 시간 : " + endDateTime);
		
	
		// 협정 세계시와 타임존 (TimeZone)
		// UTC	: 협정 세계시 - 국제 표준시
		// 서울	: Asia/Seoul
		// 뉴욕	: America/New_York
		// 일본	: Japan
		// 로마	: Europe/Rome
		
		ZonedDateTime utcDateTime = ZonedDateTime.now( ZoneId.of("UTC") ); //zoneId클래스를 만들고 of메소드 사용해서 협정세계시를 가져옴ㅁ
		System.out.println("협정 세계시 : " + utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now( ZoneId.of("Asia/Seoul") );
		System.out.println("서울 표준시 : " + seoulDateTime);
		
		ZonedDateTime newYorkDateTime = ZonedDateTime.now( ZoneId.of("America/New_York") );
		System.out.println("뉴욕 표준시 : " + newYorkDateTime);
		
		ZonedDateTime japanDateTime = ZonedDateTime.now( ZoneId.of("Japan") );
		System.out.println("일본 표준시 : " + japanDateTime);
		
		ZonedDateTime romeDateTime = ZonedDateTime.now( ZoneId.of("Europe/Rome") );
		System.out.println("로마 표준시 : " + romeDateTime);
		
		// 윤년
		// 2월 29일
		LocalDate ld = LocalDate.now();
		// LocalDate.isLeapYear()	: 윤년이면 true, 아니면 false 를 반환하는 메소드
		
		if( ld.isLeapYear() ) {
			System.out.println("올해는 윤년 : 2월 29일 까지");
		}
		else {
			System.out.println("올해는 평년 : 2월 28일 까지");
		}
		
		// 사용가능한 타임존 아이디
		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for (String ZoneId : timeZoneId) {
			System.out.println(ZoneId);
		}
	}
}















