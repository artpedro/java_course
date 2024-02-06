package ProcessingFiles;

import java.io.*;

public class LearningFileReader {
    public static void main(String[] args) {
        File file = new File("text.txt");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading the file "+file.getName());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Unable to close file");
            } //catch (NullPointerException ex) {
              // Bad practice: better ways to handle
              // System.out.println("file was never opened" + ex);
              //}
        }
    }
}
