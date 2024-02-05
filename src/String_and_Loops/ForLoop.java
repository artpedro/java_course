package String_and_Loops;

public class ForLoop {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < 101; i++) {
            for (int j = 10; j > 0; j--) {
                System.out.println(i + " ---- " + j);
                counter++;
            }
        }
        System.out.println("COUNTER = " +counter);
    }
}
