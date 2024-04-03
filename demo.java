import java.io.*;


public class demo {
    public static void main(String[] args) {
        String wordToReplace = "is";
        String replacementWord = "tddd"; 

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("abc.txt"));
            FileWriter fileWriter = new FileWriter("abcd.txt");
            String line;
            int replacementCount = 0;

            while ((line = fileReader.readLine()) != null) {
               
                String modifiedLine = line.replaceAll(wordToReplace, replacementWord);
                fileWriter.write(modifiedLine + "\n");
                replacementCount += line.split(wordToReplace, -1).length - 1;
            }

            fileReader.close();
            fileWriter.close();

            System.out.println("Replacements completed. Total replacements: " + replacementCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
