package practice;

public class file_2 {
    public static void main(String[] args) {
        String[] myArray = { "\nHello\n", "\nHye\n", "\nAsslam-o-Aliakum\n" };
        for (int i = 0; i <= myArray.length; i++) {
            System.out.println(myArray[i]);
            if (myArray[i] == myArray[1]) {
                System.out.println("Yeah reached point!");
                break;
            }
        }
    }
}