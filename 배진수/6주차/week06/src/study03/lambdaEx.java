package study03;

// JavaScript 람다 표현식
//const MyFunction = {
//    print: function() {}
//};
//
//MyFunction.print = (str) => console.log(str);
//let myfunc = MyFunction;
//myfunc.print("Hello World");

// Java 람다 표현식
interface MyFunction {
    void print(String str);
}

public class lambdaEx {
    public static void main(String[] args) {
        MyFunction myfunc = (str) -> System.out.println(str);
        myfunc.print("Hello World");
    }
}
