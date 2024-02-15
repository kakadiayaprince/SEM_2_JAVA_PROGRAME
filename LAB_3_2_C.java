import java.util.Scanner;
public class LAB_3_2_C {
       public static void main(String[] args) {
           int flag=0;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter number:-");
           int a=sc.nextInt();
           for(int i=2;i<=Math.sqrt(a);i++){
              if(a%i==0){
               flag=1;
               break;
              }         
           }
            if(flag==1){
               System.out.println(" not prime number");
              }
              else{
               System.out.println("prime number");
              }
       }   
   }

