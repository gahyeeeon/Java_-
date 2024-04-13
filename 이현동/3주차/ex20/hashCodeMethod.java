package ex20;

import java.util.Objects;

class PersonThree {
    String name;

    public PersonThree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonThree that)) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class hashCodeMethod {
    public static void main(String[] args) {
        PersonThree p1 = new PersonThree("홍길동");
        PersonThree p2 = new PersonThree("홍길동");

        // 객체 인스턴스마다 각기 다른 주해시코드(주소))를 가지고 있다.
        System.out.println(p1.hashCode()); // 622488023
        System.out.println(p2.hashCode()); // 1933863327
    }
}