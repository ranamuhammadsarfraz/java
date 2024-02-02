package HashSet;

//HashSet is an array defined in java.util that out is unique.
import java.util.HashSet;

public class FIle_1 {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<String>();
        myHashSet.add("Car");
        myHashSet.add("Bus");
        myHashSet.add("Bike");
        myHashSet.add("Car");
        myHashSet.add("Bus");
        myHashSet.add("Bike");

        System.out.println(myHashSet);

        myHashSet.clear();
        System.out.println(myHashSet);

    }
}
