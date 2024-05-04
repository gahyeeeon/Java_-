package ex40;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

class Student {
    private String name;

    int korean_score;
    int english_score;
    int math_score;

    Student(String name, int korean_score, int english_score, int math_score) {
        this.name = name;
        this.korean_score = korean_score;
        this.english_score = english_score;
        this.math_score = math_score;
    }

    String getName() {
        return name;
    }
}

public class FunctionTest {
    public static void main(String[] args) {

        // int형을 String으로 타입 변환하는 함수 정의
        Function<Integer, String> intToStr = t -> String.valueOf(t);
        String str = intToStr.apply(100);

        // String을 int형으로 타입 변환하는 함수 정의
        ToIntFunction<String> strToInt = t -> Integer.parseInt(t);
        int num = strToInt.applyAsInt("100");

        // int형을 double형으로 타입 변환하는 함수 정의
        IntToDoubleFunction intToDouble = t -> (double) t;
        double d = intToDouble.applyAsDouble(100);

        List<Student> list = List.of(
                new Student("홍길동", 99, 12, 45),
                new Student("임꺽정", 76, 20, 8),
                new Student("고담덕", 36, 50, 33),
                new Student("김좌진", 77, 89, 91)
        );

        // 각 학생의 이름 가져오는 함수 정의 (매개타입 : Student 객체, 리턴타입 : String형)
        Function<Student, String> getNameFunc = (s) -> s.getName();

        // 각 학생의 교과목 평균 계산하고 가져오는 함수 정의 (매개타입 : Student 객체, 리턴타입 : int형)
        ToDoubleFunction<Student> getScoreFunc = (s) -> {
            int sum = s.korean_score + s.english_score + s.korean_score;
            double avg = sum / 3.0;
            return avg;
        };

        for (Student student : list) {
            String name = getNameFunc.apply(student);
            double avg = getScoreFunc.applyAsDouble(student);
            System.out.printf("%s 평균 점수 : %f\n", name, avg);
        }

    }

}
