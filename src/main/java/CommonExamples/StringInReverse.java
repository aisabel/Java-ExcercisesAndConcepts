package CommonExamples;

public class StringInReverse {

    public static void main (String[] args){
        /*Quiz: read a text and print it in reverse
           Palindrome validation: compare and check if the original string is equal to the reversed string. .
           Note Palindromes are words or phrases that read the same backward and forward.

           This example also covers concepts as stringBuilder and stringBuffer

          *StringBuilder is a class in the Java API that provides a mutable sequence of characters.
              *Used for dynamic string manipulation, such as building strings from many smaller strings
                or appending new characters to an existing string.
              *StringBuilder is not thread safe, which means it makes multiple programs make multiple modifications at the same time.
              *It's not synchronized and its faster.

          *StringBuffer makes the string mutable, which has the possibility to append, update, change,etc.
           is tread safe, and it's slower.
           But it supports concurrency and run multiple test in parallel.
         */

        String text = "aisabel";
        StringBuilder concatString = new StringBuilder();//StringBuilder

        //For loop initialize i variable, counts the size of string, and iterate until 'i' is higher or equal than zero
        for(int i=text.length()-1; i>=0; i--){
            //Read the text and go throw the loop printing each character from the last to the first one
            //The charAt() method returns the character contained at the specified index in a string.
            // The index of the first character is 0, the second character is 1, etc
            System.out.println(text.charAt(i));

            //Adds whatever content is in 'i' to concatString variable
            concatString.append(text.charAt(i));
        }

        //prints result of string concatenated and reversed
        System.out.println("Result concatenated reversed string: "+concatString);

        //Validation to check if reversed text is equal to original text
        //equals operator checks for content is true, if used == then the result of validation will be false
        if (concatString.toString().equals(text)){
            System.out.println("Text is a palindrome word");
            //Note: Palindromes are words or phrases that read the same backward and forward.

        } else System.out.println("Text is not a palindrome word");


        //Another way to reverse a string is as follows:
        /*StringBuffer makes the string mutable, which has the possibility to append, update, change,etc*/
        String otherText = "otherReverseMethod";
        StringBuffer concatOtherString = new StringBuffer(otherText);

        System.out.println("This is other way to reverse a string: "+concatOtherString.reverse());

        /*StringBuffer object also accepts other string mutations, like below examples:

            *Insert: where we add other text to the existing string, setting the starting position*/
        System.out.println("Insert text: "+concatOtherString.insert(2, "InsertTxt"));

        /* Replace: where we replace text in the existing string, setting starting and end position*/
        System.out.println("Replace text: "+concatOtherString.replace(2, 12, "ReplaceTXT"));

        /* Delete: where we delete text in the existing string, setting starting and end position*/
        System.out.println("Delete text: "+concatOtherString.delete(12, 14));

    }
}
