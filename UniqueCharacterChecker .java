import java.util.HashSet;

public class UniqueCharacterChecker {
    public static boolean hasAllUniqueCharacters(String input) {
        // Create a HashSet to store characters
        HashSet<Character> charSet = new HashSet<>();

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            // If the character is already in the set, it's not unique
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "abcdefg"; // Change this to test other strings
        if (hasAllUniqueCharacters(input)) {
            System.out.println(input + " contains all unique characters.");
        } else {
            System.out.println(input + " does not contain all unique characters.");
        }
    }
}
OUTPUT:
abcdefg contains all unique characters.
hello does not contain all unique characters.
