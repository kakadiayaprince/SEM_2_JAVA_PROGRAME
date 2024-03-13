import java.util.Scanner;

public class LAB_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter color of potato :-");
        String Potatocolor = sc.nextLine();
        Potato potato = new Potato(Potatocolor);
        System.out.println(potato);

        System.out.println("enter color of  Brinjal:-");
        String Brinjalcolor = sc.nextLine();
        Brinjal brinjal = new Brinjal(Brinjalcolor);
        System.out.println(brinjal);

        System.out.println("enter color of  Tomato:-");
        String Tomatocolor = sc.nextLine();
        Tomato tomato = new Tomato(Tomatocolor);
        System.out.println(tomato);
    }
}

abstract class vegetable {
    String color;
    String name;

    vegetable(String color) {
        this.color = color;
    }

    public String toString() {
        return "vegetable color is:-" + color;
    }
}

class Potato extends vegetable {
    Potato(String a) {
        super(a);
    }
}

class Brinjal extends vegetable {
    Brinjal(String a) {
        super(a);
    }
}

class Tomato extends vegetable {
    Tomato(String a) {
        super(a);
    }
}