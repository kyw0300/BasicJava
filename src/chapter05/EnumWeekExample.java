package chapter05;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		// 열거형 (enumeration) => Singleton 형태로 객체를 만들어준다.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		Week today = null;
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일: " + today.korName);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 늦잠을 잡니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
	}
}
