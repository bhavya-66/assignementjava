import java.util.HashSet;

public class UniqueCharactersCounter {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        int string1 = (int) str1.chars().distinct().count();
        int string2 = (int) str2.chars().distinct().count();
        int total = string1 + string2;

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Total number of unique characters in both strings: " + total);
    }
}
