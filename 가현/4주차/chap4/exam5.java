package chap4;

public class exam5 {
	
	public static void main(String[] args) {
	    Class<? extends String> cls = String.class;

	    // 가지고 있는 필드를 모두 출력한다.
	    System.out.println("6. " + Arrays.toString(cls.getFields())); // 6.  [public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER]

	    // 가지고 있는 메서드를 모두 호출한다.
	    System.out.println("7. " + Arrays.toString(cls.getMethods())); // 7. [public boolean java.lang.String.equals(java.lang.Object), public java.lang.String java.lang.String.toString() ...]

	    // 인터페이스 목록을 모두 가져온다.
	    System.out.println("8. " + Arrays.toString(cls.getInterfaces())); // 8. [interface java.io.Serializable, interface java.lang.Comparable, interface java.lang.CharSequence]

	    // super 클래스를 가져온다
	    System.out.println("9. " + cls.getSuperclass()); // 9. class java.lang.Object
	}

}
