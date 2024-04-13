package week03.study6;
class Sample {

    public void addSample(int i) {
    }

    public void printSample() {
    }

    public void shouldBeRun() {
    }
}
public class ExceptionEx1 {
    public static void main(String[] args) {
        Sample sample = new Sample();

        try {
            sample.addSample(100);
            sample.printSample(); // 만일 이 메서드를 실행하는데 에러가 나버리면 !

        } catch (Exception e) {
            // ... catch 문의 코드가 실행되고
        } finally {
            sample.shouldBeRun(); // 에러가 나든 안나든 무조건 finally 문은 실행된다.
        }
    }
}
