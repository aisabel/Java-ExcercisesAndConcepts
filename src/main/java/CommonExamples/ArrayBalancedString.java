package CommonExamples;

import java.util.ArrayList;

/**
 *
 * EXPLANATION:
 * 1) The coding exercise consist on validating whether a given string has balanced parenthesis or not
 * 2) Output MUST be similar to example below
 * 3) You cannot erase anything that's already part of the exercise (main class, main method, helper method)
 *      - You'll need to uncomment the helper method
 * 4) No restrictions on the amount/names of private methods you can create within the class, as long as names are descriptive or JDoc is included
 */

public class ArrayBalancedString {

    /**
     * Main, executable method
     * THIS METHOD SHOULD PRINT ALL EXPECTED OUTPUT
     * @param args
     */
    public static void main(String args[]) {
        String[] arrExpressions = {
                "(a + b) = c",
                "a + (b * (c + d)",
                "(11 + 3) - (5 -2) = (5 * 2)",
                "[A-z][0-9](.)]",
                "{1, 2, 3}.contains[1] = true",
                "[[]]()",
                "((((()))))",
                "{{{}}}}"
        };


        /*
        System.out.println("Let's begin...");
        ArrayList<String> al = new ArrayList<>();
        StringBuffer findString = new StringBuffer(arrExpressions);

        for (int i = 0; i < arrExpressions.length; i++) {
            al.add(arrExpressions[i]);
            boolean expression = false;
            int k=0; // for every loop key value reset

            if (!al.contains(arrExpressions[i]))
            {
                al.add(arrExpressions[i]);
                k++;

                for(int j=i+1; j<arrExpressions.length; j++){
                    if (arrExpressions[i]== arrExpressions[j]) {
                        k++;
                    }
                }
                System.out.println("i value ="+a[i]+" is repeated "+k+"times");



            if(arrExpressions[i].indexOf("(") && arrExpressions[i].indexOf(")")){
                //boolean expression = true;

                if (arrExpressions[i].contains("[") && arrExpressions[i].contains("]")) {
                //boolean expression = true;
                    if (arrExpressions[i].contains("{") && arrExpressions[i].contains("}")) {
                //boolean expression = true;
            }
            else
                    System.out.println("Unbalanced");
                    //boolean expression = false;
            }
            */

        //System.out.println("Balanced"+ expressionList);
        }

    /*
     * Helper method to validate string for balanced parenthesis
     *  - MUST NOT MODIFY METHOD SIGNATURE!
     * @param   expression    The string expression to validate
     * @return                Boolean flag on whether parenthesis are balanced or not
     */
    private static boolean isBalanced(String expression) {
        // return true or false depending on the expression validated
        return true;

    }

    // YOU CAN ADD MORE PRIVATE METHODS HERE!

}

/*
 * EXPECTED OUTPUT WHEN MAIN IS EXECUTED:
 * =======================================
 * Parenthesis within string --> |(a + b) = c                   | --> [BALANCED]
 * Parenthesis within string --> |a + (b * (c + d)              | --> [UNBALANCED]
 * Parenthesis within string --> |(11 + 3) - (5 - 2) = (5 * 2)  | --> [BALANCED]
 * Parenthesis within string --> |[A-z][0-9](.)]                | --> [UNBALANCED]
 * Parenthesis within string --> |{1, 2, 3}.contains[1] = true  | --> [BALANCED]
 * Parenthesis within string --> |[[]]()                        | --> [BALANCED]
 * Parenthesis within string --> |((((()))))                    | --> [BALANCED]
 * Parenthesis within string --> |{{{}}}}                       | --> [UNBALANCED]
 */




