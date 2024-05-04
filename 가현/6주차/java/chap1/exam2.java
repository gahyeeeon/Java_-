package chap1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class exam2 {

	// 싱글톤 + 직렬화
	class Singleton implements Serializable { 

	    private Singleton() {}

	    private static class SettingsHolder {
	        private static final Singleton INSTANCE = new Singleton();
	    }

	    public static Singleton getInstance() {
	        return SettingsHolder.INSTANCE;
	    }
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    Singleton singleton1 = Singleton.getInstance();

	    String fileName = "singleton.obj";

	    // 직렬화
	    ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
	    out.writeObject(singleton1);
	    out.close();

	    // 역직렬화
	    ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
	    Singleton singleton2 = (Singleton) in.readObject();
	    in.close();

	    System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
	    System.out.println(singleton1);
	    System.out.println(singleton2);
	}
}
