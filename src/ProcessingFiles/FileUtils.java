package ProcessingFiles;

public class FileUtils {

    // Creating a method which throws an Exception
    public int subtract10FromLargerNumber(int number) throws Exception {
        if (number < 10) {
            throw new FooRuntimeException("The number is to small");
        }
        return number - 10;
    }
    // Defining a new Exception to my program
    //      It's better to define this in a different package
    public class FooRuntimeException extends Exception {
        public FooRuntimeException(String message) {
            super(message);
        }
    }
}
