package week03.study1;
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // @Overriding : 오버라이딩은 메서드 시그니처가 일치해야 한다. 블록 안의 내용만 재정의 하는 것이다.
    public String toString() {
        return String.format("이름 : %s, 나이 : %d세", this.name, this.age);
    }
}
public class ObjectEx02 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 54);

        // p1 객체를 출력하면 이름과 나이가 출력
        System.out.println(p1); // 이름 : 홍길동, 나이 : 54세
    }
}
