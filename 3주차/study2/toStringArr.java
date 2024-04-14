package week03.study2;

import java.util.Arrays;

class MyInt {
    final int num;

    MyInt(int num) {
        this.num = num * 100;
    }
}
public class toStringArr {
    public static void main(String[] args) {

        Object[] arr = new Object[5];
        arr[0] = new MyInt1(0);
        arr[1] = new MyInt1(1);
        arr[2] = new MyInt1(2);
        arr[3] = new MyInt1(3);
        arr[4] = new MyInt1(4);

        System.out.println(Arrays.toString(arr));
    }
}
