package chap3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import chap3.exam1.Customer;

public class exam2 {
	public static void main(String[] args) {
	    // 외부 파일명
	    String fileName = "Customer.ser";

	    // 파일 스트림 객체 생성 (try with resource)
	    try(
	            FileInputStream fis = new FileInputStream(fileName);
	            ObjectInputStream in = new ObjectInputStream(fis)
	    ) {
	        // 바이트 스트림을 다시 자바 객체로 변환 (이때 캐스팅이 필요)
	        Customer deserializedCustomer = (Customer) in.readObject();
	        System.out.println(deserializedCustomer);

	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	}
}
