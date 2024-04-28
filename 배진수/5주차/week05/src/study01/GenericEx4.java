package study01;

// 주의사항
// 1. 제네릭 타입의 객체는 생성 불가
class Sample<T> {
    public void someMethod() {
//        T t = new T();
    }
}

// 2. static 멤버에 제네릭 타입이 올 수 없음.
class Student<T> {
    private String name;
    private int age = 0;

    // static 메서드의 반환 타입으로 사용 불가
//    public static T addAge(int n) {
//
//    }
    // static 메서드의 매개변수 타입으로 사용 불가
//    public static void addAge(T n) {
//
//    }
}

// 3. 제네릭으로 배열 선언 주의점
public class GenericEx4 {
    // 기본적으로 제네릭 클래스 자체를 배열로 만들 수 없다.
//    public static void main(String[] args) {
//        Sample<Integer>[] arr1 = new Sample<>[10];
//    }
    // 하지만 제네릭 타입의 배열 선언은 허용 된다.
    public static void main(String[] args) {
        // new Sample<Integer>() 인스턴스만 저장하는 배열을 나타냄
        Sample<Integer>[] arr2 = new Sample[10];

        // 제네릭 타입을 생략해도 위에서 이미 정의했기 때문에 Integer 가 자동으로 추론됨
        arr2[0] = new Sample<Integer>();
        arr2[1] = new Sample<>();

        // ! Integer가 아닌 타입은 저장 불가능
//        arr2[2] = new Sample<String>();
    }
}
