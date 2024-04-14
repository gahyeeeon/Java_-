package week03.study3;

import java.util.Objects;

class Person6 {
    String name;

    public Person6(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person6)) return false;
        Person6 person = (Person6) o;
        return Objects.equals(this.name, person.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}

public class IdentityHashCodeEx {
    public static void main(String[] args) {
        Person6 p1 = new Person6("홍길동");
        Person6 p2 = new Person6("홍길동");

        // equals() 와 hashCode() 를 오버라이딩 했기에 두 객체 필드 name의 해시코드가 반환되어 같다.
        System.out.println(p1.hashCode()); // 54150093
        System.out.println(p2.hashCode()); // 54150093

        // 따라서 순수 객체의 주소를 얻고 싶다면 identityHashCode() 를 사용해야 한다.
        System.out.println("System.identityHashCode(p1) : " + System.identityHashCode(p1)); // System.identityHashCode(p1) : 622488023
        System.out.println("System.identityHashCode(p2) : " + System.identityHashCode(p2)); // System.identityHashCode(p2) : 414493378
    }
}
