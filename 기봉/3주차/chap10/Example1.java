package week03.chap10;

public class Example1{
    final int MAX_RETRY = 100;

    public void someMethod() {
        int maxRetry = MAX_RETRY;

        while(maxRetry > 0) {
            try {
                // ...
                return; // 성공시 바로 리턴
            } catch(Exception e) {
                // 예외 발생시 로그를 출력
            } finally {
                // 리소스 반납 및 정리 작업
            }

            --maxRetry; // 실패하면 1000번 반복
        }

        // 최대 재시도 횟수를 넘기면 직접 예외를 발생
//            throw new RetryFailedException();
    }
}