package ex18;

class PersonOne {
    String name;
    int age;

    public PersonOne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("이름 : %s\n나이 : %d세", this.name, this.age);

    }
}

public class toStringTest {
    public static void main(String[] args) {
        PersonOne p1 = new PersonOne("홍길동", 54);

        System.out.println(p1);
    }
}
