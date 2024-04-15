package week03.study9;


public class ExceptionHandlingEx1 {
    // 1. 예외 복구
//    final int MAX_RETRY = 100;
//
//    public Object someMethod() {
//        int maxRetry = MAX_RETRY;
//
//        while(maxRetry > 0) {
//            try {
//                // ...
//                return; // 성공시 바로 리턴
//            } catch(Exception e) {
//                // 예외 발생시 로그를 출력
//            } finally {
//                // 리소스 반납 및 정리 작업
//            }
//
//            --maxRetry; // 실패하면 1000번 반복
//        }
//
//        // 최대 재시도 횟수를 넘기면 직접 예외를 발생
//        //throw new RetryFailedException();
//    }
    //2, 예외 처리 회피
//    public void add() throws SQLException {
//        try {
//            // ... 생략
//        } catch(SQLException e) {
//            e.printStackTrace(); // 로그만 출력하고
//            throw e; // 다시 날린다
//        }

    // 3. 예외 전환
    // 조금 더 명확한 예외로 던진다.
//    public void add(User user) throws DuplicateUserIdException, SQLException {
//        try {
//            // ...
//        } catch(SQLException e) { // SQLException 예외가 발생하면
//            if(e.getErrorCode() == MysqlErrorNumbers.ER_DUP_ENTRY) { // 그리고 정확히 어떠한 에러인걸 알았다면
//                throw DuplicateUserIdException(); // 상위 클래스가 아닌 정확한 예외클래스를 던진다
//            }
//            else {
//                throw e;
//            }
//        }
//    }
    // 예외를 단순하게 포장한다.
//    public void someMethod() throws EJBException {
//        try {
//            // ...
//        }
//        catch(NamingException | SQLExceptionne | RemoteException e) { // 상세한 예외가 들어와도
//            throw new EJBException(e); // 상위 예외클래스로 퉁쳐서 포장해서 던진다
//        }
//    }
}
