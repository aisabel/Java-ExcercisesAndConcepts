package otherExcercises;

import java.util.Stack;

    public class ArrayMissingBrackets {
        /* Quiz: find missing brackets in the array
            Solution:
            Initialize a (stack) to trace the open characters ((, [, {).
            Check every expression in the array and every character in the expression,
            Verify if is an open character or a close character.
            If is an opening character add it to the stack
            If is a closing character, verify if the stack is empty.
            If the stack is empty, it means there's a missing opening character.
            If is not empty, verify if the character on top of the stack match with the closing character.
            If it matches, then remove the opening character of the stack.
            At the end of every expression, verify if the stack is empty.
            If is empty it means all the parenthesis, open brackets and curly braces are balanced.
            If is not empty, it means there's missing one closing character at least
         */

        public static void main(String[] args) {
            String[] arrExpressions = {
                    "(a + b) = c",
                    "a + (b * (c + d)",
                    "(11 + 3) - (5 - 2) = (5 * 2)",
                    "[A-z][0-9](.)]",
                    "{1, 2, 3}.contains[1] = true",
                    "[[]]()",
                    "((((()))))",
                    "{{{}}}}"
            };

            //for loop with String 'expression' which is the boolean and 'arrExpressions' which is the array
            for (String expression : arrExpressions) {
                //if structure is calling to the private method and sending the expression result
                if (areBracketsBalanced(expression)) {
                    System.out.println("Balanced expression: " + expression);
                } else {
                    System.out.println("Expression with missing brackets: " + expression);
                }
            }
        }

        private static boolean areBracketsBalanced(String expression) {
            Stack<Character> stack = new Stack<>();

            for (char c : expression.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    if (stack.isEmpty()) {
                        return false; // Missing an opening character
                    }
                    char top = stack.pop();
                    if (!isMatchingPair(top, c)) {
                        return false; // No match with the opening character
                    }
                }
            }

            return stack.isEmpty(); //if the stack is empty, the expression is balanced
        }

        private static boolean isMatchingPair(char open, char close) {
            return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
        }
    }


