package chap4;

import java.util.List;
import java.util.function.IntPredicate;

public class exam7 {
	class Student {
	    String name;
	    int score;

	    public Student(String name, int score) {
	        this.name = name;
	        this.score = score;
	    }
	}
	
	public static void main(String[] args) {

	    List<Student> list = List.of(
	            new Student("홍길동", 99),
	            new Student("임꺽정", 76),
	            new Student("고담덕", 36),
	            new Student("김좌진", 77)
	    );

	    // int형 매개값을 받아 특정 점수 이상이면 true 아니면 false 를 반환하는 함수 정의
	    IntPredicate scoring = (t) -> {
	        return t >= 60;
	    };

	    for (Student student : list) {
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
