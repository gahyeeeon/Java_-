package study05;

import java.lang.reflect.Proxy;
interface AInterface1 {
    String call();
    void print();
    void run();
}

class AImpl1 implements AInterface1 {

    @Override
    public String call() {
        System.out.println("A 호출");
        return "a";
    }

    @Override
    public void print() {
        System.out.println("A print @@@@@@@");
    }

    @Override
    public void run() {
        System.out.println("A Running !!!!!!!!!");
    }
}
public class ProxyEx2 {
    public static void main(String[] arguments) {

        AInterface1 proxyA = (AInterface1) Proxy.newProxyInstance(
                AInterface1.class.getClassLoader(),
                new Class[]{AInterface1.class},
                (proxy, method, args) -> { // 람다 함수
                    Object target = new AImpl1();

                    System.out.println("TimeProxy 실행");
                    long startTime = System.nanoTime();

                    Object result = method.invoke(target, args); // 파라미터로 전달받은 메서드를 invoke로 실행

                    long endTime = System.nanoTime();
                    long resultTime = endTime - startTime;
                    System.out.println("TimeProxy 종료 resultTime = " + resultTime);

                    return result;
                }
        );

        proxyA.call();
        proxyA.print();
        proxyA.run();
    }
}
