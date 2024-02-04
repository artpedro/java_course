package methods;

// This class does not need any main method, it won't be executed directly
public class MyUtils {
    // void methods does not return any value
    public static void showSum(int first, int second) {
        System.out.println(first + second);
    }
    // Other data-types can be defined to declare a return value
    public static int sumValues(int first, int second) {
        int sum = first + second;
        return sum;
    }
}
