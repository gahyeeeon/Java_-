package chap1;

public class exam1 {

    public static void main(String[] args) {
        // 각각의 메소드 호출
        print("홍길동");
        print("홍길동", "이순신");
        print("홍길동", "이순신", "유성룡");
        print("홍길동", "이순신", "유성룡", "강감찬");
        print("홍길동", "이순신", "유성룡", "강감찬", "이도");
    }

    public static void print(String... strings) {
        for (String string : strings) {
            System.out.print(string + ", ");
        }
        System.out.println();
    }
}
