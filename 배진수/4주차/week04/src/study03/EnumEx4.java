package study03;

public class EnumEx4 {
    // enum 매핑 클래스
    enum Season {
        SPRING("봄"),
        SUMMER("여름"),
        FALL("가을"),
        WINTER("겨울");

        // 문자열을 저장할 필드
        private String season;

        // 생성자 (싱글톤)
        private Season(String season) {
            this.season = season;
        }

        // Getter
        public String getSeason() {
            return season;
        }
        public static void main(String[] args) throws Exception {
            Season s = Season.SUMMER;
            System.out.println(s.name()); // 열거 객체명 출력 : SUMMER
            System.out.println(s.getSeason()); // 매핑된 열거 데이터 출력 : 봄
        }
    }

}
