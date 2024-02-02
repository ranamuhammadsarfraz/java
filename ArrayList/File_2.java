package ArrayList;

import java.util.ArrayList;

public class File_2 {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Computer");
        myArrayList.add("Laptop");

        for (String e : myArrayList) {
            System.out.println(e);
        }

        System.out.println(myArrayList.get(0) + " Index 0");
        System.out.println(myArrayList.get(1) + " Index 1");
        System.out.println(myArrayList);
    }
}
