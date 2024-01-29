package practice_two;

import java.util.Scanner;

/**
 * File_3
 */
// take input as user credential by using Scanner library and give output later.

class UserContainer { // base class
    public String username, country, city;
    public int age;
}

public class File_3 { // main class
    public static void main(String[] args) {

        Scanner userScan = new Scanner(System.in);
        UserContainer userObj = new UserContainer();

        //
        System.out.println("\nUsername: \n");
        userObj.username = userScan.nextLine();
        if (userObj.username.isEmpty()) {
            System.out.println("Username not provided.");
            return;
        }
        System.out.println("\nCountry: \n");
        userObj.country = userScan.nextLine();
        if (userObj.country.isEmpty()) {
            System.out.println("Country not provided.");
            return;
        }
        System.out.println("\nCity: \n");
        userObj.city = userScan.nextLine();
        if (userObj.city.isEmpty()) {
            System.out.println("City not provided.");
            return;
        }
        System.out.println("\nAge: \n");
        userObj.age = userScan.nextInt();
        if (userObj.age > 200 || userObj.age <= 1) {
            System.out.println("Age not valid!.");
            return;
        }
        if (userObj.age < 18) {
            System.out.println("Under age not allowed.");
            return;
        }

        System.out.println("************************************");
        System.out.println("\nUser detail is: \n");
        System.out.println("\nusername: " + userObj.username + "\n");
        System.out.println("\ncity: " + userObj.city + "\n");
        System.out.println("\ncountry: " + userObj.country + "\n");
        System.out.println("\nAge: " + userObj.age + "\n");
        System.out.println("************************************");
        //
    }

}