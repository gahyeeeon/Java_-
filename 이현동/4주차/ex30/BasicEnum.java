package ex30;

import java.util.Arrays;

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

enum LoginResult {
    LOGIN_SUCCESS,
    LOGIN_FAILED
}

public class BasicEnum {
    public static void main(String[] args) {
        // 열거타입 변수 = 열거타입.열거상수;
        Week monday = Week.MONDAY;
        Week sunday = Week.SUNDAY;

        Week today = null; // 참조 타입이기 때문에 null도 저장 가능
        today = Week.SUNDAY;

        // 주소값 비교
        System.out.println(today == Week.SUNDAY); // true

        // Enum 상수들 배열로 저장
        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day);
        }

        // name()
        Week w = Week.FRIDAY;
        String weekName = w.name();
        System.out.println(weekName);

        // ordinal()
        // 열거 객체의 순번(0부터 시작)을 리턴
        // 전체 열거 객체 중 몇 번째 열거 객체인지 알려준다
        int weekNum = w.ordinal();
        System.out.println(weekNum); // 4

        // compareTo()
        // 열거 객체를 비교해서 순번 차이를 리턴
        // (시작점을 어느 열거 객체의 기준으로 몇번째 위치하는지)
        Week w1 = Week.TUESDAY; // 2
        Week w2 = Week.SATURDAY; // 6

        // 열거 객체가 매개값의 열거 객체보다 순번이 빠르다 → 음수를 리턴
        // SATURDAY 기준으로 TUESDAY 위치 (6에서 2가 되기 위한 값)
        int compare1 = w1.compareTo(w2);
        System.out.println(compare1); // -4

        // 열거 객체가 매개값의 열거 객체보다 순번이 늦다 → 양수를 리턴
        // TUESDAY 기준으로 SATURDAY 위치 (2에서 6가 되기 위한 값)
        int compare2 = w2.compareTo(w1);
        System.out.println(compare2); // 4

        // valueOf()
        // 문자열을 입력받아서 일치하는 열거 객체를 리턴
        // w3 변수는 Week.SUNDAY 열거 객체를 참조하게 됨
        Week w3 = Week.valueOf("SUNDAY");
        System.out.println(w3); // SUNDAY

        // 모든 열거 객체들을 배열로 리턴
        Week[] w4 = Week.values();

        // values()
        System.out.println(Arrays.toString(w4));
        // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        for (Week type : Week.values()) { // 열거 순회
            System.out.println(type);  // 순서대로 열거 객체 출력
        }
    }
}
