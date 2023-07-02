package BasicLoops;

public class WhileLoop {
    /*While loop execute If the condition is satisfied, then will execute the loop otherwise will break
     *Usually values evaluated are boolean (true, or false)
     * Note that if there's no increment (i++) or decrement (i--), then will continue in an infinite loop
     */

    public static void main(String[] args) {

        int i = 30;
        while (i <= 40) {
            System.out.println(i);
            i++; //i will increment by one value
        }
    }
}
