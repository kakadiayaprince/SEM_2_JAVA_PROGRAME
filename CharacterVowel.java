import java.util.Scanner;

public class CharacterVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a chracter :");
        char chracter = sc.next().charAt(0);
        if (chracter == 'a' || chracter == 'e' || chracter == 'i' || chracter == 'o' || chracter == 'u'
                || chracter == 'A' || chracter == 'E' || chracter == 'I' || chracter == 'O' || chracter == 'U') {
            System.out.println(chracter + " is vowel");
        } else {
            System.out.println(chracter + " is consunant");
        }
    }
}
