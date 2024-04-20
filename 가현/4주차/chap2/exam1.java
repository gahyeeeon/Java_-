package chap2;

public class exam1 {
    public static void main(String[] args) {
        // matches (일치하는지 확인)
        String txt = "123456";
        boolean result1 = txt.matches("[0-9]+"); // 숫자로 이루어져 있는지
        System.out.println(result1); // true
        
        
     // replaceAll (정규표현식과 일치하는 모든 값 치환)
        String txt2 = "power987*-;";
        String result2 = txt2.replaceAll("[^a-z0-9]","0"); // 영문자와 숫자를 제외한 문자를 모두 0으로 치환
        System.out.println(result2); // power987000
        
        
     // split (정규표현식과 일치하는 값 기준으로 나누기)
        String txt3 = "power987*-;";
        String[] txts = txt3.split("[0-9]+"); // 숫자부분을 기준으로 분할
        System.out.println(txts[0]); // power
        System.out.println(txts[1]); // *-;
    }
}
