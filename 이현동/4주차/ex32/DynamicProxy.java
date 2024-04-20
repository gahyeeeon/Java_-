package ex32;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface AInterface {
    String call();
    void Aprint();
    int Aadd(int a, int b);
}

class AImpl implements AInterface {
    @Override
    public String call() {
        System.out.println("A 호출");
        return "a";
    }

    @Override
    public void Aprint() {
        System.out.println("A print!");

    }

    @Override
    public int Aadd(int a, int b) {
        return a + b;
    }
}

//class AProxy implements AInterface {
//    AInterface subject;
//
//    AProxy(AInterface subject) {
//        this.subject = subject;
//    }
//
//    @Override
//    public String call() {
//        System.out.println("TimeProxy 실행");
//        long startTime = System.nanoTime();
//
//        String result = subject.call();
//
//        long endTime = System.nanoTime();
//        long resultTime = endTime - startTime;
//        System.out.println("TimeProxy 종료 resultTime = " + resultTime);
//
//        return result;
//    }
//
//    @Override
//    public void Aprint() {
//
//    }
//
//    @Override
//    public void Aadd(int a, int b) {
//
//    }
//}

interface BInterface {
    String call();
}

class BImpl implements BInterface {
    @Override
    public String call() {
        System.out.println("B 호출");
        return "b";
    }
}

class BProxy implements BInterface {
    BInterface subject;

    BProxy(BInterface subject) {
        this.subject = subject;
    }

    @Override
    public String call() {
        System.out.println("TimeProxy 실행");
        long startTime = System.nanoTime();

        String result = subject.call();

        long endTime = System.nanoTime();
        long resultTime = endTime - startTime;
        System.out.println("TimeProxy 종료 resultTime = " + resultTime);

        return result;
    }
}

// InvocationHandler 프록시 메서드 핸들러를 클래스 필드 변수를 이용해야 하기 때문에 재정의 함
class MyProxyHandler implements InvocationHandler {
    private final Object target;

    MyProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("TimeProxy 실행");
        long startTime = System.nanoTime();

        Object result = method.invoke(target, args); // 파라미터로 전달받은 메서드를 invoke로 실행

        long endTime = System.nanoTime();
        long resultTime = endTime - startTime;
        System.out.println("TimeProxy 종료 resultTime = " + resultTime);

        return result;
    }
}

public class DynamicProxy {
    public static void main(String[] args) {

        AInterface proxyA = (AInterface) Proxy.newProxyInstance(
                AInterface.class.getClassLoader(),
                new Class[]{AInterface.class},
                new MyProxyHandler(new AImpl())
        );
        proxyA.call();
        proxyA.Aprint();
        System.out.println(proxyA.Aadd(1, 2));

        BInterface proxyB = (BInterface) Proxy.newProxyInstance(
                BInterface.class.getClassLoader(),
                new Class[]{BInterface.class},
                new MyProxyHandler(new BImpl())
        );
        proxyB.call();
    }
}