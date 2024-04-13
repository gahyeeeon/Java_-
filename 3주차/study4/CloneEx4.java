package week03.study4;

import java.util.Arrays;

class MyObject1 implements Cloneable{
    int id;
    String description;

    MyObject1(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override // 공변 반환 타입을 이용한 오버라이딩
    public MyObject1 clone() throws CloneNotSupportedException {
        return (MyObject1) super.clone();
    }
}
public class CloneEx4 {
    public static void main(String[] args) {
        try {
            MyObject1[] arrayObj = {
                    new MyObject1(101, "first"),
                    new MyObject1(102, "second"),
                    new MyObject1(103, "third")
            };

            System.out.println(Arrays.toString(arrayObj)); // [MyObject@251a69d7, MyObject@7344699f, MyObject@6b95977]

            MyObject1[] arrayObj2 = new MyObject1[3];
            for (int i = 0; i < arrayObj.length; i++) {
                arrayObj2[i] = arrayObj[i].clone();
            }

            // 배열 내용물 객체의 @주소가 달라짐을 볼 수 있다.
            System.out.println(Arrays.toString(arrayObj2)); // [MyObject@1540e19d, MyObject@677327b6, MyObject@14ae5a5]

            System.out.println(arrayObj[0].id); // 101
            arrayObj2[0].id = 999; // 복사한 arrayObj2의 첫째 객체의 멤버를 변경

            // 원본과 복사본의 값이 다르게 된다.
            System.out.println(arrayObj2[0].id); // 999
            System.out.println(arrayObj[0].id); // 101

        } catch (Exception e) {}
    }
}
