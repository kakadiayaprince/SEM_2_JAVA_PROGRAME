import java.util.Scanner;
public class trianglediamond{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number of rows: ");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= n - i; j--) {
                System.out.print(" ");
            }
            for (int k = n-1; k >= i; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
