package study04;

import java.util.function.*;

public class SupplierInterfaceEx {
    public static void main(String[] args) {

        // T 객체를 리턴하는 함수 정의
        Supplier<Object> supplier = () -> new Object();
        System.out.println(supplier.get());

        // Boolean 값을 리턴하는 함수 정의
        BooleanSupplier booleanSup =  () -> true;
        System.out.println(booleanSup.getAsBoolean());

        // int 값을 리턴하는 함수 정의
        IntSupplier intSup = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };
        System.out.println("주사위 랜덤 숫자 : " + intSup.getAsInt());

        // double 값을 리턴하는 함수 정의
        DoubleSupplier doubleSup = () -> 1.0;
        System.out.println(doubleSup.getAsDouble());

        // long 값을 리턴하는 함수 정의
        LongSupplier longSup = () -> 1L;
        System.out.println(longSup.getAsLong());
    }
}
