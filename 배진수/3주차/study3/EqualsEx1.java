package week03.study3;
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public class EqualsEx1 {
        public static void main(String[] args) {
            Person1 person1 = new Person1("홍길동");
            Person1 person2 = new Person1("홍길동");

            System.out.println(person1 == person2); // == 은 객체타입인경우 주소값을 비교한다. 서로다른 객체는 다른 주소를 가지고 있기 때문에 false가 출력됨

            System.out.println(person1.equals(person2)); // equals또한 객체타입인경우 주소값을 비교하기 때문에 false가 출력된다.
        }
    }
}