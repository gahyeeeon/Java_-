package ex21;

class Address implements Cloneable {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    // Address 클래스의 clone() 메소드에서 깊은 복사 구현
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // 여기서는 얕은 복사지만, Address는 immutable 속성을 가정
    }
}

class Obj implements Cloneable {
    private String name;
    private Address address; // 참조 타입 필드

    public Obj(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Person 클래스의 clone() 메소드에서 깊은 복사 구현
    @Override
    public Object clone() throws CloneNotSupportedException {
        Obj cloned = (Obj) super.clone(); // 먼저 Object의 clone()을 통해 얕은 복사
        cloned.address = (Address) address.clone(); // Address 객체에 대해 깊은 복사 수행
        return cloned;
    }
}

public class referenceDeepCopy2 {
    public static void main(String[] args) {

    }
}
