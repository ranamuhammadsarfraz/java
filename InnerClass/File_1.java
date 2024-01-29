package InnerClass;

/**
 * File_1
 */
// InnerClass mean, a object of class inside a class. It is also known as
// nesting of classes.

class OuterClass {
    int x = 101;

    class InnerClass {
        int y = 1001;
    }

    static class SecondInnerClass { // with 'static' keyword you can access it without creating outer class object.
        int z = 10001;
    }
}

public class File_1 {

    public static void main(String[] args) {
        OuterClass myOuterClass = new OuterClass();
        System.out.println(myOuterClass.x + " OuterClass\n");

        OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();
        System.out.println(myInnerClass.y + " InnerClass\n");

        // with static keyword
        OuterClass.SecondInnerClass mySecondInnerClass = new OuterClass.SecondInnerClass();
        System.out.println(mySecondInnerClass.z + " With static keyword, second inner class\n");

    }
}

// do practice and start from Abstraction