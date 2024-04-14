package ex24;

public class tryCatch {
    public static void main(String[] args) {
        int a, b, c;

        try {
            a = 10;
            b = 0;
            c = a / b;
        } catch (ArithmeticException e) {
            c = -1;
        } catch (Exception e){
            System.out.println("ArithmeticException 이외에 어떠한 에러 발생");
        }
    }
}
