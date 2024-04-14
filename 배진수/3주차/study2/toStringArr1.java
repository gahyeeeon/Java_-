package week03.study2;

import java.util.Arrays;

class MyInt1 {
    final int num;

    MyInt1(int num) {
        this.num = num * 100;
    }

    @Override
    public String toString() {
        return Integer.toString(num);
    }
}
public class toStringArr1 {
    public static void main(String[] args) {

        Object[] arr = new Object[5];
        arr[0] = new MyInt1(1);
        arr[1] = new MyInt1(2);
        arr[2] = new MyInt1(3);
        arr[3] = new MyInt1(4);
        arr[4] = new MyInt1(5);

        System.out.println(Arrays.toString(arr));
    }
}
