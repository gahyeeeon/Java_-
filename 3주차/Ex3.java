package week03;

import java.util.Objects;

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        // 이름의 해시 코드 반환
        return Objects.hash(name);
    }
}

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("홍길동");
        Person p2 = new Person("홍길동");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }

}
