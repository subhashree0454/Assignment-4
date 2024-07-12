def are_anagrams(str1, str2):
    # Remove spaces and convert to lowercase
    str1 = str1.replace(" ", "").lower()
    str2 = str2.replace(" ", "").lower()

    # Check if lengths are the same
    if len(str1) != len(str2):
        return False

    # Create a frequency dictionary for each string
    char_count = {}

    # Count characters in the first string
    for char in str1:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1
    # Subtract counts using the second string
    for char in str2:
        if char in char_count:
            char_count[char] -= 1
        else:
            return False

    # Check if all counts are zero
    for count in char_count.values():
        if count != 0:
            return False

    return True

# Example usage
str1 = "listen"
str2 = "silent"
if are_anagrams(str1, str2):
    print(f"{str1} and {str2} are anagrams.")
else:
    print(f"{str1} and {str2} are not anagrams.")
OUTPUT:
listen and silent are anagrams.

