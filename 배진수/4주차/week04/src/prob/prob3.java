package prob;
public class prob3 {
    public enum Season {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void main(String[] args) {
        for (Season season : Season.values()) {
            printSeason(season);
        }
    }

    public static void printSeason(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Spring");
                break;
            case SUMMER:
                System.out.println("Summer");
                break;
            case FALL:
                System.out.println("Fall");
                break;
            case WINTER:
                System.out.println("Winter");
                break;
        }
    }
}
