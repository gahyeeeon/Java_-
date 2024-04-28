package chap3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class exam4 {
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
	
}
