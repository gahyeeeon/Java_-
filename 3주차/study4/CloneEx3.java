package week03.study4;

import java.util.Arrays;

class MyObject{
    int id;
    String description;

    MyObject(int id, String description) {
        this.id = id;
        this.description = description;
    }
}
public class CloneEx3 {
    public static void main(String[] args) {
        MyObject1[] arrayObj = {
                new MyObject1(101, "first"),
                new MyObject1(101, "second"),
                new MyObject1(101, "third")
        };
        System.out.println(Arrays.toString(arrayObj)); // [main$1MyObject@251a69d7, main$1MyObject@7344699f, main$1MyObject@6b95977]

        MyObject1[] arrayObj2; // 복사할 배열

        arrayObj2 = arrayObj.clone(); // 배열을 복사해도 내용물 객체의 주소는 똑같다.
        System.out.println(Arrays.toString(arrayObj2)); // [main$1MyObject@251a69d7, main$1MyObject@7344699f, main$1MyObject@6b95977]

        System.out.println(arrayObj[0].id); // 101
        arrayObj2[0].id = 999; // 복사한 arrayObj2의 첫째 객체의 멤버를 변경

        // 원본과 복사본의 값이 같다.
        System.out.println(arrayObj2[0].id); // 999
        System.out.println(arrayObj[0].id); // 999 : arrayObj1 의 첫째 겍체의 멤버도 변경됨
    }
}
