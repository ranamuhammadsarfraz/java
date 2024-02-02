package practice_two;

import java.util.Scanner;

class Visitor {
    String username;
}

public class File_5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Visitor visitorObj = new Visitor();

        System.out.println("\nName: \n");
        visitorObj.username = myScanner.nextLine();
        if (visitorObj.username.isEmpty()) {
            System.out.println("\nName: \n");
            return;
        }
        System.out.println("\n\nName: " + visitorObj.username + "\n");
    }
}
