import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter second :");
        int second = sc.nextInt();

        int minute = second / 60;
        int newminute = minute % 60;
        int newsecond = second % 60;
        int hour = newminute / 60;

        System.out.println("second =" + newsecond);
        System.out.println("minutes =" + newminute);
        System.out.println("hour =" + hour);
        System.out.println(hour + ":" + newminute + ":" + newsecond);

    }
}
