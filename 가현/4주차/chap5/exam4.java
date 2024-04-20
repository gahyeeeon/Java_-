package chap5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import chap5.exam3.AImpl;
import chap5.exam3.AInterface;
import chap5.exam3.BImpl;
import chap5.exam3.BInterface;

public class exam4 {
	
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
	
	public class Client {
	    public static void main(String[] args) {
	    
	        AInterface proxyA = (AInterface) Proxy.newProxyInstance(
	                AInterface.class.getClassLoader(),
	                new Class[]{AInterface.class},
	                new MyProxyHandler(new AImpl())
	        );
	        proxyA.call();

	        BInterface proxyB = (BInterface) Proxy.newProxyInstance(
	                BInterface.class.getClassLoader(),
	                new Class[]{BInterface.class},
	                new MyProxyHandler(new BImpl())
	        );
	        proxyB.call();
	    }
	}

}
