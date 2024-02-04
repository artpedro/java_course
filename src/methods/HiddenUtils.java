package methods;

// Classes can be "private" too
// This class will only be accessible in this package ("methods") because it lacks a public modifier
class HiddenUtils {
    public static void secretMethod() {
        System.out.println("This method is only accessible in \"methods\" package");
    }
}
