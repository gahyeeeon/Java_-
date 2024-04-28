package ex33;

class GenericMethodClass<T> {
    public static <T> T testMethod(T a) {
        return (T) a;
    }

    public <T,U> void printTest(T a,U b){
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        System.out.println(GenericMethodClass.<Integer>testMethod(1));
        System.out.println(GenericMethodClass.testMethod("Hello"));

        GenericMethodClass<Double> t1 = new GenericMethodClass<>();
        t1.printTest(1,2);
        t1.<String,Integer>printTest("asdf",3);
        t1.printTest("asdf",4.1); // 타입 파라미터 생략
    }
}
