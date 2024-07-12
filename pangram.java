def is_pangram(input_string):
    # Create a set to track the letters of the alphabet
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    letter_count = {}

    # Count each letter in the input string
    for char in input_string.lower():
        if char in alphabet:
            letter_count[char] = True

    # Check if all letters of the alphabet are present
    for char in alphabet:
        if char not in letter_count:
            return False

    return True

# Example usage
input_string = "The quick brown fox jumps over the lazy dog"
if is_pangram(input_string):
    print(f'"{input_string}" is a pangram.')
else:
    print(f'"{input_string}" is not a pangram.')
OUTPUT:
"The quick brown fox jumps over the lazy dog" is a pangram.
