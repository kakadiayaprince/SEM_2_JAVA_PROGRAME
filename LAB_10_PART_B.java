import java.io.*;

public class LAB_10_PART_B {
    public static void main(String[] args) {

        String word1 = "Rohit";
        String word2 = "Hitman";

        try {
            File f1 = new File("abc.txt");
            File f2 = new File("xyz.txt");

            BufferedReader r1 = new BufferedReader(new FileReader(f1));
            BufferedWriter w1 = new BufferedWriter(new FileWriter(f2));

            String line = r1.readLine();
            int c = 0;

            while (line != null) {
                String changedLine = "";

                String a[] = line.split(" ");

                for (int i = 0; i < a.length; i++) {
                    if (a[i].equals(word1)) {
                        c++;
                        changedLine += word2 + " ";
                    } else {
                        changedLine += a[i] + " ";
                    }
                }

                w1.write(changedLine);
                w1.newLine();
                line = r1.readLine();
            }

            r1.close();
            w1.close();

            System.out.println("Replacements Counts: " + c);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}