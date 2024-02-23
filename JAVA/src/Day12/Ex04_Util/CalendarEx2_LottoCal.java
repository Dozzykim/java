package Day12.Ex04_Util;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class CalendarEx2_LottoCal {
	
	public static void main(String[] args) {
		// *현재 날짜/시간 정보로 객체를 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
		//날짜 형식을 지정하는 방법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//sdf.format(Date 객체) => 지정한 날짜 형식에 맞게 Date 객체의 날짜/시간 정보를 문자열로 반환해줌.
		String today = sdf.format(cal.getTime());
		System.out.println("지금은 "+today);
		
		System.out.println("-----------------------------");
		
		// 현재 날짜로부터 n시간 후, n일 후는 언제일까?
		
		// 1.  10분 후
		// cal.add(시간단위 상수, 날짜/시간 값)
		// :지정한 시간 단위만큼 이후의 날짜/시간으로 변경하는 메소드
		cal.add(cal.MINUTE, 10);
		String after10Min = sdf.format(cal.getTime());
		System.out.println("10분 후는 " + after10Min);
		
		// 2.한 시간 후
		cal.add(cal.HOUR, 1);
		String after1hr = sdf.format(cal.getTime());
		System.out.println("한시간 뒤는 " + after1hr);
		
		cal.add(cal.DAY_OF_MONTH, 1);
		String after1Day = sdf.format(cal.getTime());
		System.out.println("1일 후: " + after1Day);
		
		System.out.println("-----------------------------");
		
		// #.이번 주 로또 추첨일은?
		// 매일 오전 6시 ~ 24시까지 판매.
		// 추첨일(토요일)에는 오후 8시에 판매 마감
		// 추첨일 오후 8시부터 다음날(일요일) 오전 6시까지는 판매X.
		
		//Q. 현재 날짜/시간을 기준으로 로또를 구매한다면, 추첨일은 언제?
		
		// (출력결과)
		// 추첨일 : 2024/02/24 21:00:00
		
		//추첨일
		Calendar lottoDay = Calendar.getInstance();
		lottoDay.set(2024, 1, 24, 21, 0, 0);
		String lotto = sdf.format(lottoDay.getTime());
		System.out.println(lotto);
		
		Calendar hoy = Calendar.getInstance();
		
		hoy.set(2024, Calendar.FEBRUARY, 25, 23, 30, 0);
		String now = sdf.format(hoy.getTime());
		System.out.println("오늘은 "+ now);
		
		int dayOfWeek = hoy.get( Calendar.DAY_OF_WEEK ); //일~토(1~7)
		int hourOfDay = hoy.get( Calendar.HOUR_OF_DAY ); // 24시 표시
		
		
		//월~금 :이번주 토요일 오후9시
		//토
		//	1.8시 이후: 구입불가 & 다음주 토요일 오후 9시
		//	2.8시 이전: 이번 주 토요일 오후 9시
		//일 : 구입불가 & 다음주 토요일 오후 9시
		if (dayOfWeek == 7) {
			if (hourOfDay > 20) {
				lottoDay.add(lottoDay.DAY_OF_WEEK, 7);
				String after1week = sdf.format(lottoDay.getTime());
				System.out.println("추첨일 : " + after1week);
			} else {
				System.out.println("추첨일: " + lotto);
			}
		} else if (dayOfWeek == 1) {
			lottoDay.add(lottoDay.DAY_OF_WEEK, 7);
			String after1week = sdf.format(lottoDay.getTime());
			System.out.println("추첨일 : " + after1week);
		} else {
			System.out.println("추첨일: " + lotto);
		}
		
	}

}
