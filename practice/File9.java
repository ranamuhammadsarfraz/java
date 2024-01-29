package practice;

class Base {
    String bike = "Honda";
}

public class File9 {
    public static void main(String[] args) {
        Base myObj = new Base();
        String bike = myObj.bike.toUpperCase();

        switch (bike) {
            case "HONDA":
                System.out.println("\nAccess Granted!\n");
                break;
            default:
                System.out.println("\nName is not verified, process cancelled\n");
        }
    }
}
