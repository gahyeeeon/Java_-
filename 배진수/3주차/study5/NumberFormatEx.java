package week03.study5;

public class NumberFormatEx {
    public static void main(String[] args) {
        String stringNumber = "3.141592";
        int num = Integer.parseInt(stringNumber); // "3.141592"를 정수로 변환할 때 NumberFormatException 예외 발생
// float num = Float.parseFloat(stringNumber); (parsefloat 으로 변경해 주어야 함)
    }
}
