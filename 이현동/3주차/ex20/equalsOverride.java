package ex20;

import java.util.Objects;

class PersonTwo {
    String name;

    public PersonTwo(String name){
        this.name = name;
    }

    // 객체 주소 비교가 아닌 Person 객체의 이름이 동등한지 비교로 재정의 하기 위해 오버라이딩
    @Override
    public boolean equals(Object o){
        // 전달된 객체가 현재 객체와 같으면 true
        if(this == o) return true;
        // 전달된 객체가 PersonTwo의 인스턴스가 아니면 false
        if( !(o instanceof PersonTwo)) return false;
        PersonTwo p = (PersonTwo) o;
        return Objects.equals(this.name, p.name);
    }
}

public class equalsOverride {
    public static void main(String[] args) {

    }
}
