package enums;

/**
 * File_1
 */
// enum is a special class, unchangeable like const.
public class File_1 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myFirst = Level.LOW;
        System.out.println(myFirst);
    }
}

// do practice and start from ArrayList