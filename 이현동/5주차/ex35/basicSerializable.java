package ex35;

import java.io.*;

class Customer implements Serializable {
    int id;
    String name;
    // 직렬화 대상에서 제외(transient)
    transient String password;
    int age;

    public Customer(int id, String name, String password, int age) {
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
        return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
    }
}


public class basicSerializable {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "John", "Doe", 25);
        System.out.println(c1);
        String fileName = "Customer.ser";

        // 파일 스트림 객체 생성 (try with resource)
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            // 직렬화 가능 객체를 바이트 스트림으로 변환하고 파일에 저장
            out.writeObject(c1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
