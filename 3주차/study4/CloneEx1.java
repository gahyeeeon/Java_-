package week03.study4;

import java.lang.Cloneable;

// 객체 복사 메소드를 사용하기 위해서는 Cloneable 인터페이스를 구현해서 clone을 재정의 해야함
class Person implements Cloneable {
    public Person(String name, int age) {
    }
    // ...

    // clone 메서드를 오버라이딩
    public Object clone() throws CloneNotSupportedException { // CloneNotSupportedException는 checked exception 이라 반드시 예외처리
        return super.clone(); // 기본적으로 부모의 clone을 그대로 불러와 반환
    }
}
public class CloneEx1 {
    public static void main(String[] args) {
        try {
            Person p = new Person("홍길동", 11);
            Person p_copy = (Person) p.clone();
        } catch(Exception e) {}
    }
}
