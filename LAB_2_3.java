import java.util.Scanner;
public class LAB_2_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter frist element:");
        int a=sc.nextInt();
        System.out.println("enter second element:");
        int b=sc.nextInt();
        System.out.println("enter frist oprator:");
        char ch=sc.nextLine().charAt(0);
        switch(ch){
            case '+':System.out.println("addtion = "+(a+b));
            break;
            case '-':System.out.println("subtration = "+(a-b));
            break;
            case '*':System.out.println("multiplcation = "+(a*b));
            break;          
            case '/':System.out.println("devition = "+(a/b));
            break;
        }
    }
}

