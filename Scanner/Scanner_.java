package Scanner;

import java.util.Scanner;

public class Scanner_ {
    public static void main(String[] args) {
        String username;
        Scanner myObj = new Scanner(System.in);

        System.out.println("\nEnter username: \n");
        username = myObj.nextLine();

        System.out.println("\nYour username is: " + username + " \n");
    }
}
