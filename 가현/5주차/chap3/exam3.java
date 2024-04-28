package chap3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import chap3.exam1.Customer;

public class exam3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    // 직렬화할 고객 객체
	    Customer hongildong = new Customer(1, "홍길동", "123123", 40);
	    Customer sejong = new Customer(2, "세종대왕", "4556456", 55);
	    Customer jumong = new Customer(3, "주몽", "789789", 25);

	    // 외부 파일명
	    String fileName = "Customer.ser";

	    // 리스트 생성
	    List<Customer> customerList = new ArrayList<>();
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
	    List<Customer> deserializedCustomerList = (List<Customer>) in.readObject();
	    
	    in.close();
	    
	    System.out.println(deserializedCustomerList);
	}
}
