package chap4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class exam1 {
	class Member implements Serializable {
	    private static final long serialVersionUID = 1L;
	    private String name;
	    private int age;

	    public Member(String name, int age) {
	        if(age < 0){
	            throw new IllegalArgumentException();
	        }
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Member{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    // 역직렬화
	    ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Student.ser")));
	    Member member = (Member) in.readObject();
	    in.close();

	    System.out.println(member);
	}
}
