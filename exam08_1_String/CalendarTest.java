package exam08_1_String;
import java.util.Calendar;
public class CalendarTest {

	public static void main(String[] args) {
		
		// 날짜 데이터
		// Calendar 클래스는 추상 클래스이기 때문에 new 불가.
		
		Calendar cal = Calendar.getInstance(); // 현재 시간 추출!
		System.out.println(cal); // cal.toString() 동일
		
		/*
		 * java.util.GregorianCalendar [time=1689921885122, areFieldsSet=true,
		 * areAllFieldsSet=true, lenient=true, zone=sun.util.calendar.ZoneInfo
		 * [id="Asia/Seoul", offset=32400000, dstSavings=0, useDaylight=false,
		 * transitions=30, lastRule=null], firstDayOfWeek=1, minimalDaysInFirstWeek=1,
		 * ERA=1,YEAR=2023, MONTH=6, WEEK_OF_YEAR=29, WEEK_OF_MONTH=4, DAY_OF_MONTH=21,
		 * DAY_OF_YEAR=202, DAY_OF_WEEK=6, DAY_OF_WEEK_IN_MONTH=3, AM_PM=1,HOUR=3,
		 * HOUR_OF_DAY=15, MINUTE=44, SECOND=45, MILLISECOND=122, ZONE_OFFSET=32400000,
		 * DST_OFFSET=0]
		 * 
		 */

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 1월:0 12월:11
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println("년:" + year);
		System.out.println("월:" + month);
		System.out.println("일:" + day);
		System.out.println("시:" + hour);
		System.out.println("분:" + minute);
		System.out.println("초:" + second);

		// 특정 날짜 설정
		Calendar cal2 = Calendar.getInstance();
		/*
		 * Sets the values for the calendar fields YEAR, MONTH, and
		 * DAY_OF_MONTH.Previous values of other calendar fields are retained. If this
		 * is not desired,call clear() first. Parameters:year the value used to set the
		 * YEAR calendar field.month the value used to set the MONTH calendar
		 * field.Month value is 0-based. e.g., 0 for January.date the value used to set
		 * the DAY_OF_MONTH calendar field.
		 * 
		 * 
		 * 
		 */
		cal2.set(2004, 1, 4); // 0-based ~ 11
		System.out.println("년:" + cal2.get(Calendar.YEAR));
		System.out.println("월:" + (cal2.get(Calendar.MONTH) + 1));
		System.out.println("일:" + cal2.get(Calendar.DAY_OF_MONTH));

	}

}
