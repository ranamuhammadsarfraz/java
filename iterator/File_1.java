package iterator;

//iterator is a object used to loop through collection, array like Array, HashSet
import java.util.ArrayList;
import java.util.Iterator;

/**
 * File_1
 */
public class File_1 {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<String>();
        myArrList.add("Milk");
        myArrList.add("Yogurt");

        Iterator<String> it = myArrList.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

// do practice whatever you have study.