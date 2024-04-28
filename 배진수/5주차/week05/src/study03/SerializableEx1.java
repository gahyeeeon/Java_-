package study03;

import java.io.*;
import java.io.Serializable;

class Customer implements Serializable {
    int id; // 고객 아이디
    String name; // 고객 닉네임
    String password; // 고객 비밀번호
    int age; // 고객 나이

    public Customer(int id, String name, String password, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
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
public class SerializableEx1 {
    public static void main(String[] args) {
        // 직렬화할 고객 객체
        Customer1 customer = new Customer1(1, "홍길동", "123123", 40);

        // 외부 파일명
        String fileName = "Customer.ser";

        // 파일 스트림 객체 생성 (try with resource)
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            // 직렬화 가능 객체를 바이트 스트림으로 변환하고 파일에 저장
            out.writeObject(customer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
