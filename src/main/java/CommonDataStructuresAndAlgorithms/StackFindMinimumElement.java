package CommonDataStructuresAndAlgorithms;

import java.util.Stack;

public class StackFindMinimumElement {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> temp = new Stack<>();

    public static void main(String[] args) {
        customPush(34);
        customPush(3);
        customPush(31);
        customPush(98);
        customPush(14);

        System.out.println(stack1);
        System.out.println(temp.peek() + " is the minimum element on the stack");
    }

    private static void customPush(int item) {
        stack1.push(item);
        if (temp.isEmpty()) {
            temp.push(item);
        } else if (temp.peek() > item) {
            temp.push(item);
        }
    }
}
    /* private static void customPop(){
        int item = stack1.peek();
        stack1.pop();
        if(temp.peek() == item){
            temp.pop();
        }
    }*/

