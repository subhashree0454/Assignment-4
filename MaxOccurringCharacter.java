import java.util.HashMap;

public class MaxOccurringCharacter {
    public static char getMaxOccurringCharacter(String input) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count each character in the string
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum count
        char maxChar = ' ';
        int maxCount = 0;
        
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                maxCount = charCount.get(c);
                maxChar = c;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String input = "character"; // Change this to test other strings
        char maxChar = getMaxOccurringCharacter(input);
        System.out.println("The maximum occurring character is: " + maxChar);
    }
}
OUTPUT:
The maximum occurring character is: c
The maximum occurring character is: l
