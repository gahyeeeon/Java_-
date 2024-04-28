package study03;

import java.io.*;
class UserAccount {
    String name;
    String password;

    // ! 기본 생성자 없으면 InvalidClassException : no valid constructor 발생
    public UserAccount() {
    }

    UserAccount(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
class UserInfo extends UserAccount implements Serializable {
    int age;
    int height;
    boolean marreid;

    UserInfo(String name, String password, int age, int height, boolean marreid) {
        super(name, password);
        this.age = age;
        this.height = height;
        this.marreid = marreid;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        // 부모 필드 직렬화
        out.writeUTF(name);
        out.writeUTF(password);

        // 자신 필드 직렬화 (메서드를 통해 한번에 처리)
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        // 부모 필드 역직렬화
        name = in.readUTF();
        password = in.readUTF();

        // 자신 필드 역직렬화 (메서드를 통해 한번에 처리)
        in.defaultReadObject();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "age=" + age +
                ", height=" + height +
                ", marreid=" + marreid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
public class SerializableEx4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserInfo u1 = new UserInfo("홍길동", "123123", 33, 170, true);
        UserInfo u2 = new UserInfo("임꺽정", "456456", 12, 180, false);
        String fileName = "UserInfo.ser";

        // 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));

        out.writeObject(u1);
        out.writeObject(u2);

        out.close();

        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));

        // 객체를 읽을때는 출력한 순서와 일치
        UserInfo u3 = (UserInfo) in.readObject();
        UserInfo u4 = (UserInfo) in.readObject();

        System.out.println(u3);
        System.out.println(u4);

        in.close();
    }
}
