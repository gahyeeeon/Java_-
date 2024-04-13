package ex24;

public class multiCatch {
    public static void main(String[] args) {
        try {

        }
        // 여러개의 예외를 한번에 처리하는것이기 때문에 각 예외마다
        // 세세하게 제어하고 싶다면 if 와 instanceOf 연산자로 하나하나 분기하며 처리
        catch (NullPointerException|ArrayIndexOutOfBoundsException e){
            if (e instanceof NullPointerException){

            }
            else if (e instanceof  ArrayIndexOutOfBoundsException){

            }
        }
    }

}
