import java.io.*;
import java.util.*;

public class LAB_11_PART_B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("it is a file and size of file is :" + file.length());
            } else {
                System.out.println("it is a folder");
                String[] filenames = file.list();
                for (int i = 0; i < filenames.length; i++) {
                    System.out.println(filenames[i]);
                }
            }
        } else {
            System.out.println("file  or folder was not found please try later:");
        }

    }
}
