package Concepts;

final class FinalsVariablesAndMethods {
    /* Final variables it means will not be changed to a different one
        *Any class can not alter that variable. It's a constant.
        *Methods and classes can be also defined as finals
        *When a class is set as final, then is not able to be used as inherit parent class.
        *When a method is set as final, it's not possible to override this method again.
        *'Final' is different to 'Finally' used in try-catch
     * * */

    //final method in any other class this is how is declared,
    // in this class is not necessary to declare as final since the whole class is final
    final void getData(){
        System.out.println("method can not be override");
    }

    public static void main(String [] args) {

        final int i=4; //constant variables
        //i=5;//Cannot assign a new value
    }
}
