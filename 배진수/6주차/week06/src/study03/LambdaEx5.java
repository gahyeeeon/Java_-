package study03;

import java.util.stream.IntStream;

public class LambdaEx5 {
    public static void main(String[] args) {

        // 람다식 stream 순회 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
        long startTime = System.nanoTime(); // 코드 시작 시간

        IntStream.range(0,10000).forEach((value) -> {});

        long endTime = System.nanoTime(); // 코드 끝난 시간
        long durationTimeSec = endTime - startTime;
        System.out.println("람다식 stream 순회 : " + durationTimeSec + "n/s");


        // 일반 for문 순회 ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
        startTime = System.nanoTime(); // 코드 시작 시간

        for(int i=0; i<10000; i++){
        }

        endTime = System.nanoTime(); // 코드 끝난 시간
        durationTimeSec = endTime - startTime;
        System.out.println("일반 for문 순회 : " + durationTimeSec + "n/s");
    }
}
