package week03.chap07;

public class Example2 {
    public static void main(String[] args) {
        int a, b, c = 0;
        try {
            a = 10;
            b = 0;
            c = a / b; // 10 나누기 0 → 산술오류 ArithmeticException
        } catch (ArithmeticException e) {
            c = -1;  // 예외가 발생하여 이 문장이 수행된다.
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
//        } catch (ClassNotFoundException e) {
//            System.out.println("클래스가 존재하지 않습니다.");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("실행 매개값의 수가 부족합니다.");
            } else if(e instanceof NullPointerException){
                System.out.println("NULL을 참조하고 있습니다.");
            }
//        } catch (IOException e) {
//            System.out.println("입력값이 잘못 되었습니다.");
//        } catch (Exception e) { // 부모 예외 클래스로 한꺼번에 처리했기 때문에 세세한 예외 클래스 종류는 지금은 알 수는 없다.
//            System.out.println("위의 Exception들 이외에 모르는 어떠한 에러가 발생하였습니다");
        }
        System.out.println(c);
    }
}
