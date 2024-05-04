package ex37;

public enum EumSingleton {
    INSTANCE; // 싱글톤 인스턴스

    // 이넘은 필드와 메서드도 가질 수 있다
    private int value = 3;

    public int getValue() {
        return value;
    }
}
