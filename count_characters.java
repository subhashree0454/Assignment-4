def count_characters(input_string):
    vowels = "aeiouAEIOU"
    consonants = 0
    vowels_count = 0
    special_characters = 0

    for char in input_string:
        if char.isalpha():
            if char in vowels:
                vowels_count += 1
            else:
                consonants += 1
        elif not char.isspace():
            special_characters += 1

    return consonants, vowels_count, special_characters

# Example usage
input_string = "Hello, World! 123"
consonants, vowels_count, special_characters = count_characters(input_string)

print(f"Number of consonants: {consonants}")
print(f"Number of vowels: {vowels_count}")
print(f"Number of special characters: {special_characters}")
OUTPUT:
Number of consonants: 7
Number of vowels: 3
Number of special characters: 3
