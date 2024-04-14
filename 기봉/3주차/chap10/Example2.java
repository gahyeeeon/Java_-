package week03.chap10;

import java.sql.SQLException;

public class Example2 {
    public void add() throws SQLException {
        try {
            // ... 생략
            throw new SQLException("DB error");
        } catch(SQLException e) {
            e.printStackTrace(); // 로그만 출력하고
            throw e; // 다시 날린다
        }
    }
}
