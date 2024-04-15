package week03.study2;

class MyObject extends Object { // extends Object 는 생략해 줘도 된다.
    int objId;
    String objName;

    public MyObject(int objId, String objName) {
        this.objId = objId;
        this.objName = objName;
    }
}

public class toStringEx {
    public static void main(String[] args) {
        MyObject o1 = new MyObject(101, "First Object");
        MyObject o2 = new MyObject(102, "Second Object");

        // 클래스 타입 이름 @ 객체주소 해시코드
        System.out.println(o1.toString()); // MyObject@251a69d7
        System.out.println(o2.toString()); // MyObject@7344699f
    }
}
