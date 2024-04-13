package week03.study3;
import java.util.Objects;

class Person1 {
    String name;

    public Person1(String name) {
        this.name = name;
    }

    // 객체 주소 비교가 아닌 Person 객체의 사람 이름이 동등한지 비교로 재정의 하기 위해 오버라이딩
    public boolean equals(Object o) {
        if (this == o) return true; // 만일 현 객체 this와 매개변수 객체가 같을 경우 true
        if (!(o instanceof Person1)) return false; // 만일 매개변수 객체가 Person 타입과 호환되지 않으면 false
        Person1 person = (Person1) o; // 만일 매개변수 객체가 Person 타입과 호환된다면 다운캐스팅(down casting) 진행
        return Objects.equals(this.name, person.name); // this객체 이름과 매개변수 객체 이름이 같을경우 true, 다를 경우 false
    }
}
public class EqualsEx2 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("홍길동");
        Person1 p2 = new Person1("홍길동"); // 동명이인

        System.out.println(p1.equals(p2)); // true
    }
}
