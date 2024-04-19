package ex29;

public class StringRegEx {
    public static void main(String[] args) {
        // matches() 일치하는지 확인
        String txt1 = "123456";
        // 숫자들로 이루어져있는지
        boolean result1 = txt1.matches("[0-9]+");
        System.out.println(result1);

        // replaceAll() 정규표현식과 일치하는 모든 값 치환
        String txt2 = "power987*-;";
        // 숫자와 알파벳소문자를 제외하고 0으로 치환
        String result2 = txt2.replaceAll("[^a-z0-9]", "0");
        System.out.println(result2);

        // split() 정규표현식과 일치하는 값 기준으로 나누기
        String txt3 = "power987*-;";
        String[] result3 = txt3.split("[0-9]+"); // 숫자부분을 기준으로 분할
        System.out.println(result3[0]); // power
        System.out.println(result3[1]); // *-;
    }
}
