

interface A {
    double constant_A = 1.0;

    void displayA();
}

interface A1 extends A {
    double constant_A1 = 2.0;

    void displaA1();
}

interface A2 extends A {
    double constant_A2 = 3.0;

    void displayA2();
}

interface A12 extends P1, P2 {
    double constant_A12 = 4.0;

    void displayP();
}

interface P1 {
    double constant_P1 = 5.0;

    void displayP1();
}

interface P2 {
    double constant_P2 = 6.0;

    void displayP2();
}

class B implements A12 {
    public void displayA() {
        System.out.println(" you called display A \n"  + constant_A12 );
    }

    public void displayP1() {

        System.out.println(" you called display P1 \n" + constant_P1);
    }

    public void displayP2() {

        System.out.println(" you called display P2 \n" + constant_P2);
    }

    public void displayP() {

        System.out.println(" you called display P");
    }
}

public class LAB_7_2 {
    public static void main(String[] args) {
        B demo=new B();
        demo.displayA();
        demo.displayP();
        demo.displayP1();
        demo.displayP2();
    }
}