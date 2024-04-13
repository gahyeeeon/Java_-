package ex18;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class PersonTwo {
    String name;

    public PersonTwo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        // 전달된 객체(o) 가 메서드를 호출한 객체인지 확인.
        // 같다면, 두 객체는 동등하므로 true를 반환
        if (this == o) return true;
        // 잔달된 객체가 null 이 아니며, 메서드를 호출한 객체와 같은 클래스 타입을
        // 가지는지 확인.
        if (o == null || getClass() != o.getClass()) return false;
        // 위 두 조건을 통과한 경우, 전달된 객체는 null 이 아니며
        // PersonTwo 타입이 보장된다. 따라서 안전하게 형변환 가능.
        PersonTwo p = (PersonTwo) o;
        // 현재 객체의 name 필드와 전달된 객체의 name 필드가 동일한지 비교
        return Objects.equals(name, p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class equalsTest {
    public static void main(String[] args) {
        PersonTwo p1 = new PersonTwo("홍길동");
        PersonTwo p2 = new PersonTwo("홍길동");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.equals(p2));

        Set<PersonTwo> people = new HashSet<>();
        people.add(p1);
        people.add(p2);

        System.out.println(people.size());
    }
}
