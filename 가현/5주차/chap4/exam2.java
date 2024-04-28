package chap4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class exam2 {
	class Member implements Serializable {
	    private static final long serialVersionUID = 1L;
	    private String name;
	    private int age;

	    public Member(String name, int age) {
	        this.name = name;
	        checkPositive();
	        this.age = age;
	    }

	    private void checkPositive() {
	        if (this.age < 0) {
	            throw new RuntimeException(new InvalidObjectException("age 값이 옳지 않습니다."));
	        }
	    }

	    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
	        ois.defaultReadObject(); // 기본 역직렬화 로직 실행
	        checkPositive();
	    }

	    @Override
	    public String toString() {
	        return "Member{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }
	}
}
