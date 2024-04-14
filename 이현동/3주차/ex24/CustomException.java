package ex24;

class MyCustomException extends Exception{
    private String msg;

    public MyCustomException(String msg){
        super(msg);
        this.msg = msg;
    }

    public void printMyMessage(){
        System.out.println(this.msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
    try {
        throw new MyCustomException("커으텀 예외 클래스 메세지");
    } catch (MyCustomException e) {
        e.printMyMessage();
        e.printStackTrace();
    }
    }
}
