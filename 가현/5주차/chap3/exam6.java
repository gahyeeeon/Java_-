package chap3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class exam6 {
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
	
	
}
