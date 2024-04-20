package study03;

public class EnumEx2 {
    interface DAY {
        int MONDAY = 1;
        int TUESDAY = 2;
        int WEDNESDAY = 3;
        int THURSDAY = 4;
        int FRIDAY = 5;
        int SATURDAY = 6;
        int SUNDAY = 7;
    }

    interface MONTH {
        int JANUARY = 1;
        int FEBRUARY = 2;
        int MARCH = 3;
        int APRIL = 4;
        int MAY = 5;
        int JUNE = 6;
        int JULY = 7;
        int AUGUST = 8;
        int SEPTEMBER = 9;
        int OCTOBER = 10;
        int NOVEMBER = 11;
        int DECEMBER = 12;
    }
    public static void main(String[] args) {

        int day = DAY.MONDAY;

        // 상수를 비교하는 논리적으로 잘못된 행위를 함으로써 day 변수에 다른 상수값이 들어가버림
        if (DAY.MONDAY == MONTH.JANUARY) {
            // ...
            day = MONTH.JANUARY;
        }

        // day 변수에 있는 상수는 MONTH 상수이기 때문에 조건문에서 걸러져야 되지만,
        // 결국 정수값이기 때문에 에러가 안나고 그대로 수행됨 -> 프로그램 버그 발생 가능성
        switch (day) {
            case DAY.MONDAY:
                System.out.println("월요일 입니다.");
                break;
            case DAY.TUESDAY:
                System.out.println("화요일 입니다.");
                break;
            case DAY.WEDNESDAY:
                System.out.println("수요일 입니다.");
                break;
        }
    }
}
