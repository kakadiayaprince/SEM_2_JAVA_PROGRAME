
import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= number; i++) {
            ans = ans + (i * (i + 1)) / 2;
        }
        System.out.print("your answer is :" + ans);
    }
}
