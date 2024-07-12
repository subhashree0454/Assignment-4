def find_duplicates(input_string):
    # Dictionary to count occurrences of each character
    char_count = {}
    
    # Count each character in the string
    for char in input_string:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1

    # Print characters that occur more than once
    duplicates = [char for char, count in char_count.items() if count > 1]
    
    return duplicates

# Example usage
input_string = "programming"
duplicates = find_duplicates(input_string)
print("Original String:", input_string)
print("Duplicate characters:", duplicates)
OUTPUT:
Original String: programming
Duplicate characters: ['r', 'g', 'a']
