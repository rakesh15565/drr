package drr;
public class SimpleStringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        // Length of a string
        System.out.println("Length of str1: " + str1.length());

        // Character at a specific index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // Substring
        System.out.println("Substring of str1 (1, 4): " + str1.substring(1, 4));

        // String comparison
        System.out.println("str1 equals str2: " + str1.equals(str2));

        // Convert to uppercase
        System.out.println("str1 in uppercase: " + str1.toUpperCase());

        // Convert to lowercase
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        // Replace characters
        System.out.println("Replace 'l' with 'p' in str1: " + str1.replace('l', 'p'));

        // Trim whitespace
        String str3 = "   Java Programming   ";
        System.out.println("Trimmed str3: " + str3.trim());
    }
}