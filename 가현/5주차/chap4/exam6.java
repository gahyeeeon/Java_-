package chap4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import chap4.exam5.Person;

public class exam6 {
	class Student extends Person {
	    private static final long serialVersionUID = 2L;
	    String school;
	    String circles;

	    public Student(String school, String circles) {
	        this.school = school;
	        this.circles = circles;
	    }
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

	    // 역직렬화
	    ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Student.ser")));
	    Student student2 = (Student) in.readObject();
	    in.close();

	    System.out.println(student2.name);
	    System.out.println(student2.age);
	    System.out.println(student2.school);
	    System.out.println(student2.circles);
	}
}
