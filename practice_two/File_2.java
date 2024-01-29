package practice_two;

import java.util.Scanner;

public class File_2 {
    public static void main(String[] args) {
        String username;
        int age;
        // take input from user, name and age.
        Scanner userObj = new Scanner(System.in);

        System.out.println("\nEnter username: \n");
        username = userObj.nextLine();

        System.out.println("\nEnter your age: \n");
        age = userObj.nextInt();

        System.out.println("\nUsername: " + username);
        System.out.println("\nAge: " + age + "\n");

    }
}
