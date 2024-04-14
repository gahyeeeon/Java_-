package week03.study1;

// extends Object 를 안써줘도 컴파일러가 알아서 상속시켜주고 컴파일 해준다.
class MyObject {
    // 아무것도 안쓴다.
}
public class ObjectEx {
    public static void main(String args[]) {
        MyObject o = new MyObject();
        // MyObject 클래스에 아래의 메소드를 명시하지 않아도 동작하는 이유는 기본적으로 Object 클래스를 상속하고 있기에 부모의 메서드를 갖다 쓰는 것이다.
        o.toString();
        o.hashCode();
    }

}
