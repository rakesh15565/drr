public class SimpleStringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

         
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        
        System.out.println("Length of str1: " + str1.length());

        
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

    
        System.out.println("Substring of str1 (1, 4): " + str1.substring(1, 4));

        
        System.out.println("str1 equals str2: " + str1.equals(str2));

        
        System.out.println("str1 in uppercase: " + str1.toUpperCase());

        
        System.out.println("str2 in lowercase: " + str2.toLowerCase());

        
        System.out.println("Replace 'l' with 'p' in str1: " + str1.replace('l', 'p'));

        String str3 = "   Java Programming   ";
        System.out.println("Trimmed str3: " + str3.trim());
    }
}