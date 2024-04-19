package ex32;

import java.lang.reflect.Proxy;
import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        // static
        ServiceInterface service = new ServiceImpl();
        ServiceInterface staticProxy = new StaticProxy(service);
        staticProxy.operation();

        // dynamic
        ServiceInterface realService = new ServiceImpl();
        ServiceInterface dynamicProxy = (ServiceInterface) Proxy.newProxyInstance(
                ServiceInterface.class.getClassLoader(),
                new Class<?>[] {ServiceInterface.class},
                new DynamicProxyHandler(realService)
        );
        dynamicProxy.operation();
    }
}
