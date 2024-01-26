package practice;

/**
 * File_4
 */
public class File_4 {
    public String name = "Human";
    private String naxe = "evil";

    File_4(String x) { // constructor
        System.out.println(x);
    }

    void myMethod() {
        System.out.println("My Method.");
    }

    public static void main(String[] args) {
        File_4 myObj = new File_4("1: Bird"); // object is a instance of class and all data is fetched from there.
        File_4 myObj_ = new File_4("2: dog"); // 2nd object
        myObj.myMethod();
        System.out.println("Hello " + myObj.name);
        System.out.println("Hello " + myObj_.name);
    }
}

// https://www.w3schools.com/java/java_packages.asp