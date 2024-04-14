package ex19;

class MyObject extends Object { // extends Object 는 생략해 줘도 된다.
    int objId;
    String objName;

    public MyObject(int objId, String objName) {
        this.objId = objId;
        this.objName = objName;
    }

    // toString() 메서드는 해당 인스턴스에 대한 정보를 문자열로 반환한다.
    // 이 메서드는 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의되어 있는것
//    @Override
//    public String toString(){
//        return getClass().getName()+"@"+Integer.toHexString(hashCode());
//    }
}

public class toStringMethod {
    public static void main(String[] args) {
        MyObject o1 = new MyObject(101, "First Object");
        MyObject o2 = new MyObject(102, "Second Object");

        // 클래스 타입 이름 @ 객체주소 해시코드
        System.out.println(o1.toString()); // MyObject@251a69d7
        System.out.println(o2); // MyObject@7344699f
    }
}