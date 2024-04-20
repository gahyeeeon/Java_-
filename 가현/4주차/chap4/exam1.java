package chap4;

public class exam1 {
	
	public static void main(String[] args) {

	    // 스트링 클래스 인스턴스화
	    String str = new String("Class클래스 테스트");

	    // getClass() 메서드로 얻기
	    Class<? extends String> cls = str.getClass();
	    System.out.println(cls); // class java.lang.String
	}

}
