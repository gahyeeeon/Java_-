package week03.study3;

import java.util.*;

class Person4 {
    public String name;

    public Person4(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person4 p = (Person4) o;
        return Objects.equals(name, p.name);
    }
}

public class EqualsEx4 {
    public static void main(String[] args) throws Exception {
        Person4 p1 = new Person4("홍길동");
        Person4 p2 = new Person4("홍길동");

        // 두 객체의 해시 코드
        System.out.println(p1.hashCode()); // 460141958
        System.out.println(p2.hashCode()); // 1163157884

        // 해시코드가 달라도, equals를 재정의 했기 때문에 동등함
        System.out.println(p1.equals(p2)); // true

        // 리스트를 생성하고 두 객체 데이터를 추가한다.
        List<Person4> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);

        // 그리고 리스트의 길이를 출력한다.
        System.out.println(people.size()); // 2
    }
}
