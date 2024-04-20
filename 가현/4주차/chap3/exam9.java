package chap3;

class Client {
    // Client 클래스 정의
}

public class exam9 {

    enum SingletonEnum {
        INSTANCE;

        private final Client dbClient;

        SingletonEnum() {
            dbClient = Database.getClient();
        }

        public static SingletonEnum getInstance() {
            return INSTANCE;
        }

        public Client getClient() {
            return dbClient;
        }
    }

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.getInstance();
        Client client = singleton.getClient();
        // client 객체를 사용하여 필요한 작업을 수행
    }
}
