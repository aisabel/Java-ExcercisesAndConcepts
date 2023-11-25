package CommonDataStructuresAndAlgorithms;

    import java.util.Stack;
    /* A stack is a data structure known as "pila" (in spanish)
       A stack is a collection of elements organized according to the principle "Last In, First Out" (LIFO)
       This means last element inserted in the list is the first one out.

       The stack data structure has the two most important operations that are push and pop.
       *Push operation: inserts an element into the stack
       *Pop operation: removes an element from the top of the stack.
       *Search operation: searches the object in the stack from the top.
       *Peek operation: looks at the element that is at the top in the stack. Just check but doesn't change any value.

       Stacks are useful in situations where you need to trace elements in a specific order:
       such as mathematical expressions, browser history, or search algorithms, graphs and tree searches

     */

    public class StackExample {
        public static void main(String[] args) {
            Stack<Integer> pila = new Stack<>();

            //Add elements to the stack
            pila.push(1);
            pila.push(2);
            pila.push(3);


            System.out.println("Last element inserted in the stack: " + pila.peek()); // Retrieve the last element inserted in the stack
            System.out.println("Current elements: " + pila);// retrieve the current stack elements
            System.out.println("Stack size: "+pila.size());

            System.out.println("=========================");
            //Remove elements from the stack (LIFO)
            int element1 = pila.pop();
            System.out.println("Last Element removed: "+element1);
            System.out.println("Current elements: " + pila);// retrieve the current stack elements

            System.out.println("=========================");
            int element2 = pila.pop();
            System.out.println("New Last Element removed: "+element2);
            System.out.println("Current elements: " + pila);// retrieve the current stack elements

            System.out.println("=========================");
            int element3 = pila.pop();
            System.out.println("Final Last Element removed: "+element3);
            System.out.println("Current elements: " + pila);// retrieve the current stack elements

            System.out.println("=========================");
            int location = pila.search(2);
            System.out.println("Search for element 2: "+location);//retrieve -1 if the element is not present,
            // otherwise it will retrieve the element position

            System.out.println("=========================");
            System.out.println("Is stack empty?:"+pila.empty());// returns a boolean value (true/false)

            System.out.println("=========================");
            pila.insertElementAt(100,0); //insert element value 100 at position 1
            System.out.println("Inserted element 100 at index 0");
            System.out.println("Current elements: "+ pila);

            System.out.println("=========================");
            System.out.println("Does the stack contains 100 value? ="+ pila.contains(100)); //check and retrieve value

            System.out.println("=========================");
            System.out.println("Remove element 100 ="+pila.remove(0));
            System.out.println("Current elements: "+ pila);
        }
    }