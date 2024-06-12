import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter days :");
        int day = sc.nextInt();

        int year = day / 365;
        int newyear = year % 365;
        int week = day / 7;
        int newweek = day % 7;
        int newday = day % 7;

        System.out.println("days =" + newday);
        System.out.println("week =" + newweek);
        System.out.println("year =" + newyear);
        System.out.println(newyear + ":" + newweek + ":" + newday);
    }
}
