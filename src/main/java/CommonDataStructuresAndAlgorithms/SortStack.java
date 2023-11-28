package CommonDataStructuresAndAlgorithms;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();

        stack1.push(34);
        stack1.push(3);
        stack1.push(31);
        stack1.push(98);
        stack1.push(14);

        System.out.println("Original stack "+ stack1);
        System.out.println("Sorted stack "+SortingStack(stack1));
    }

    private static Stack<Integer> SortingStack(Stack<Integer> stack1){
        Stack<Integer> temp = new Stack<>();
        while(!stack1.isEmpty()){
            int item = stack1.pop();

                while(!temp.isEmpty() && temp.peek() > item) {
                    int item2 = temp.pop();
                    stack1.push(item2);
                }
                temp.push(item);
            }
            return temp;
        }

}
