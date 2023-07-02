package CommonExamples;

public class StringsUsage {
    public static void main(String[] args) {

        //String : it is one of the prebuilt class in java
        /* There are two ways to define string:
           1.String literal:
                Example: String a = "helloWorld";
              *if there will be another String b="helloWorld", java will still point to variable a,
                so it will not create another string. Therefore there's only one memory creation, not two.
              *String literal is immutable, which means there's not possibility to concatenate or perform any operation on it

           2.String by creating object of string, that allocate space in memory
                Example: String ab = new String("hello");
                *With this object creation we can have as many objects as we want to, and will not be overwritten.
         */

        String a = "helloWorld";//This is a string  literal

        System.out.println("Size of the string: "+a.length() +" characters");
        System.out.println("Index in position 5: "+a.charAt(5));
        System.out.println("Index of letter e: "+a.indexOf("e"));
        System.out.println("Print substring from position 5 to 10: "+a.substring(5, 10));
        System.out.println("Print substring from position 5 and forward: "+a.substring(5));
        System.out.println("Concatenate other text: "+a.concat("-java example"));

        //The trim() method removes whitespace from both ends of a string.
        //Note: In this case there's no spaces, so it just return the existing text
        System.out.println(a.trim());
        System.out.println("Print text in upperCase: "+a.toUpperCase());
        System.out.println("Print text in lowerCase: "+a.toLowerCase());

        // split array from the part where W is found
        String[] arr = a.split("W");
        System.out.println("Print the first part of the array: "+arr[0]);
        System.out.println("Print the second part of the array: "+arr[1]);

        System.out.println("Replace letters: "+a.replace("World", "User"));

    }
}