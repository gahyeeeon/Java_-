package week03.study3;

class Person2 {
    String name;

    public Person2(String name) {
        this.name = name;
    }
}

public class EqualsEx3 {
    public static void main(String[] args) {
        Person2 p1 = new Person2("홍길동");
        Person2 p2 = new Person2("홍길동");

        // 객체 인스턴스마다 각기 다른 주해시코드(주소))를 가지고 있다.
        System.out.println(p1.hashCode()); // 622488023
        System.out.println(p2.hashCode()); // 1933863327
    }
}