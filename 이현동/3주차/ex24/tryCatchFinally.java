package ex24;

class Sample {
    public void addSample(int i){};
    public void printSample(){};
    public void shouldBeRun(){};
}

public class tryCatchFinally {
    public static void main(String[] args) {
        Sample sample = new Sample();

        try {
            sample.addSample(100);
            // 만일 이 메서드를 실행하는데 에러가 나버리면 !
            sample.printSample();

        } catch (Exception e) {
            // ... catch 문의 코드가 실행되고
        } finally {
            // 에러가 나든 안나든 무조건 finally 문은 실행된다.
            sample.shouldBeRun();
        }
        // 메서드의 return 문이 있어도 일단 finally 의 코드를 실행하고 리턴
        // 예외가 발생한 경우
        // try -> catch -> finally
        // 예외가 발생하지 않는 경우
        // try -> finally
    }
}
