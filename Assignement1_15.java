import java.util.Arrays;

class Assignement1_15 {
    public static void main(String[] args) {
        String inputString = "itsbhavyadb";
        String sortedString = sortString(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }

    public static String sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
