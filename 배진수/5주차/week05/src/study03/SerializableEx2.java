package study03;

import java.util.*;
import java.io.*;

public class SerializableEx2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 직렬화할 고객 객체
        Customer1 hongildong = new Customer1(1, "홍길동", "123123", 40);
        Customer1 sejong = new Customer1(2, "세종대왕", "4556456", 55);
        Customer1 jumong = new Customer1(3, "주몽", "789789", 25);

        // 외부 파일명
        String fileName = "Customer.ser";

        // 리스트 생성
        List<Customer1> customerList = new ArrayList<>();
        customerList.add(hongildong);
        customerList.add(sejong);
        customerList.add(jumong);

        // 리스트 자체를 직렬화 하기
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(customerList);

        out.close();

        // 역직렬화 하여 리스트 객체에 넣기
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fis);
        List<Customer1> deserializedCustomerList = (List<Customer1>) in.readObject();

        in.close();

        System.out.println(deserializedCustomerList);
    }
}
