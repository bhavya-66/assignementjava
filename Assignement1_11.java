public class Assignement1_11
{


    public static void main(String[] args) {
        String str1 = "Bhavya";
        String str2 = "Davda ";

        int string1 = (int) str1.chars().distinct().count();
        int string2 = (int) str2.chars().distinct().count();
        int total = string1 + string2;

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Total number of unique characters in both strings: " + total);
    }
}
