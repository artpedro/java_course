package methods;

public class MethodsLearn {
    // Main method is executed when the class is directly executed by Java
    public static void main(String[] args) {
        // This command is pulling the method "println" from another location: System.out
        System.out.println("Test");

        // This method is defined in this class, no need to be specified
        printWord("aaa");

        // We can pull methods from other classes using this notation:
        MyUtils.showSum(56,23);

        // Methods can return values to variables or other methods (see MyUtils for the notation):
        int sum = MyUtils.sumValues(34,12);
        System.out.println("The sum is " + sum);
    }

    // We can define new methods using this notation
    //      The terms inside of parenthesis indicate arguments' type and name
    //
    public static void printWord(String word) {
        System.out.println(word);
    }
}


