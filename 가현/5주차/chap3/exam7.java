package chap3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import chap3.exam6.UserInfo;

public class exam7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    UserInfo u1 = new UserInfo("홍길동", "123123", 33, 170, true);
	    UserInfo u2 = new UserInfo("임꺽정", "456456", 12, 180, false);
	    String fileName = "UserInfo.ser";
	    
	    // 직렬화
	    ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
	    
	    out.writeObject(u1);
	    out.writeObject(u2);
	    
	    out.close();

	    // 역직렬화
	    ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));

	    // 객체를 읽을때는 출력한 순서와 일치
	    UserInfo u3 = (UserInfo) in.readObject();
	    UserInfo u4 = (UserInfo) in.readObject();

	    System.out.println(u3);
	    System.out.println(u4);

	    in.close();
	}
}
