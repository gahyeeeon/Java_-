package chap5;

import java.lang.reflect.Proxy;

public class exam6 {
	
	public class Client {
	    public static void main(String[] arguments) {

	        AInterface proxyA = (AInterface) Proxy.newProxyInstance(
	                AInterface.class.getClassLoader(),
	                new Class[]{AInterface.class},
	                (proxy, method, args) -> {
	                    Object target = new AImpl();

	                    // 실행한 메서드가 call 일 경우 로깅 기능을 가미하여 리턴
	                    if(method.getName().equals("call")) {
	                        System.out.println("TimeProxy 실행");
	                        long startTime = System.nanoTime();

	                        Object result = method.invoke(target, args); // 파라미터로 전달받은 메서드를 invoke로 실행

	                        long endTime = System.nanoTime();
	                        long resultTime = endTime - startTime;
	                        System.out.println("TimeProxy 종료 resultTime = " + resultTime);

	                        return result;
	                    }

	                    // 만일 메서드가 run이나 print 일경우 로깅 기능을 가미하지않고 그냥 그대로 원본 대상 객체의 메서드를 실행하고 리턴하도록 지정
	                    return method.invoke(target, args);
	                }
	        );

	        proxyA.call();
	        proxyA.print();
	        proxyA.run();
	    }
	}

}
