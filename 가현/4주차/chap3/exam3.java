package chap3;

public class exam3 {

	class Day {
	    // 자기 자신 객체를 인스턴스화 하고 final static 화 함으로써 고유의 객체 상수를 얻게 됨
	    public final static Day MONDAY = new Day();
	    public final static Day TUESDAY = new Day();
	    public final static Day WEDNESDAY = new Day();
	}

	class Month {
	    public final static Month JANUARY = new Month();
	    public final static Month FEBRUARY = new Month();
	    public final static Month MARCH = new Month();
	}
	
	public static void main(String[] args) {

	    Day day = Day.MONDAY;

	    // if문은 문제 없지만
	    if(day == Day.MONDAY) {
	        System.out.println("월요일 입니다.");
	    }

		/*
		 * // switch문에서는 사용할수 없다 switch (day) { case DAY.MONDAY:
		 * System.out.println("월요일 입니다."); break; case DAY.TUESDAY:
		 * System.out.println("화요일 입니다."); break; case DAY.WEDNESDAY:
		 * System.out.println("수요일 입니다."); break; }
		 */
	    enum Day{
	    	MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	    }

	    enum Month{
	    	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, 
	    	AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	    }
	}
}
