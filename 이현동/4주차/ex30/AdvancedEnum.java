package ex30;

import java.util.Arrays;
import java.util.List;

// enum 매핑 클래스
enum Season {
    SPRING("봄"),
    SUMMER("여름"),
    FALL("가을"),
    WINTER("겨울");

    // 문자열을 저장할 필드
    private String season;

    // 생성자 (싱글톤)
    private Season(String season) {
        this.season = season;
    }

    // Getter
    public String getSeason() {
        return season;
    }
}

enum CreditCard {

    SHINHAN("신한", Arrays.asList("Mr.Life 카드", "Deep Dream 카드", "Deep Oil 카드")),
    KB("국민", Arrays.asList("톡톡D 카드", "티타늄 카드", "다담 카드")),
    NH("농협", Arrays.asList("올바른 FLEX 카드", "테이크 5 카드", "NH 올원 파이카드"));

    private final String Enterprise;
    private final List<String> cards;

    CreditCard(String name, List<String> cards) {
        this.Enterprise = name;
        this.cards = cards;
    }

    CreditCard getCard(String cardName) throws Exception {
        return Arrays.stream(CreditCard.values())
                .filter(creditCard -> creditCard.cards.contains(cardName))
                .findFirst()
                .orElseThrow(() -> new Exception("Card not found"));
    }

}

enum Operation {
    PLUS("+") {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTI("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
            return x / y;
        }
    };

    // 클래스 생성자와 멤버
    private final String symbol;
    Operation(String symbol) {
        this.symbol = symbol;
    }

    // toString을 재정의하여 열거 객체의 매핑된 문자열을 반환하도록
    @Override
    public String toString() {
        return symbol;
    }

    // 열거 객체의 메소드에 사용될 추상 메소드 정의
    public abstract double apply(double x, double y);
}

public class AdvancedEnum {
    public static void main(String[] args) throws Exception {
        Season season = Season.SPRING;
        System.out.println(season.name());
        System.out.println(season.getSeason());

        CreditCard card = CreditCard.KB;
        System.out.println(card.getCard("Deep Dream 카드"));

        double x = 2.5;
        double y = 5.0;

        // Operation 상수집합의 PLUS 상수를 정의
        Operation plus = Operation.PLUS;

        // enum 매핑값 출력
        String name = plus.toString();
        System.out.println(name); // +

        // enum 확장 메소드 실행
        double result = plus.apply(x, y); // 덧셈을 수행하는 메소드 (Operation.PLUS.apply(x, y) 로 해도됨)
        System.out.println(result); // 7.5
    }
}
