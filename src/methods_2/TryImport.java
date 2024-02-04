package methods_2;

// Here we can import public classes from the package "methods"
// However, we cannot import HiddenUtils, because it is not a public class
import methods.MyUtils;

public class TryImport {
    public static void main(String[] args) {
        // We can access public methods
        MyUtils.showSum(21,12);

        // And create instances of the MyUtils class
        MyUtils var = new MyUtils();
        var.HelloNonStatic();
    }
}
