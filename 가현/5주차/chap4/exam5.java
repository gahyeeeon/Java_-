package chap4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class exam5 {
	class Person implements Serializable {
	    private static final long serialVersionUID = 1L;

	    String name;
	    long age;

	    public Person() {
	    }

	    public Person(String name, long age) {
	        this.name = name;
	        this.age = age;
	    }
	}

	class Student implements Serializable {
	    private static final long serialVersionUID = 2L;
	    String school;
	    String circles;

	    public Student(String school, String circles) {
	        this.school = school;
	        this.circles = circles;
	    }
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    Student student1 = new Student("세종대학교", "게임동아리");

	    // 직렬화
	    ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Student.ser")));
	    out.writeObject(student1);
	    out.close();

	    // 역직렬화
	    ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Student.ser")));
	    Student student2 = (Student) in.readObject();
	    in.close();

	    System.out.println(student2.school);
	    System.out.println(student2.circles);
	}
}
