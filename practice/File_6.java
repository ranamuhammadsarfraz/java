package practice;

class DataStore {
    int id = 1001;
    String utillity = "terminal";
}

public class File_6 {
    public static void main(String[] args) {
        DataStore myObj = new DataStore();

        if (myObj.id != 101) {
            System.out.println("\nUser does not exist.\n");
        } else {
            System.out.println("\nWelcome!\n");
        }

    }
}