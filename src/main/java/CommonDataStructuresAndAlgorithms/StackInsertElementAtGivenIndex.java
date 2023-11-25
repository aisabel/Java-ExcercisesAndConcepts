package CommonDataStructuresAndAlgorithms;

import java.util.Stack;

public class StackInsertElementAtGivenIndex {
    public static void main(String[] args){
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> temp = new Stack<Integer>();
        int index =3; //index where the value will be inserted
        int val = 10; //value to be inserted

        stack1.push(34);
        stack1.push(3);
        stack1.push(31);
        stack1.push(98);
        stack1.push(14);

        System.out.println("Original stack: "+stack1);

        //for look iterates until finding desired index which is 3
        for (int i = 1; i <= stack1.size() - index + 1; i++) {
            int item = stack1.peek();
            temp.push(item);//push peek element into the temporary stack
            stack1.pop();//remove last peeked element from original stack
        }
        System.out.println("Temporary stack:"+temp);

        stack1.push(val); //insert the value at the top of the original stack

        //while loop grabs the elements in the temporary stack and insert them back in the original stack
        while (!temp.empty()) {
            int item = temp.peek();
            stack1.push(item);
            temp.pop();
        }
        System.out.println("Stack with inserted value 10 at index 3: "+stack1);

    }
}

