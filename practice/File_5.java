package practice;

class BaseClass {
    // dummy intro
    public String name = "Mr XYZ", city = "xyz", country = "xyz";
    public int age = 3;
    private int id = 101;
    protected int id_ = 1001;
}

public class File_5 {
    public static void main(String[] args) {
        BaseClass myObj = new BaseClass();
        System.out.println("--------------------------");
        System.out.println("                          ");
        System.out.println("\nName: " + myObj.name + "\n");
        System.out.println("\nAge: " + myObj.age + "\n");
        System.out.println("                          ");
    }
};