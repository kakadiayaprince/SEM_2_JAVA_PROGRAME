import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter diamond directory number:-");
        int n=sc.nextInt();
        for(int i = 0;i<=n;i++) {
            for(int j = 0;j<=i;j++) {
                System.out.print(" *");
            }
            System.out.println();   
    }
       for(int i = 0;i<=n;i++) {
         for(int j = n-1;j>=i;j--) {
            System.out.print(" *");
        }
        System.out.println();
    }
  }
}