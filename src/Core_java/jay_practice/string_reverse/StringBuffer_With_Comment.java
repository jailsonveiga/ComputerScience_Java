package Core_java.jay_practice.string_reverse;

// The name class of this application
public class StringBuffer_With_Comment {
    // The main method is the starting point of the java programing
    public static void main(String[] args) {
        // Declare a variable name str with the type of String and assign and initialize the value to it "I Love To Code"
        String str = "I Love To Code";

        // Create an object name newStr and assign the value of str to it
        StringBuffer newStr = new StringBuffer(str);

        // Use the reverse method to reverse the StringBuffer name newStr
        newStr.reverse();

        //Declare a variable name reverseString with data type of String and assign the value of StringBuffer to it and use the toString() method to convert to String
        String reverseString = newStr.toString();

        // Display the message of the value of reverseString to the console
        System.out.println(reverseString);
    }
}
