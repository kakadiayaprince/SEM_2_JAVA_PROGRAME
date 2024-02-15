import java.util.Scanner;
public class LAB_2_5 {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter  an Fahrenheit:");
        double a=sc.nextDouble();
        double b=((a-32)*(5))/9;
        System.out.println(b);
    }  
}

