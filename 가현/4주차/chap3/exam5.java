package chap3;

public class exam5 {

	/* 타입 안전 열거 패턴(typesafe enum pattern) */
	final class Season {
	    public static final Season SPRING = new Season("SPRING"); // 자기자신의 인스턴스를 만들어 상수화
	    public static final Season SUMMER = new Season("SUMMER");
	    public static final Season AUTUMN = new Season("AUTUMN");
	    public static final Season WINTER = new Season("WINTER");
	    
	    private String season;
	    
	    private Season(String season) {
	        this.season = season;
	    }
	    
	    public String getSeason() {
	        return season;
	    }
	}
}
