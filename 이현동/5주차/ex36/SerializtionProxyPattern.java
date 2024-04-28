package ex36;

import java.io.*;

class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final int age;

    Member(String name, int age) {
        this.name = name;
        checkPositive();
        this.age = age;
    }

    private void checkPositive() {
        if (this.age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // 직렬화 프록시 (정적 내부 클래스)
    private static class MemberProxy implements Serializable {
        private static final long serialVersionUID = 2L;
        private final String name;
        private final int age;

        // 외부 클래스의 인스턴스를 매개변수로 받고 데이터 복사
        MemberProxy(Member m) {
            this.name = m.name;
            this.age = m.age;
        }

        // 객체를 역직렬화 할때 호출되어, 역직렬화 결과를 readResolve 반환값으로 설정
        private Object readResolve() {
            // 최종적으로 새로운 Member 객체를 반환
            return new Member(name, age);
        }
    }

    // 객체를 직렬화 할때 호출되어, 직렬화 대상을 writeReplace 를 통해 프록시를 반환
    private Object writeReplace() {
        // 프록시가 대신 직렬화
        return new MemberProxy(this);
    }

    // 대상 객체(Member)를 역직렬화 하지 못하게 막는다.
    private void readObject(ObjectInputStream ois) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
    }
}

public class SerializtionProxyPattern {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Member student1 = new Member("John Doe", 30);
        // 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(student1);
        out.close();
        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        student1 = (Member) in.readObject();
        in.close();

        System.out.println(student1);
    }
}
