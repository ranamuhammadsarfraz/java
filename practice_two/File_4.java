package practice_two;

class UpperClass {
    String title = "xyz";

    class InnerClass {
        String title = "zyx";
    }

    static class InnerClass_ {
        String title = "abc";
    }
}

public class File_4 {
    public static void main(String[] args) {
        UpperClass myObj = new UpperClass(); // upperclass obj
        UpperClass.InnerClass myObj2 = myObj.new InnerClass(); // innerclass obj
        UpperClass.InnerClass_ myObj3 = new UpperClass.InnerClass_(); // innerclass_ with static keyword

        System.out.println(myObj.title);
        System.out.println(myObj2.title);
        System.out.println(myObj3.title);
    }
}
