import java.util.Scanner;
public class CricleArea {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a radius :");
        double  radius=sc.nextDouble();
        double ans=Math.PI*radius*radius;
        System.out.print("your area is :" + ans);
    }
}
