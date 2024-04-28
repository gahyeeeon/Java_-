package study04;

import java.io.*;
class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void readObjectNoData() {
        this.name = "홍길동";
        this.age = 25;
    }
}

class Student extends Person {
    private static final long serialVersionUID = 2L;
    String school;
    String circles;

    public Student(String school, String circles) {
        this.school = school;
        this.circles = circles;
    }
}

public class ReadObjectNoDataEx {
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
