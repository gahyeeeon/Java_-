package ex32;

public class StaticProxy implements ServiceInterface{
    private ServiceInterface service;

    public StaticProxy(ServiceInterface service) {
        this.service = service;
    }

    @Override
    public void operation() {
        System.out.println("ServiceProxy: Before operation.");
        service.operation();
        System.out.println("ServiceProxy: After operation.");
    }
}
