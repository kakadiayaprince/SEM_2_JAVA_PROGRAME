import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        int flag;

        while (number != 0) {
            flag = number % 10;
            sum = sum + (flag * flag * flag);
            number = (number / 10);
        }
        if (temp == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
