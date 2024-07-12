def is_palindrome(input_string):
    # Check if the string is the same forwards and backwards
    return input_string == input_string[::-1]

# Example usage
input_string = "2552"
if is_palindrome(input_string):
    print(f"{input_string} is a palindrome.")
else:
    print(f"{input_string} is not a palindrome.")
OUTPUT:
2552 is a palindrome.
