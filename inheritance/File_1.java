package inheritance;

//Inheritance: In java developer can inherit data from a base class to main class by using 'extends' keyword. Below an example is given.

class MyClass {
    protected String name = "xyz";
}

final class ItClass { // 'final' keyword is used for class to not become inherited.
    protected String name = "xyz";
}

public class File_1 extends MyClass { // MyClass get Inherited.
    public static void main(String[] args) {
        File_1 myObj = new File_1();
        System.out.println(myObj.name);
    }
}