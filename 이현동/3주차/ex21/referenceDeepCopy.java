package ex21;

import java.util.Arrays;

class MyObject implements Cloneable {
    int id;
    String description;

    MyObject(int id, String description) {
        this.id = id;
        this.description = description;
    }

//    @Override
//    public String toString(){
//        return String.format("id : %d\ndescription : %s",this.id,this.description);
//    }

    @Override
    public MyObject clone() throws CloneNotSupportedException {
        // 공변 반환 타입
        // 오버라이딩은 부모의 메서드와 시그니처가 같아야 가능하다.
        // 즉, 인자의 갯수나 메서드 반환 타입이 같아야한다.
        // 공변 반환 타입이 생기면서 부모 메서드의 반환 타입을 자식 클래스의 타입으로
        // 변경을 허용하게 되었다.
        // 공변 반환 타입을 사용하면 부모의 타입이 아닌, 실제 반환되는 자식 객체 타입으로
        // 반환할 수 있어서 번거로운 형변환이 줄어든다.
        return (MyObject) super.clone();
    }
}


public class referenceDeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject[] arrObj = {
                new MyObject(101, "first"),
                new MyObject(102, "second"),
                new MyObject(103, "third")
        };
        System.out.println(Arrays.toString(arrObj));

        MyObject[] arrObj2 = new MyObject[arrObj.length];
        for (int i = 0 ; i< arrObj.length;i++){
            arrObj2[i] = arrObj[i].clone();
        }
        System.out.println(Arrays.toString(arrObj2));

    }
}
