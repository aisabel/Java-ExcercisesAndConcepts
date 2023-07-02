package CommonExamples;

public class SwapNumbers {
    public static void main(String[] args) {
        //Quiz: swap numbers

        //Swap numbers in the basket using a temporary variable
        int basketA = 5;
        int basketB = 4;
        int swapTemp;
        swapTemp = basketA;
        basketA = basketB;
        basketB = swapTemp;
        System.out.println("a= " + basketA + " b=" + basketB + " swapTemp=" + swapTemp);

        //swap (fruits) without using a temporary variable
        int apples = 5;
        int berries = 4;
        apples = apples + berries;//a=9
        berries = apples - berries;//9-4=5 therefore b=5
        apples = apples - berries; //9-5=4, therefore a=4
        System.out.println("apples= " + apples + " berries=" + berries);


    }
}