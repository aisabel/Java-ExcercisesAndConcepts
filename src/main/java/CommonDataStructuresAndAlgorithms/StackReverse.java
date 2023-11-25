package CommonDataStructuresAndAlgorithms;

import java.util.Stack;

public class StackReverse {
    //Reverse a stack using temporary stacks
    public static void main(String[] args){
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<Integer> stack3 = new Stack<Integer>();

        System.out.println("Is stack empty? "+stack1.empty());
        stack1.push(34);
        stack1.push(3);
        stack1.push(31);
        stack1.push(98);
        stack1.push(14);
        System.out.println("Original stack"+stack1);
        moveStack(stack1, stack2);
        moveStack(stack2, stack3);//stack2 and stack3 are temporary stacks
        moveStack(stack3, stack1);
        System.out.println("Reversed stack"+stack1);
    }

    private static void moveStack(Stack<Integer> source, Stack<Integer> destination){
    //destination and source to make it generic and reusable
        while(!source.empty()){
            int item = source.peek(); //retrieves the last item in the source stack
            destination.push(item); //push the retrieved item into the destination stack
            source.pop();
        }
    }
}
