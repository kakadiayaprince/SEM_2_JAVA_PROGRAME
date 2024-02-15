import java.util.Scanner;
public class LAB_3_2_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
         int b=sc.nextInt();
          int c=sc.nextInt();
          if(a>b){
            if (a>c){
                System.out.println("a is bigger");
                }
            System.out.println("c is bigger");
          }
          if (b>c){
            System.out.println("bis bigger");
          }
          else{
            System.out.println("c is bigger2");
        }
    }
    
}

