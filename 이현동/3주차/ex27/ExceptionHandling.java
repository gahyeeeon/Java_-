package ex27;


public class ExceptionHandling {
    // 예외 복구
//    private void mayThrowExceptionLogic() {
//        int maxTry = 20;
//        while(maxTry --> 0) {
//            try {
//                // ???Exception 이 Throw 될 수 가능성이 있는 로직
//
//                // 성공 시 return, 해당 메소드 종료
//                return ;
//            } catch(???Exception e) {
//                // Error 로그 출력
//                // 실패 로직 존재 시 원상 복구
//                // 일정 시간 동안 대기
//            } finally {
//                // 작업에 사용한 Resource 반환 및 정리
//            }
//        }
//        // 최대 횟수 실패시 예외 Throw
//        throw new MaxTryFailedException();
//    }

    // 예외 회피
//    private void mayThrowExceptionLogic() throws ???Exception {
//        // 비즈니스 로직
//    }

    // 예외 전환
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
