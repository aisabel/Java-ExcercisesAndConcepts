package BasicLoops;

public class IfLoop {
    //If loop evaluate a condition otherwise execute the other statement

    public static void main(String[] args) {

        //condition is always met, therefore will never go to the error unless you update the sign <
        if (5 > 3) {
            System.out.println("Success 5>3");
        } else
            System.out.println("Error 5<3");


        //If inside a for loop
        //increment is i+2, which means it will evaluate 0,2,4,6
        for (int i = 0; i < 10; i = i + 2) {
            if (i == 8) {
                System.out.println("i is equal to 8:"+i);
            } else System.out.println("8 not found");
        }
    }
}
