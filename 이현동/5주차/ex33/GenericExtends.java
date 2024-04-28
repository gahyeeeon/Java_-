package ex33;

import java.util.Arrays;
import java.util.Collection;

// 모든 타입을 받아 계산하는 계산기 클래스 모듈
class Calculator1<T> {
    void add(T a, T b) {
    }

    void min(T a, T b) {
    }

    void mul(T a, T b) {
    }

    void div(T a, T b) {
    }
}

// 숫자만 받아 계산하는 계산기 클래스 모듈
class Calculator2<T extends Number> {
    void add(T a, T b) {
    }

    void min(T a, T b) {
    }

    void mul(T a, T b) {
    }

    void div(T a, T b) {
    }
}

interface Readable {
}

// 인터페이스를 구현하는 클래스
class Student implements Readable {
}

// 인터페이스를 Readable를 구현한 클래스만 제네릭 가능
class School<T extends Readable> {

}

interface Writable {
}

class TeacherAuthoriztion implements Readable, Writable {
}
// 다중 타입 한정
class Teacher<T extends Readable & Writable> {
}

// 재귀적 타입 한정
class Compare {
    // 외부로 들어온 타입 E는 Comparable<E>를 구현한 E 객체 이어야 한다.
    public static <E extends Comparable<E>> E max(Collection<E> collection) {
        if(collection.isEmpty()) throw new IllegalArgumentException("컬렉션이 비어 있습니다.");

        E result = null;
        for(E e: collection) {
            if(result == null) {
                result = e;
                continue;
            }

            if(e.compareTo(result) > 0) {
                result = e;
            }
        }

        return result;
    }
}

public class GenericExtends {
    public static void main(String[] args) {
        // 제네릭에 아무 타입이나 모두 할당이 가능
        Calculator1<Number> cal1 = new Calculator1<>();
        Calculator1<Object> cal2 = new Calculator1<>();
        Calculator1<String> cal3 = new Calculator1<>();

        // Number 이외의 클래스들은 오류
        Calculator2<Number> cal4 = new Calculator2<>();

        // 타입 파라미터에 인터페이스를 구현한 클래스만이 올 수 있게 된다.
        School<Student> s1 = new School<>();

        Teacher<TeacherAuthoriztion> t1 = new Teacher<>();

        Collection<Integer> list = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
        System.out.println(Compare.max(list)); // 91

        Collection<Number> list2 = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
//        System.out.println(Compare.max(list2)); // ! Error - Number 추상 메서드는 Comparable를 구현하지않았기 때문에 불가능
    }
}

