package week03.study1;

import java.util.*;


class Person1 {
    public String name;

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 p = (Person1) o;
        return Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); // name 필드의 해시코드를 반환한다.
    }
}

public class ObjectEx03 {
    public static void main(String[] args) throws Exception {
        Person1 p1 = new Person1("홍길동");
        Person1 p2 = new Person1("홍길동");

        // 두 객체의 해시 코드
        System.out.println(p1.hashCode()); // 54150093
        System.out.println(p2.hashCode()); // 54150093

        // 해시코드가 달라도, equals를 재정의 했기 때문에 동등함
        System.out.println(p1.equals(p2)); // true

        // SET를 생성하고 두 객체 데이터를 추가한다.
        Set<Person1> people = new HashSet<>();
        people.add(p1);
        people.add(p2);

        // 그리고 SET의 길이를 출력한다.
        System.out.println(people.size()); // 1
    }
}
