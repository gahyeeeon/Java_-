package week03.chap10;

public class Example3 {
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
//    // 예외를 단순하게 포장한다.
//    public void someMethod() throws EJBException {
//        try {
//            // ...
//        }
//        catch(NamingException | SQLExceptionne | RemoteException e) { // 상세한 예외가 들어와도
//            throw new EJBException(e); // 상위 예외클래스로 퉁쳐서 포장해서 던진다
//        }
//    }
}
