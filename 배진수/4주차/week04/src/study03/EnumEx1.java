package study03;

public class EnumEx1 {
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
