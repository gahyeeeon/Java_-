package ex21;
import java.lang.Cloneable;

// 객체 복사 메소드를 사용하기 위해서는 Cloneable 마크 인터페이스를 구현해서
// Cloneable 인터페이스를 구현하는 클래스의 객체만이 clone() 메서드를 사용하여 복제될 수 있다.
// 구현하지 않았다면 CloneNotSupportedException을 던지게 된다.
class Person implements Cloneable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // clone 메서드를 오버라이딩
    // CloneNotSupportedException는 checked exception 이라 반드시 예외처리
    public Object clone() throws CloneNotSupportedException {
        // clone 메서드는 기본적으로 "얕은 복사" 를 수행한다.
        // 객체 내에 있는 모든 필드 값을 새 객체로 복사하여 반환하지만,
        // 필드에 참조 타입이 있는 경우 해당 필드의 참조값만 복사하게 된다.
        // 즉, 복사된 객체와 원복 객체가 동일한 필드의 참조 타입의 객체를 공유하게 된다.
        return super.clone(); // 기본적으로 부모의 clone을 그대로 불러와 반환
        // 필드에 참조 타입이 존재하는 경우에는 깊은 복사(deep copy)를 해야하며
        // 참조 타입 필드에 대해 직접 복사 로직을 구현해야한다.
    }
}

public class cloneMethod {
    public static void main(String[] args) {
        try {
            Person p = new Person("홍길동", 11);
            Person p_copy = (Person) p.clone();
        } catch(Exception e) {}
    }
}