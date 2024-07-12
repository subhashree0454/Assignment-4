def remove_duplicates(input_string):
    # Create an empty string to store the result
    result = ""
    # Iterate over each character in the input string
    for char in input_string:
        # If the character is not already in the result, add it
        if char not in result:
            result += char
    return result

# Example usage
input_string = "programming"
output_string = remove_duplicates(input_string)
print("Original String:", input_string)
print("String after removing duplicates:", output_string)
OUTPUT:
Original String: programming
String after removing duplicates: progamin
