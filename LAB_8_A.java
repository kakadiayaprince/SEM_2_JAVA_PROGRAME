// Write a method for computing xy doing repetitive multiplication. X 
// and y are of type integer and are to be given as command line 
// arguments. Raise and handle exception(s) for invalid values of x 
// and y.
package WD_PROGRAMES;

public class LAB_8_A {

    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int a = 1;
            for (int i = 0; i <= y; i++) {
                
                a = a * x;
                
            }
            System.out.println("X^y=" + a);
        } catch (Exception e) {
          System.out.println( e.getMessage()); 
        }

    }

}