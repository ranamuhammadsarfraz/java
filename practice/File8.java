package practice;

/**
 * File8
 */
// ternary operator
public class File8 {
    public static void main(String[] args) {
        String[] myLogic = { "hello", "hi", "AsslamOAliakum" };
        String word = myLogic[1];
        System.out.println((word == myLogic[0]) || (word == myLogic[1]) || (word == myLogic[2]) ? "Yeah it is Greeting."
                : "Not greeting, take cover.");
    }
}