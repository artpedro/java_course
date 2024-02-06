package ProcessingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hi");

        // # in = inputStream
        // # Scanner able to receive input from cli and files
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter some text: ");
        //String enteredText = input.nextLine();
        // System.out.println(enteredText);

        // try does try to execute the body of code,
        // if it encounters an error, goes to the catch block;
        try {
            File file = new File("text.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        // catch catches the Exception and do something

        FileUtils utils = new FileUtils();
        try {
            System.out.println(utils.subtract10FromLargerNumber(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
