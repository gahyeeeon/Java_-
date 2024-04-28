package study03;

import java.util.Arrays;

public class EnumEx3 {
    // 요일 열거 타입
    enum Week {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    // 계절 열거 타입
    enum Season {
        Spring,
        Summer,
        Autumn,
        Winter
    }
    enum LoginResult {
        LOGIN_SUCCESS,
        LOGIN_FAILED
    }

    public static void main(String[] args) {
        // 열거타입 변수 = 열거타입.열거상수;
        Week monday = Week.MONDAY;
        Week sunday = Week.SUNDAY;

        Week today = null; // 참조 타입이기 때문에 null도 저장 가능
        today = Week.SUNDAY;

        // 주소값 비교
        System.out.println(today == Week.SUNDAY); // true

        // enum Week 의 모든 상수값들을 배열로 변환
        Week[] days = Week.values();


        // name() method
        Week w = Week.FRIDAY;

        // 열거 객체의 문자열을 리턴
        String weekName = w.name();
        System.out.println(weekName); // Spring

        // ordinal() method
        Week w1 = Week.FRIDAY;

        // 열거 객체의 순번(0부터 시작)을 리턴
        // 전체 열거 객체 중 몇 번째 열거 객체인지 알려준다
        int weekNum = w1.ordinal();
        System.out.println(weekNum); // 4


        // compareTo() method
        // 열거 객체를 비교해서 순번 차이를 리턴 (시작점을 어느 열거 객체의 기준으로 몇번째 위치하는지)
        Week w11 = Week.TUESDAY; // 2
        Week w22 = Week.SATURDAY; // 6

        // 열거 객체가 매개값의 열거 객체보다 순번이 빠르다 → 음수를 리턴
        int compare1 = w11.compareTo(w22); // SATURDAY 기준으로 TUESDAY 위치 (6에서 2가 되기 위한 값)
        System.out.println(compare1); // -4

        // 열거 객체가 매개값의 열거 객체보다 순번이 늦다 → 양수를 리턴
        int compare2 = w22.compareTo(w1); // TUESDAY 기준으로 SATURDAY 위치 (2에서 6가 되기 위한 값)
        System.out.println(compare2); // 4

        // valueOf() method
        // 문자열을 입력받아서 일치하는 열거 객체를 리턴
        Week w3 = Week.valueOf("SUNDAY"); // w3 변수는 Week.SUNDAY 열거 객체를 참조하게 됨
        System.out.println(w3); // SUNDAY

        // values() method
        // 모든 열거 객체들을 배열로 리턴
        Week[] w4 = Week.values();

        System.out.println(Arrays.toString(w4)); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        for (Week type : Week.values()) { // 열거 순회
            System.out.println(type);  // 순서대로 열거 객체 출력
        }
    }
}
