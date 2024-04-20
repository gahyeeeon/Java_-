package chap3;

public class exam1 {
	
	class EnumExample {
	    private final static int MONDAY = 1;
	    private final static int TUESDAY = 2;
	    private final static int WEDNESDAY = 3;
	    private final static int THURSDAY = 4;
	    private final static int FRIDAY = 5;
	    private final static int SATURDAY = 6;
	    private final static int SUNDAY = 7;
	    
	    public static void main(String[] args) {

	        int day = EnumExample.MONDAY;

	        switch (day) {
	            case EnumExample.MONDAY:
	                System.out.println("월요일 입니다.");
	                break;
	            case EnumExample.TUESDAY:
	                System.out.println("화요일 입니다.");
	                break;
	            case EnumExample.WEDNESDAY:
	                System.out.println("수요일 입니다.");
	                break;
	        }
	    }
	}
}
