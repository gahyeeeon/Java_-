package week03.study4;

// 객체 복사 메소드를 사용하기 위해서는 Cloneable 인터페이스를 구현해서 clone을 재정의 해야함
class User implements Cloneable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneEx2 {
    public static void main(String[] args) {
        try {
            // 얕은 복사(shallow copy)
            User user = new User();
            user.setName("Edward");
            User copy = user;

            System.out.println(user.hashCode()); // 622488023
            System.out.println(copy.hashCode()); // 622488023
            System.out.println(user.equals(copy)); // true - 둘이 동인할 힙데이터를 바라보고 있기 때문에


            // 깊은 복사(deep copy)
            User user2 = new User();
            user2.setName("Edward");
            User copy2 = (User) user2.clone();

            System.out.println(user2.hashCode()); // 1933863327
            System.out.println(copy2.hashCode()); // 112810359
            System.out.println(user2.equals(copy2)); // false - 둘은 복사되어 생김새만 같지 다른 힙데이터를 바라보고 있기 때문에

        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
