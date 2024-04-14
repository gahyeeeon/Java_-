package ex20;

class PersonOne {
    String name;

    public PersonOne(String name){
        this.name = name;
    }
}

public class equalsMethod {
    public static void main(String[] args) {
        PersonOne p1 = new PersonOne("홍길동");
        PersonOne p2 = new PersonOne("홍길동");

        // == 은 객체타입인 경우 주소값을 비교.
        // 서로 다른 객체는 다른 주소를 가지고 있기에 false
        System.out.println(p1 == p2);

        // equals 또한 객체타입인 경우 주소값을 비교.
        System.out.println(p1.equals(p2));
    }
}
