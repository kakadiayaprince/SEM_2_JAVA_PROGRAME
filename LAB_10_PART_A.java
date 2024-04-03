import java.io.*;

public class LAB_10_PART_A {
    public static void main(String[] args) {
        try {
            File inputFile = new File("abc.txt");         
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            int wordCount = 0;
            int characterCount = 0;
            int lineCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                    lineCount++;                 
                    characterCount += line.length();
                    String[] words = line.split(" ");
                    wordCount += words.length;
              
            }
         
            bufferedReader.close();
            System.out.println("Total word count: " + wordCount);
            System.out.println("Total number of lines: " + lineCount);
            System.out.println("Total number of characters: " + characterCount);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
