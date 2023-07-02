package BasicLoops;

public class DoWhileLoop {
    /*Do While first execute something (increment or decrement) and then evaluates the condition
     *Usually values evaluated are boolean (true, or false)
     * Note that if there's no increment (i++) or decrement (i--), then will continue in an infinite loop
     */

    public static void main(String[] args) {

        int j = 20;
        do{
            j++;//first add j+1=21;
            System.out.println(j);//print current number
        }
        //evaluate the condition until is met, as a result will print all numbers from 20 to 30
        while (j <= 30);

        // if sign is inverted > then we will only get one print which is 20 +increment(+1) = 21, which was the increment execution
    }
}
