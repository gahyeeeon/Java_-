package chap5;

import java.lang.reflect.Proxy;

interface AInterface {
    String call();
    void print();
    void run();
}

class AImpl implements AInterface {
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

public class exam5 {
	
	
	
	
	public class Client {
	    public static void main(String[] arguments) {

	        AInterface proxyA = (AInterface) Proxy.newProxyInstance(
	                AInterface.class.getClassLoader(),
	                new Class[]{AInterface.class},
	                (proxy, method, args) -> { // 람다 함수
	                    Object target = new AImpl();

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

}
