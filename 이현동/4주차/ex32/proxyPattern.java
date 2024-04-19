//package ex32;
//
//interface Subject {
//    String request();
//}
//
//class RealSubject implements Subject {
//    @Override
//    public String request() {
//        return "HelloWorld";
//    }
//}
//
//class Proxy implements Subject {
//    private final RealSubject realSubject = new RealSubject();
//
//
//    @Override
//    public String request() {
//        return realSubject.request();  //프록시가 실제의 메소드를 호출한다.
//    }
//
//}
//
//public class proxyPattern {
//    public static void main(String[] args) {
//        // Subject클래스의 메소드를 호출하는것이아닌 프록시클래스의 메소드를 호출한다.
//        Subject subject = new Proxy();
//        System.out.println(subject.request()); // 내부적으로 Subject의 메소드를 호출한다.
//    }
//}
