package chap3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import chap3.exam4.Customer;

public class exam5 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    Customer user = new Customer(1, "홍길동", "123123", 40);
	    String fileName = "Customer.ser";

	    // 직렬화 하기 (한줄로 표현)
	    ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
	    out.writeObject(user);
	    out.close();

	    // 역직렬화 하기 (한줄로 표현)
	    ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
	    Customer deserialized = (Customer) in.readObject();
	    in.close();

	    System.out.println(deserialized);
	}
}
