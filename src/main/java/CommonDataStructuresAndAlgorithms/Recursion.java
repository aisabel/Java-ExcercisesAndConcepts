package CommonDataStructuresAndAlgorithms;

public class Recursion {
/*
5
5+4
4+3
3+2
2+1
1
=15
 */
    public static int sum(int num){
        if(num ==1){
            return 1;
        } else {
            return num+sum(num-1);
        }
    }

    public static void main(String[] args) {
        int number =10;
        int result = sum(number);
        System.out.println("Sum of numbers from 1 to "+number+" is "+result);
    }
}
