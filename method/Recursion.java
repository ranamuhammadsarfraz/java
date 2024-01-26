package method;

/**
 * Recursion mean function or method calling itself.
 */
public class Recursion {
    public static void main(String[] args) {
        int result = myMethod(12, 13);
        double result_ = myMethod(101.11, 200.22);
        System.out.println(result);
        System.out.println(result_);
    }

    // Method overloading that mean method with same name having different variable.
    static int myMethod(int x, int y) {
        return x + y;
    }

    static double myMethod(double a, double c) {
        return a + c;
    }
}

// start from java class