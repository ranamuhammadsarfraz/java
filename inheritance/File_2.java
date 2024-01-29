package inheritance;

class BaseClass {
    public String[] myArrString = { "How are you?", "App kasay ho?" };
    private boolean[] myArrBoolean = { true, false };
    protected int[] myArrInt = { 1, 2, 3 };
}

class NextBaseClass extends BaseClass {
    protected double[] myArrDouble = { 101.11d, 202.22d };
    public float[] myArrFloat = { 101.1f, 202.2f };
    protected char[] myArrChar = { 'a', 'b', 'c' };
}

public class File_2 extends NextBaseClass {
    public static void main(String[] args) {
        File_2 myObj = new File_2();
        for (int i = 0; i <= myObj.myArrString.length; i++) {
            System.out.println("\n" + myObj.myArrString[i] + "\n");
            System.out.println("\n" + myObj.myArrInt[i] + "\n");

            System.out.println("\n" + myObj.myArrDouble[i] + "\n");
            System.out.println("\n" + myObj.myArrFloat[i] + "\n");
            System.out.println("\n" + myObj.myArrChar[i] + "\n");
        }
    }
}
