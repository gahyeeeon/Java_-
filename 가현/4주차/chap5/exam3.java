package chap5;

import java.lang.reflect.Proxy;

public class exam3 {
	
	interface AInterface {
	    String call();
	}

	class AImpl implements AInterface {
	    @Override
	    public String call() {
	        System.out.println("A 호출");
	        return "a";
	    }
	}

	class AProxy implements AInterface {
	    AInterface subject;

	    AProxy(AInterface subject) {
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
	
	
	
	public class Client {
	    public static void main(String[] args) {
	        AInterface proxyA = new AProxy(new AImpl());
	        proxyA.call();

	        BInterface proxyB = new BProxy(new BImpl());
	        proxyB.call();
	    }
	}

}
