package practice_two;

/**
 * file_1
 */

class BaseClass {
    public int x = 101;
    private int y = 100;
}

public class file_1 {

    public static void main(String[] args) {
        BaseClass myObj = new BaseClass();
        System.out.println(myObj.x);
    }

}