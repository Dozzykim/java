package Day12.Ex04_Util;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {

		// *현재 날짜/시간 정보로 객체를 생성
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		// 날짜 형식을 지정하는 방법
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd (EEEE) HH:mm:ss");
		// sdf.format(Date 객체) => 지정한 날짜 형식에 맞게 Date 객체의 날짜/시간 정보를 문자열로 반환해줌.
		String today = sdf.format(cal.getTime());
		System.out.println("지금은 " + today);

		System.out.println("-----------------------------");

		// 현재 날짜로부터 n시간 후, n일 후는 언제일까?

		// 1. 10분 후
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

		// Q. 현재 날짜/시간을 기준으로 로또를 구매한다면, 추첨일은 언제?

		// (출력결과)
		// 추첨일 : 2024/02/24 21:00:00

		// 오늘
		Calendar lottoCal = Calendar.getInstance();

		// 구입불가 조건 1: 0~6시
//		lottoCal.set(Calendar.AM_PM, 0);
//		lottoCal.set(Calendar.HOUR, 1);

		// 구입불가 조건2: 토요일 오후 9시
//		lottoCal.set(Calendar.DAY_OF_WEEK, 7);
//		lottoCal.set(Calendar.AM_PM, 1);
//		lottoCal.set(Calendar.HOUR, 9);

		int 요일 = lottoCal.get(Calendar.DAY_OF_WEEK);
		int 시간 = lottoCal.get(Calendar.HOUR);
		int ampm = lottoCal.get(Calendar.AM_PM);
		String todayOfWeek = "";

		// 요일: [일1][월2][화3][수4][목5][금6][토7]

		// 조건
		// 일요일 6시~토요일 8시 => 이번주 토요일 오후 9시
		switch (요일) {
		case 1:
			todayOfWeek = "일";
			break;
		case 2:
			todayOfWeek = "월";
			break;
		case 3:
			todayOfWeek = "화";
			break;
		case 4:
			todayOfWeek = "수";
			break;
		case 5:
			todayOfWeek = "목";
			break;
		case 6:
			todayOfWeek = "금";
			break;
		case 7:
			todayOfWeek = "토";
			break;
		}
		System.out.println(todayOfWeek);

		// 로또 추첨 시간은 고정된 값: 9시, 0분, 0초
		lottoCal.set(Calendar.AM_PM, 1); // 오전 0 / 오후 1
		lottoCal.set(Calendar.HOUR, 9);
		lottoCal.set(Calendar.MINUTE, 0);
		lottoCal.set(Calendar.SECOND, 0);

		// 구입 가능 여부
		boolean buyYN = false;

		// 로또 구입 조건
		// 1. (구입 불가) 오전00시~06시
		if (ampm == 0 && 0 <= 시간 && 시간 <= 6) {
			System.err.println("구입 가능한 시간이 아닙니다.");
		}
		// 2. (구입 불가) 토요일 이면서, 오후 8시 이후
		else if (todayOfWeek.equals("토") && ampm == 1 && 시간 >= 8) {
			System.err.println("구입 가능한 시간이 아닙니다.");
		}
		// 3. (구입 가능)
		else {
			buyYN = true;
		}

		// 구입가능시.
		if (buyYN) {
			// 추첨일 구하는 계산
			lottoCal.add(Calendar.DATE, 7 - 요일);
			String 추첨일 = sdf.format(lottoCal.getTime());
			System.out.println("추첨일: " + 추첨일);
		} else {
			System.err.println("구입 가능한 시간에 다시 오세요.");
		}

		// Date 객체의 getXXX() 메소드는 deprecated(더 이상 사용권장 안 함)
		// --> 날짜의 년/월/일 추출하는 기능은 Calendar 클래스에서 주로 사용
		

	}
}
