package study04;

import java.util.List;
import java.util.function.*;

class Student1 {
    String name;

    int score;

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
public class PredicateInterfaceEx {
    public static void main(String[] args) {

        List<Student1> list = List.of(
                new Student1("홍길동", 99),
                new Student1("임꺽정", 76),
                new Student1("고담덕", 36),
                new Student1("김좌진", 77)
        );

        // int형 매개값을 받아 특정 점수 이상이면 true 아니면 false 를 반환하는 함수 정의
        IntPredicate scoring = (t) -> {
            return t >= 60;
        };

        for (Student1 student : list) {
            String name = student.name;
            int score = student.score;

            // 함수 실행하여 참 / 거짓 값 얻기
            boolean pass = scoring.test(score);

            if(pass) {
                System.out.println(name + "님 " + score + "점은 국어 합격입니다.");
            } else {
                System.out.println(name + "님 " + score + "점은 국어 불합격입니다.");
            }
        }
    }
}
