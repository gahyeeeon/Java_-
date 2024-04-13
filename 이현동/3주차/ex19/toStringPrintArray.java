package ex19;

import java.util.Arrays;
import java.util.Objects;

class MyInt {
    final int mynum;

    MyInt(int num) {
        this.mynum = num * 100;
    }

    @Override
    public String toString(){
        return Integer.toString(mynum);
    }
}

public class toStringPrintArray {
    public static void main(String[] args) {
        Object[] arr = new Object[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = new MyInt(i + 1);
        }

        System.out.println(Arrays.toString(arr));

        Object[] iarr = new Object[5];

        for ( int i = 0; i < iarr.length; i++){
            // java 9 이후qnxj Integer 클래스의 생성자는 더이상 사용되지 않으로 표시
            // valueOf 메서드 사용을 권장
//            iarr[i] = new Integer(i+1);
            iarr[i] = Integer.valueOf(i+1);
        }
        System.out.println(Arrays.toString(iarr));
    }
}
