package study04;

import java.io.*;
class Member1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private final int age;

    public Member1(String name, int age) {
        this.name = name;
        checkPositive();
        this.age = age;
    }

    private void checkPositive() {
        if (this.age < 0) {
            throw new RuntimeException(new InvalidObjectException("age 값이 옳지 않습니다."));
        }
    }

    // 직렬화 프록시 (정적 내부 클래스)
    private static class MemberProxy implements Serializable {
        private static final long serialVersionUID = 2L;
        private final String name;
        private final int age;

        // 생성자는 단 하나여야 하고, 바깥 클래스의 인스턴스를 매개변수로 받고 데이터를 복사
        public MemberProxy(Member1 m) {
            this.name = m.name;
            this.age = m.age;
        }

        // 객체를 역직렬화 할때 호출되어, 역직렬화 결과를 readResolve 반환값으로 설정
        private Object readResolve() {
            return new Member1(name, age); // 역직렬화되면 최종적으로 Member 객체를 반환
        }
    }

    // 객체를 직렬화 할때 호출되어, 직렬화 대상을 writeReplace를 통해 프록시를 반환하도록 제어
    private Object writeReplace() {
        return new MemberProxy(this); // 프록시가 대신 직렬화
    }

    // 대상 객체(Member)을 역직렬화 하지 못하게 막는다.
    // 애초에 프록시 객체로 직렬화하고 역직렬화하기 때문에 대상 객체가 역직렬화 될일이 없기 때문이다
    private void readObject(ObjectInputStream ois) throws InvalidObjectException  {
        throw new InvalidObjectException("프록시가 필요해요.");
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ProxyEx {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Member1 student1 = new Member1("홍길동", 22);

        // 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Student.ser")));
        out.writeObject(student1);
        out.close();

        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Student.ser")));
        Member1 member = (Member1) in.readObject();
        in.close();

        System.out.println(member);
    }
}
