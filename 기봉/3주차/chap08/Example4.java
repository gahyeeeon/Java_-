package week03.chap08;

class InstallException extends Exception {
    public InstallException(String message) {
        super(message);
    }
}

class SpaceException extends Exception {
    public SpaceException(String message) {
        super(message);
    }
}

class MemoryException extends Exception {
    public MemoryException(String message) {
        super(message);
    }
}

public class Example4 {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            System.out.println("원인 예외 : " + e.getCause()); // 원인 예외 출력
            e.printStackTrace();
        }
    }

    public static void install() throws InstallException {
        try {
            throw new SpaceException("설치할 공간이 부족합니다."); // SpaceException 발생

        } catch (SpaceException e) {
            InstallException ie = new InstallException("설치중 예외발생"); // 예외 생성
            ie.initCause(e); // InstallException의 원인 예외를 SpaceException으로 지정
            throw ie; // InstallException을 발생시켜 상위 메서드로 throws 된다.
//        } catch (MemoryException e) {
//            // ...
        }
    }
}