package study03;

import java.io.*;
class Customer1 implements Serializable {
    int id; // 고객 아이디
    String name; // 고객 닉네임
    String password; // 고객 비밀번호
    int age; // 고객 나이

    public Customer1(int id, String name, String password, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    // 직렬화 동작 재정의
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeInt(id);
        out.writeObject(name);
        out.writeInt(age);
    }

    // 역직렬화 동작 재정의
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
        this.id = in.readInt();
        this.name = (String) in.readObject();
        this.age = in.readInt();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SerializableEx3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Customer1 user = new Customer1(1, "홍길동", "123123", 40);
        String fileName = "Customer.ser";

        // 직렬화 하기 (한줄로 표현)
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        out.writeObject(user);
        out.close();

        // 역직렬화 하기 (한줄로 표현)
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
        Customer1 deserialized = (Customer1) in.readObject();
        in.close();

        System.out.println(deserialized);
    }
}
