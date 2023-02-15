package Core_java.jay_practice.string_reverse;

// Name of the Java class
public class Using_StringBuilder {

    // Java Main method is the starting point of the java programing
    public static void main(String[] args) {
        // Declare the variable name str of the type String and initialize the value to it "I Love To Code" this is the String that we're going to reverse
       String str = "I Love To Code";

       // Declare a variable newStr name of the type StringBuilder. We are going to use StringBuilder to build the reverse version of the String
       StringBuilder newStr = new StringBuilder();

       // this for Loop will iterate at the last character of the original String "str.length() -1" to the first character "0"
       for(int i = str.length() -1; i >= 0; i--) {

           // This appends the character at index "i" from original String to the StringBuilder "newStr" character are appended in reverse order
           newStr.append(str.charAt(i));

       }

       // Creates a new variable reverseString of the type of String and assign the value of the reverse string obtained from the StringBuilder
        // toString method converts the StringBuilder content into a regular String
       String reverseString = newStr.toString();

       // Prints the reverse String to the console
       System.out.println(reverseString);

       }
}
