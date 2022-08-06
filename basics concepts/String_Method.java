public class String_Method {
    public static void main(String[] args) {
        // String = a reference data type that stores a sequence of characters

        // ! 1. String is immutable
        // ! 2. String is not a primitive data type

        String name = "John";
        String name2 = new String("John");

        boolean isEqual = name.equals(name2); // ! returns true if both strings are equal

        int length = name.length(); // ! returns the length of the string

        char charAt = name.charAt(0); // ! returns the character at the specified index

        String substring = name.substring(0, 3); // ! returns a substring of the string

        String toUpperCase = name.toUpperCase(); // ! returns a string with all characters in uppercase

        String toLowerCase = name.toLowerCase(); // ! returns a string with all characters in lowercase

        String Food = "Grapes";

        String NewFood = Food.replace('G', 'P'); // ! replaces the first occurrence of the specified character with the
                                                 // specified character

    }
}
